create database challenge1;
use challenge1;


CREATE TABLE sales (
  customer_id VARCHAR(1),
  order_date DATE,
  product_id INTEGER
);

INSERT INTO sales
  (customer_id, order_date, product_id)
VALUES
  ('A', '2021-01-01', '1'),
  ('A', '2021-01-01', '2'),
  ('A', '2021-01-07', '2'),
  ('A', '2021-01-10', '3'),
  ('A', '2021-01-11', '3'),
  ('A', '2021-01-11', '3'),
  ('B', '2021-01-01', '2'),
  ('B', '2021-01-02', '2'),
  ('B', '2021-01-04', '1'),
  ('B', '2021-01-11', '1'),
  ('B', '2021-01-16', '3'),
  ('B', '2021-02-01', '3'),
  ('C', '2021-01-01', '3'),
  ('C', '2021-01-01', '3'),
  ('C', '2021-01-07', '3');
 
 select * from sales;

CREATE TABLE menu (
  product_id INTEGER,
  product_name VARCHAR(5),
  price INTEGER
);

INSERT INTO menu
  (product_id, product_name, price)
VALUES
  ('1', 'sushi', '10'),
  ('2', 'curry', '15'),
  ('3', 'ramen', '12');
  

CREATE TABLE members (
  customer_id VARCHAR(1),
  join_date DATE
);

INSERT INTO members
  (customer_id, join_date)
VALUES
  ('A', '2021-01-07'),
  ('B', '2021-01-09');
  
  show tables;
-- 1. What is the total amount each customer spent at the restaurant?
SELECT customer_id, SUM(price) AS total_amount
FROM sales
JOIN menu ON sales.product_id = menu.product_id
GROUP BY customer_id;

-- 2. How many days has each customer visited the restaurant?
SELECT customer_id, COUNT(DISTINCT order_date) AS days_visited
FROM sales
GROUP BY customer_id;

-- 3. What was the first item from the menu purchased by each customer?
SELECT customer_id, MIN(order_date) AS first_purchase_date, MIN(product_name) AS first_purchase_item
FROM sales
JOIN menu ON sales.product_id = menu.product_id
GROUP BY customer_id;

-- 4. What is the most purchased item on the menu and how many times was it purchased by all customers?
SELECT m.product_id, m.product_name, COUNT(s.product_id) AS purchase_count
FROM sales s
JOIN menu m ON s.product_id = m.product_id
GROUP BY m.product_id, m.product_name
ORDER BY purchase_count DESC
LIMIT 1; -- limits it to one row

-- 5. Which item was the most popular for each customer?
WITH ItemPopularity AS (
  SELECT s.customer_id, m.product_name, COUNT(s.product_id) AS purchase_count
  FROM sales s
  JOIN menu m ON s.product_id = m.product_id
  GROUP BY s.customer_id, m.product_name
)
SELECT customer_id, product_name AS most_popular_item
FROM (
  SELECT customer_id, product_name, purchase_count,
         ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY purchase_count DESC) AS rn
  FROM ItemPopularity
) ranked
WHERE rn = 1;

-- 6. Which item was purchased first by the customer after they became a member?
WITH MemberPurchases AS (
  SELECT s.customer_id, s.order_date, s.product_id, m.join_date
  FROM sales s
  JOIN members m ON s.customer_id = m.customer_id
)
SELECT customer_id, MIN(order_date) AS first_purchase_after_membership
FROM MemberPurchases
WHERE order_date > join_date
GROUP BY customer_id;

-- 7. Which item was purchased just before the customer became a member?
WITH MemberPurchases AS (
  SELECT s.customer_id, s.order_date, s.product_id, m.join_date
  FROM sales s
  JOIN members m ON s.customer_id = m.customer_id
)
SELECT customer_id, MAX(order_date) AS last_purchase_before_membership
FROM MemberPurchases
WHERE order_date < join_date
GROUP BY customer_id;

-- 8. What is the total items and amount spent for each member before they became a member?
WITH MemberPurchases AS (
  SELECT s.customer_id, s.product_id, s.order_date, m.join_date
  FROM sales s
  JOIN members m ON s.customer_id = m.customer_id
)
SELECT customer_id, COUNT(MemberPurchases.product_id) AS total_items_purchased, SUM(menu.price) AS total_amount_spent
FROM MemberPurchases
JOIN menu ON MemberPurchases.product_id = menu.product_id
WHERE order_date < join_date
GROUP BY customer_id;

-- 9.  If each $1 spent equates to 10 points and sushi has a 2x points multiplier - how many points would each customer have?
SELECT s.customer_id,
       SUM(CASE WHEN menu.product_name = 'sushi' THEN 20 ELSE 10 END * menu.price) AS total_points
FROM sales s
JOIN menu ON s.product_id = menu.product_id
GROUP BY s.customer_id;

-- 10. In the first week after a customer joins the program (including their join date) they earn 2x points on all items, 
-- not just sushi - how many points do customer A and B have at the end of January?
SELECT m.customer_id,
       SUM(
         CASE
           WHEN s.order_date >= m.join_date AND s.order_date < DATE_ADD(m.join_date, INTERVAL 7 DAY) THEN 2 * menu.price * 10
           ELSE menu.price * 10
         END
       ) AS total_points
FROM sales s
JOIN menu ON s.product_id = menu.product_id
JOIN members m ON s.customer_id = m.customer_id
WHERE s.order_date >= '2021-01-01' AND s.order_date <= '2021-01-31'
AND (s.order_date >= m.join_date OR s.order_date < DATE_ADD(m.join_date, INTERVAL 7 DAY))
GROUP BY m.customer_id;
