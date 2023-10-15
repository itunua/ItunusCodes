# Drawing a shape
print("   /|")
print("  / |")
print(" /  |")
print("/___|")

# Variables & Data Types
print("There once was a man named George, ")
print("he was 70 years old. ")
print("He really liked the name George, ")
print("but didn't like being 70.")

'''
print("")

character_name = "John"
character_age = "35"
print("There once was a man named " + character_name + ", ")
print("he was " + character_age + " years old. ")

character_name = "Mike"
print("He really liked the name " + character_name + ", ")
print("but didn't like being " + character_age + ".")

print("")

# Working with strings
print("Giraffe Academy")
print("Giraffe\nAcademy")
print("Giraffe\"Academy")

print("")

phrase = "Giraffe Academy"
print(phrase + " is cool")
print(phrase.lower()) #lower case
print(phrase.upper()) #upper case
print(phrase.isupper()) #checks if the string value is all uppercase. will return false
print(phrase.upper().isupper()) #makes the sentence all uppercase and checks. Returns true
print(len(phrase)) # the lenth of the string
print(phrase[0]) # prints out the first character in the sentence
print(phrase.index("G")) # Find the position of the letter
print(phrase.index("Aca")) # shows where it starts
print(phrase.replace("Giraffe", "Elephant")) # Replaces part of the string

print("")

# Working with numbers

from math import *
my_num = 5
print(3 * 4 + 5)
print(str(my_num)) # Turns the number into a string
print(str(my_num) + " is my fav number")
print(pow(3,2)) #3 to the power of 2, so 9
print(max(4,6)) # prints highest num
print(min(4,6)) # prints lowest num
print(round(3.7)) # round the number
print(floor(3.2)) #rounds down always
print(ceil(3.7)) # round it up always
print(sqrt(36)) #find the square root

print("")

# Getting Input From Users
#name = input("Enter your name: ")
#age = input("Enter your age: ")
#print("Hello " + name + "!" + " You are " + age)

#Building a Basic Calculator
#num1 = input("Enter a number: ")
#num2 = input("Enter a number: ")
#results = num1 + num2
#print(results) # This prints out as a string, instead of adding the two numbers.

#num3 = input("Enter a number: ")
#num4 = input("Enter a number: ")
#results1 = int(num3) + int(num4) #this converts the numbers from a string to integer. doesn't work with decimals
#print(results1)

#num5 = input("Enter a number: ")
#num6 = input("Enter a number: ")
#results2 = float(num5) + float(num5) #floats allow decimal numbers
#print(results2)

#Mad Libs Game
#colour = input("Enter a colour: ")
#plural = input("Enter a plural: ")
#name = input("Enter a name: ")

#print("Roses are " + colour)
#print(plural + " are blue")
#print("I love " + name)

'''
# list; it's used to organise the structure
friends = ["Kevin", "Karen", "Jim, Itunu", "Jade", "Jade", "Jade"]
print(friends)
print("")
print(friends[1]) #prints the list with the 1st index
print(friends[-1]) #starts with the index from the back
print(friends[1:3]) #grabs index 1-3

print("")

#List functions
blessed_numbers = [4, 8, 9, 10, 36, 23, 67]
friends.extend(blessed_numbers) #adds two list together
friends.append("Creed") #adds name to end of list
friends.insert(1, "Kelly") #adds to the first indexprint(friends[-1])
#friends.remove ("Jim") #removes Jim
#friends.clear() #clears list
friends.pop #gets rid of the last element in the list
#friends.sort()
blessed_numbers.sort() #lowest to highest
blessed_numbers.reverse() #highest to lowest
#print(friends.index("Kevin")) #shows the index Kevin number is in
#print(friends.count("Jade"))
#print(friends)
#print(blessed_numbers)

# Tuples - they're immutable so they can't be changed or modified
# Used for data that will never change, e.g months in a year
coordinates = (4, 5)
print(coordinates[1]) #prints out 5 because its the 1st index from 5

print("")

# List Functions, it's a collection of code that does a task.
# use the keyword def so that python would know we're using a function
def say_hi(name, age):
    print("Hello User " + name + "you are " + str(age)) #numbers such as age always have to be converted to a string

print("Top")
say_hi("Itunu ", 25)
print("Bottom")

# Return Statements; returns info from a function
def cube(num) :
    return num*num*num # The return statement prints a value

print(cube(3))
result7 = cube(4)
print(result7)
'''
# If statements; allows programme to respond to the data
is_male = False
is_tall = True

if is_male or is_tall: #OR
    print("You are a male or tall  or both")
else:
    print("You are a female or short or both")

'''
print("")

iss_male = False
iss_tall = False

if iss_male and iss_tall: #AND
    print("You are a male or tall  or both")
elif iss_male and not (iss_tall):
    print("You are a short male")
elif not (iss_male) and iss_tall:
    print("You are a tall woman")
else:
    print("You are not male and not tall")

# if statements and comparisons

def max_num(number1, number2, number3):
    if number1 >= number2 and number1 >= number3:
        return number1
    elif number2 >= number1 and number2 >= number3:
        return number2
    else:
        return number3
print(max_num(3, 44, 223))

# Building a better Calculator
'''
numb1 = float(input("Enter first number: ")) # float converts the string into a number
op = input("Enter operator: ")
numb2 = float(input("Enter second number: "))

if op == "+":
    print(numb1 + numb2)
elif op == "-":
    print(numb1 - numb2)
elif op == "/":
    print(numb1 / numb2)
elif op == "*":
    print(numb1 * numb2)
else:
    print("Invalid operator")


# Dictionaries
monthConversions = {
    "Jan" : "January",
    "Feb" : "February",
    "Mar" : "March",
    "Apr" : "April",
    "May" : "May",
    "Jun" : "June",
    "Jul" : "July",
    "Aug" : "August",
    "Sept": "September",
    "Oct" : "October",
    "Nov" : "November",
    "Dec" : "December"
}

print(monthConversions["Dec"])
print(monthConversions.get("Jun"))
print(monthConversions.get("luv")) #prints none
print(monthConversions.get("oop", "Not a valid key")) #"Not a valid key"

print("")

# While loop; a structure in python that loops through a code until a condition is false
i = 1
while i <= 10:
    print(i)
    i += 1 #adds one each time, so i is 2,3...10
print("Done with loop") #once it gets to 11, it prints this

# Building a guessing game

secret_word = "giraffe"
guess = ""
guess_count = 0
guess_limit = 3
out_of_guesses = False # True means they have no more guesses, false means they ran out

while guess != secret_word and not (out_of_guesses): # != means not equal to
    if guess_count < guess_limit:
           guess = input("Guess word: ")
           guess_count += 1
    else:
        out_of_guesses = True

if out_of_guesses:
    print("Out of guesses, you LOSE haha ")
else:
    print("You WIN!!!")
'''

# For loop; loops over different collections

for letter in "Giraffe Academy": # to start a for loop you use 'for'
    print (letter) # prints it out letter by letter in diff lines

print("")

for index in range(10): # variable after 'for' could be anything
    print(index)

print("")

for index in range(3, 10): # prints numbers from 3 to 10
    print(index)

friendss = ["Itunu", "Rhoda", "Rufaro", "Feyi"]
for name in friendss: # variable after 'for' could be anything
    print(name)

for index in range(len(friendss)): # prints numbers from 3 to 10
    print(friendss[index])

for index in range(5):
    if index == 0:
        print("first iteration")
    else:
        print("Not first")

# Exponent Function
def raise_to_power (base_num, pow_num):
    resultt = 1
    for index in range(pow_num): #loops through range of numbers
        resultt = resultt * base_num
    return resultt

print(raise_to_power(2,3))

# 2D Lists & Nested Loops

numb_grid = [ # a list
    [1,2,3],
    [4,5,6],
    [7,8,9],
    [0]
]
print(numb_grid[0][1]) #row 0, column 1. prints out 2

for row in numb_grid:
    print(row) # prints grid as it is

for row in numb_grid:
    for col in row:
        print(col) # prints the rows in the grid

# Functional Programming
