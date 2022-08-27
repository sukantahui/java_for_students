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
  - [Operators](#operators)
  - [Separator](#separator)
  - [Comments](#comments)
  


  




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


## Operators

Operators: In programming, operators are the special symbol that tells the compiler to perform a special operation. Java provides different types of operators that can be classified according to the functionality they provide. There are eight types of operators in Java, are as follows:
  - Arithmetic Operators
  - Assignment Operators
  - Relational Operators
  - Unary Operators
  - Logical Operators
  - Ternary Operators
  - Bitwise Operators
  - Shift Operators
  
|Operator     |                     Symbols                               |
|-------------|:---------------------------------------------------------:|
| Arithmetic  |  + , - , / , * , %                                        |
| Unary       |  ++ , - - , !                                             |
| Assignment  |  = , += , -= , *= , /= , %= , ^=                          |
| Relational  | ==, != , < , >, <= , >=                                   |
| Logical     | && , ||                                                   |
| Ternary     | (Condition) ? (Statement1) : (Statement2);                |
| Bitwise     | & , | , ^ , ~                                             |
| Shift       | << , >> , >>>                                             |

## Separator
Separators: The separators in Java is also known as punctuators. There are nine separators in Java, are as follows:
  - Square Brackets []: It is used to define array elements. A pair of square brackets represents the single-dimensional array, two pairs of square brackets represent the two-dimensional array.
  - Parentheses (): It is used to call the functions and parsing the parameters.
  - Curly Braces {}: The curly braces denote the starting and ending of a code block.
  - Comma (,): It is used to separate two values, statements, and parameters.
  - Assignment Operator (=): It is used to assign a variable and constant.
  - Semicolon (;): It is the symbol that can be found at end of the statements. It separates the two statements.
  - Period (.): It separates the package name form the sub-packages and class. It also separates a variable or method from a reference variable.

## Comments

Comments: Comments allow us to specify information about the program inside our Java code. Java compiler recognizes these comments as tokens but excludes it form further processing. The Java compiler treats comments as whitespaces. Java provides the following two types of comments:

 - **Line Oriented:** It begins with a pair of forwarding slashes (//).
 - **Block-Oriented:** It begins with /* and continues until it founds */.



🎉 CONGRATULATIONS ! 🎉

[<< Home](../readme.md) | [Day 3 >>](../03_Day_Operators/03_operators.md)
