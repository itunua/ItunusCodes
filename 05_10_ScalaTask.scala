package org.itc.com

object RealScalaClass {
  def main(args: Array[String]): Unit = {
    val name = "Itunu"
    val age = 25
    println(name + " is " + age + " years old")
    println(s"$name is $age years old") //turns it into string
    println(f"$name%s is $age%f years old") //allows decimals
    println(s"Hello \nworld")
    println(raw"Hello \nworld")
  }

}

object Demo {
  def main(args: Array[String]) {
    val x = 20;
    var res = ""

    if (x == 20) {
      res = "x == 20";
    } else {
      res = "x I= 20";
    }

    println(res);
    val res2 = if (x == 20) "x == 20" else "x !=20";
  }
}

object Demo1 {
  def main(args: Array[String]) {
    var x = 0;

    while (x < 10) {
      println("x = "+ x);
      x +=1; //x = x+1
    }

    var y =0;
    do {
      println("y = " + y);
      y +=1;
    } while (y < 10);
  }
}

//For Loops in Scala
object Demo2 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println("i using to " + i);
    }
    for (i <- 1 until 6) {
      println("i using until" + 1);
    }
    for (i <- 1 until 9; j <- 1 to 3) {
      println("i using until" + i + " ", +j);
    }
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 77);
    for (i <- lst) {
      println("i using to " + i);
    }

    for (i <- lst; if i < 6) {
      println("i using Filters " + i);
    }

    val results = for {
      i <- lst
      if i < 6
    } yield {
      i * i
    }
  }
}

//Scala Match Expressions
object Demo3 {
  def main(args: Array[String]) {
    val age = "50";

    age match {
      case "20" => age;
      case "18" => age;
      case "30" => age;
      case "50" => age;
      case "40" => age;

      case _ => println("default")
    }

    val result = age match {
      case "20" => age;
      case "18" => age;
      case "30" => age;
      case "50" => age;
      case "40" => age;

      case _ => "default";
    }
    println("result = "+result);
    val i = 6;
    i match {
      case 1|3|7|9 => println("odd");
      case 2|4|6|8 => println("even");
    }
  }
}

// Functions in Scala
object Demo4 {
  def add(x : Int, y : Int) : Int = {
    return x + y;
  }

  def sub(x: Int, y: Int): Int = {
    return x - y;
  }

  def multi(x: Int, y: Int): Int = {
    return x * y;
  }

  def divide(x: Int, y: Int): Int = {
    return x / y;
  }
  def main(args: Array[String]): Unit = {
    //println(Math.add(45, 15));
    println(add(45, 15));
    println(sub(45, 15));
    println(multi(45, 15));
    println(divide(45, 15));
  }
}

// Anonymous Functions + Default Values Function + more
object Demo5 {
  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def square(x: Int) = x * x;
  }

  def main(args: Array[String]): Unit = {
    println(Math.add(45,15));
    println(Math square 3)
  }
}

//Scala - Higher - Order Functions
object Demo6 {
  def math(x: Double, y:Double, z:Double, f:(Double, Double) => Double) : Double = f(f(x,y), z);

 def main(args: Array[String]) {
  val result = math(50,20,10, _+_);
  println(result);

 }
}

//Scala - Partially Applied Functions
import java.util.Date
object Demo7 {
  def log(date: Date, message: String) = {
    println(date + " " + message);
  }

  def main(args: Array[String]) {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _: Int, _: Int)
    println(f(100, 200));

    val date = new Date;
    val newLog = log(date, _: String);
    newLog("The message 1");
    newLog("The message 2");
    newLog("The message 3");
    newLog("The message 4");
  }
}

// Scala - Closure
import java.util.Date
object Demo8 {
  val number = 10;
  val add = (x : Int) => {
    x + number;
  }

  def main(args: Array[String]) {
    println(add(20));
    println(number)
  }
}

//Currying in Scala
object Demo9 {
  def add(x:Int, y:Int) = x+y
  def add2 (x : Int) = (y : Int) => x+y;
  def add3 (x : Int) (y : Int) = x+y;
  def main(args: Array[String]): Unit = {
    println(add(20,10));
    println(add2(20),(10));
    val sum40 = add2(40);
    println(sum40(50));
    println(add3(100)(200));
    val sum50 = add3(50)_;
    println(sum50(400))

  }
}

// String
object Demo10 {
  val num1 =75;
  val num2 = 100.25;
  val str1 : String = "Hello World";
  val str2 : String = "Max";
  def main(args: Array[String]): Unit = {
    println(str1.length());
    println(str1.concat(str2));
    println(str1+str2);

    val result = printf("(%d -- %f -- %s)", num1, num2, str1);
    println(result);
    println("(%d -- %f -- %s)".format(num1, num2, str1));
    printf("(%d -- %f -- %s)", num1, num2, str1);
  }
}

// Arrays; Mutable
object Demo11 {
  val myarray: Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);
  def main(args: Array[String]): Unit = {
    myarray(0) =20;
    myarray(1) =50;
    myarray(2) =10;
    myarray(3) =30;
    println(myarray);
    for (x <- myarray){
    println(x);
    }

  for (i <- 0 to (myarray.length - 1)) {
    println(myarray(i));
    }
  }
}

// Lists; Immutable
object Demo12 {
  val mylist: List[Int] = List(1,2,3,4,6,9);
  val names: List[String] = List("Max", "Tom", "John");
  def main(args: Array[String]): Unit = {
    println(0 :: mylist);
    println(mylist);
    println(names);
    println(1 :: 5 ::9 :: Nil);
    println(mylist.head);
    println(mylist.tail);
    println(names.tail);
    println(names.isEmpty);
    println(mylist.reverse);
    println(List.fill(5)(2));
    println(mylist.max)

    mylist.foreach( println )
    var sum : Int = 0;
    mylist.foreach(sum += _);
    println(sum);

    for (name <- names) {
      println(name);
    }
    println(names(0));
  }
}

//Sets
object Demo13 {
  val myset: Set[Int] = Set(1, 2, 5, 8, 9, 6, 4);
  val myset2: Set[Int] = Set(4, 2, 9, 18, 19, 16, 14);
  val names: Set[String] = Set("Max", "Tom", "John")
  def main(args: Array[String]) {
    println(myset + 10);
    println(names("Maxxxx"));
    println(myset.head);
    println(myset.tail);
    println(myset.isEmpty);
    println(myset ++ myset2);
    println(myset.++(myset2))
    println(myset.&(myset2));
    println(myset.intersect(myset2));
    println(myset.max);
    println(myset.min);
    myset.foreach(println);
    for (name <- names) {
      println(name);
    }
  }
}

//Maps
object Demo14 {
  val mymap: Map[Int, String] =
    Map(801 -> "max", 802 -> "'Tom", 804 -> "July");
  val mymap2: Map[Int, String] =
    Map(805 -> "lua");

  def main(args: Array[String]) {
    println(mymap);
    println(mymap(801));
    println(mymap.keys);
    println(mymap.values);
    println(mymap.isEmpty);

    mymap.keys.foreach { key =>
      println("key" + key);
      println("Value" + mymap(key));
    }
    println(mymap.contains(801000));
    println(mymap ++ mymap2);
    println(mymap.size);
  }
}

// Tuples
object Demo15 {
  val mytuple = (1, 2, "hello", true);
  val mytuple2 = new Tuple3(1, 2, "hello");
  val mytuple3 = new Tuple3(1, "hello", (2, 3));

  def main(args: Array[String]) {
    println(mytuple._1);
    println(mytuple._2);
    println(mytuple._3);
    println(mytuple._4);
    println(mytuple2._3);

    mytuple.productIterator.foreach {
      i =>println(i);
    }

    println(1 -> "Tom" -> true);
    println(mytuple3._3._2);
  }
}

//Scala - Options
object Demo16 {
  val lst = List(1, 2, 3);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  val opt: Option[Int] = Some(55);

  def main(args: Array[String]) {
    println(lst.find(_ > 2).getOrElse(0));
    println(map.get(5).getOrElse("No name found"));
    println(opt.isEmpty)
    println(opt.get)
  }
}

//Scala - Map and filter
object Demo17 {
  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")

  def main(args: Array[String]) {
    println(lst.map(x => x / 0.2));
    println(lst.map(x => "hi" * x));
    println(mymap.mapValues(x => "hi " + x));
    println("hello".map(_.toUpper));
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten);
    println(lst.flatMap(x => List(x, x + 1)))
  }
}

//Reduce, fold or scan
object Demo18 {
  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val lst2 = List("A", "B", "C");

  def main(args: Array[String]) {
    println(lst.reduceLeft(_ + _));
    println(lst2.reduceLeft(_ + _));
    println(lst.reduceLeft((x, y) => {
      println(x + " , " + y);
      x + y;
    }));

    println(lst.reduceLeft(_ - _));
    println(lst.reduceRight(_ - _));
    println(lst.reduceRight((x, y) => {
      println(x + " , " + y);
      x - y;
    }));

    println(lst.foldLeft(100)(_ + _));
    println(lst2.foldLeft("z")(_ + _));

    println(lst.scanLeft(100)(_ + _));
    println(lst2.scanLeft("z")(_ + _));
  }
}