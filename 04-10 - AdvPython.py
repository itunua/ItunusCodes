#map, filter, zip and reduce
from functools import reduce

def multiply_by2(li):
    new_list = []
    for item in li:
        new_list.append (item*2)
    return new_list

print(multiply_by2([1,2,3]))

print("")

my_list = [1,2,3]
your_list =[10,20,30]
their_list = [5,4,3]

def multiply_by2(item):
    return item*2

def only_odd(item):
    return item % 2 != 0

def accumulator(acc, item):
    print(2, 1)
    return acc + item

print(list(map(multiply_by2, my_list)))
print(my_list)
print(list(zip(my_list, your_list, their_list))) #appends lists together using zip
print(reduce(accumulator, my_list, 0))
print(list(map(lambda item: item*2, my_list)))

#Lamba Expressions
lambda param: action(param)
def only_odd(item):""

def accumulator(acc, item):""

print(list(map(lambda item: item*2, my_list)))
print(my_list)

#square
new_list = list(map(lambda num: num**2, my_list))
print(new_list)

#List Sorting
a = [(0,2), (4,3), (10, -1), (9,9)]
a.sort(key = lambda x: x[1])
print(a)

#List, set, dictionary
#list
my_list1 = [char for char in 'hello']
my_list2 = [num for num in range (0,100)]
my_list3 = [num**2 for num in range (0,100)]
my_list4 = [num**2 for num in range (0,100) if num % 2 == 0]

print(my_list4)

#set
my_set1 = {char for char in 'hello'}
my_set2 = {num for num in range (0,100)}
my_set3 = {num**2 for num in range (0,100)}
my_set4 = {num**2 for num in range (0,100) if num % 2 == 0}

print(my_set4)

#dictionary
simp_dict = {
    'a' : 1,
    'b' : 2
}

my_dict = {num:num*2 for num in [1,2,3]}
print(my_dict)
