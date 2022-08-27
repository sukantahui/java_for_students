<div align="center">
  <h1> Java tokens, CODER</h1>
  <a class="header-badge" target="_blank" href="https://www.linkedin.com/in/sukantahui/">
  <img src="https://img.shields.io/badge/style--5eba00.svg?label=LinkedIn&logo=linkedin&style=social">
  </a>
  <a class="header-badge" target="_blank" href="https://twitter.com/sukantahui">
  <img alt="Twitter Follow" src="https://img.shields.io/twitter/follow/sukantahui?style=social">
  </a>

<sub>Author:
<a href="https://www.linkedin.com/in/sukantahui/" target="_blank">Sukanta Hui</a><br>
<small> Second Edition: July, 2021</small>
</sub>

</div>

[<<Home](../readme.md) | [Day 3 >>](../03_Day_Operators/03_operators.md)

![30DaysOfPython](../images/java_banner3@2x.png)

- [📘 Java Tokens](#-java-tokens)
  - [Keywords](#keywords)
  - [Identifiers](#identifiers)
  - [Literals](#literals)
  - [Checking Data types and Casting](#checking-data-types-and-casting)
  - [Numbers](#numbers)
  - [💻 Exercises - Day 2](#-exercises---day-2)
    - [Exercises: Level 1](#exercises-level-1)
    - [Exercises: Level 2](#exercises-level-2)

# 📘 Java Tokens

## Keywords

Keywords are pre-defined or reserved words in a programming language. Each keyword is meant to perform a specific function in a program. Since keywords are referred names for a compiler, they can’t be used as variable names because by doing so, we are trying to assign a new meaning to the keyword which is not allowed. Java language supports following keywords: 
[Check our website](https://eduvenv.in/#/courseContent).
```shell
abstract     assert      boolean      
break        byte        case
catch        char        class        
const        continue    default
do           double      else         
enum         exports     extends
final        finally     float        
for          goto        if
implements   import      instanceof   
int          interface   long
module       native      new          
open         opens       package
private      protected   provides     
public       requires    return
short        static      strictfp     
super        switch      synchronized
this         throw       throws       
to           transient   transitive
try          uses        void         
volatile     while       with  
```

## Identifiers

Identifiers are used as the general terminology for naming of variables, functions and arrays. These are user-defined names consisting of an arbitrarily long sequence of letters and digits with either a letter or the underscore(_) as a first character. Identifier names must differ in spelling and case from any keywords. You cannot use keywords as identifiers; they are reserved for special use. Once declared, you can use the identifier in later program statements to refer to the associated value. A special kind of identifier, called a statement label, can be used in goto statements.

  - The first letter of an identifier must be a letter, underscore or a dollar sign. It cannot start with digits but may contain digits.
  - The whitespace cannot be included in the identifier.
  - Identifiers are case sensitive.


Examples of valid identifiers :

```shell
PhoneNumber  
PRICE  
radius  
a  
a1  
_phonenumber  
$circumference  
jagged_array  
12radius   //invalid  
```
## Literals

In programming literal is a notation that represents a fixed value (constant) in the source code. It can be categorized as an integer literal, string literal, Boolean literal, etc. It is defined by the programmer. Once it has been defined cannot be changed. Java provides five types of literals are as follows:

  -  Integer
  -  Floating Point
  -  Character
  -  String
  -  Boolean


## Checking Data types and Casting

- Check Data types: To check the data type of certain data/variable we use the _type_
  **Example:**

```py
# Different python data types
# Let's declare variables with various data types

first_name = 'Sukanta'     # str
last_name = 'Hui'       # str
country = 'India'         # str
city= 'Barrackpore'            # str
age = 46                   # int, it is not my real age, don't worry about it

# Printing out types
print(type('CODER'))     # str
print(type(first_name))     # str
print(type(10))             # int
print(type(3.14))           # float
print(type(1 + 1j))         # complex
print(type(True))           # bool
print(type([1, 2, 3, 4]))     # list
print(type({'name':'Sukanta','age':46, 'is_married':True}))    # dict
print(type((1,2)))                                              # tuple
print(type(zip([1,2],[3,4])))                                   # set
```

- Casting: Converting one data type to another data type. We use _int()_, _float()_, _str()_, _list_, _set_
  When we do arithmetic operations string numbers should be first converted to int or float otherwise it will return an error. If we concatenate a number with a string, the number should be first converted to a string. We will talk about concatenation in String section.

  **Example:**

```py
# int to float
num_int = 10
print('num_int',num_int)         # 10
num_float = float(num_int)
print('num_float:', num_float)   # 10.0

# float to int
gravity = 9.81
print(int(gravity))             # 9

# int to str
num_int = 10
print(num_int)                  # 10
num_str = str(num_int)
print(num_str)                  # '10'

# str to int or float
num_str = '10.6'
print('num_int', int(num_str))      # 10
print('num_float', float(num_str))  # 10.6

# str to list
first_name = 'Sukanta'
print(first_name)               # 'Sukanta'
first_name_to_list = list(first_name)
print(first_name_to_list)            # ['A', 's', 'a', 'b', 'e', 'n', 'e', 'h']
```

## Numbers

Number data types in Python:

1. Integers: Integer(negative, zero and positive) numbers
   Example:
   ... -3, -2, -1, 0, 1, 2, 3 ...

2. Floating Point Numbers(Decimal numbers)
   Example:
   ... -3.5, -2.25, -1.0, 0.0, 1.1, 2.2, 3.5 ...

3. Complex Numbers
   Example:
   1 + j, 2 + 4j, 1 - 1j

🌕 You are awesome. You have just completed day 2 challenges and you are two steps ahead on your way to greatness. Now do some exercises for your brain and muscles.

## 💻 Exercises - Day 2

### Exercises: Level 1

1. Inside 30DaysOfPython create a folder called day_2. Inside this folder create a file named variables.py
2. Write a python comment saying 'Day 2: 30 Days of python programming'
3. Declare a first name variable and assign a value to it
4. Declare a last name variable and assign a value to it
5. Declare a full name variable and assign a value to it
6. Declare a country variable and assign a value to it
7. Declare a city variable and assign a value to it
8. Declare an age variable and assign a value to it
9. Declare a year variable and assign a value to it
10. Declare a variable is_married and assign a value to it
11. Declare a variable is_true and assign a value to it
12. Declare a variable is_light_on and assign a value to it
13. Declare multiple variable on one line

### Exercises: Level 2

1. Check the data type of all your variables using type() built-in function
1. Using the _len()_ built-in function, find the length of your first name
1. Compare the length of your first name and your last name
1. Declare 5 as num_one and 4 as num_two
    1. Add num_one and num_two and assign the value to a variable total
    2. Subtract num_two from num_one and assign the value to a variable diff
    3. Multiply num_two and num_one and assign the value to a variable product
    4. Divide num_one by num_two and assign the value to a variable division
    5. Use modulus division to find num_two divided by num_one and assign the value to a variable remainder
    6. Calculate num_one to the power of num_two and assign the value to a variable exp
    7. Find floor division of num_one by num_two and assign the value to a variable floor_division
1. The radius of a circle is 30 meters.
    1. Calculate the area of a circle and assign the value to a variable name of _area_of_circle_
    2. Calculate the circumference of a circle and assign the value to a variable name of _circum_of_circle_
    3. Take radius as user input and calculate the area.
1. Use the built-in input function to get first name, last name, country and age from a user and store the value to their corresponding variable names
1. Run help('keywords') in Python shell or in your file to check for the Python reserved words or keywords

🎉 CONGRATULATIONS ! 🎉

[<< Day 1](../readme.md) | [Day 3 >>](../03_Day_Operators/03_operators.md)
