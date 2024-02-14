# Variable Argument(Varargs)

* The **Variable Argument(varrags)** allows **_the method to accept_** **zero or multiple arguments**.
* Before **varargs** either we **use overloaded method** or take **an array as the method parameter** 
but it was **not considered good** because it leads to the **maintenance problem**. 
*
* 
>[!Note]
>**USE-CASE** :<br> 
>If we **don't know** how **many argument** we will have to **pass in the method**, varargs is the **better approach**.

##  Advantage of Varargs:
* We don't have to provide overloaded methods so less code.

## Syntax of varargs:
The varargs uses **ellipsis** i.e. **three dots** after the data type. 
        
    return_type method_name(data_type... variableName){}


## Example 1 : Varargs in java:

    package com.sourcecode.java5.varargs;
    
    public class VarargsExample1 {
    
        static void display(String... values) {
            System.out.println("display method invoked ");
        }
    
        public static void main(String args[]) {
            display();  // zero argument
            display("my", "name", "is", "varargs"); // four arguments
            display("I", "am", "Vishal", "from", "Pune", "using", "varargs"); // seven arguments
    
        }
    
    }


### Output:
display method invoked<br>
display method invoked<br>

## Example 2 : Program of Varargs in java:
    package com.sourcecode.java5.varargs;
    
    public class VarargsExample2 {
    
        static void display(String... values) {
            System.out.println("------display method invoked ------");
            for (String s : values) {
                System.out.println(s);
            }
        }
    
        public static void main(String[] args) {
            display();//zero argument
            display("hello");//one argument
            display("my", "name", "is", "varargs");//four arguments
            display("I", "am", "Vishal", "from", "Pune", "using", "varargs"); // seven arguments
    
        }
    }

### **Output:**
------display method invoked ------<br>
------display method invoked ------<br>
hello<br>
------display method invoked ------<br>
my<br>
name<br>
is<br>
varargs<br>
------display method invoked ------<br>
I<br>
am<br>
Vishal<br>
from<br>
Pune<br>
using<br>
varargs<br>

## Rules for varargs:
While **using the varargs**, you must follow **2 rules** otherwise program code **won't compile**. 

1. There can be **only one variable argument** in the **method**.
2. Variable argument **(varargs)** must be the **last argument**.


## Examples of varargs that fails to compile:

    void method(String... a, int... b){} //Compile time error
    
    void method(int... a, String b){}    //Compile time error

## Example of Varargs that is the last argument in the method:

    package com.sourcecode.java5.varargs;
    
    public class VarargsExample3 {
    
        static void display(int num, String... values) {
            System.out.println("number is " + num);
            for (String s : values) {
                System.out.println(s);
            }
        }
    
        public static void main(String args[]) {
    
            display(500, "hello");//one argument
            display(1000, "my", "name", "is", "varargs");//four arguments
        }
    }

### Output:
number is 500<br>
hello<br>
number is 1000<br>
my<br>
name<br>
is<br>
varargs<br>


---
