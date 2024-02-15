# Autoboxing and Unboxing:


>[!NOTE:]
> Boxing : Defination
>The conversion of **primitive data types** into its _equivalent_ **Wrapper type** is known as boxing


>[!NOTE:]
> Unboxing : Defination
>The conversion of **Wrapper type** into its _equivalent_ **primitive data types** is known as Unboxing



>[!NOTE:]
> AutoBoxing : Defination
>The **automatic** conversion of **primitive data types** into its _equivalent_ **Wrapper type** is known as boxing

 java programmer doesn't need to write the conversion code.

## Advantage of Autoboxing and Unboxing:
* **No need** of **conversion** between **primitives** and **Wrappers manually** so **less coding** is required.

## Simple Example of Autoboxing in java:

      package com.sourcecode.java5.autoboxing;
      
      public class BoxingExample1 {
      
          public static void main(String args[]) {
              int a = 50;
              //noinspection removal
              Integer a2 = new Integer(a);//Boxing
      
              Integer a3 = 5;//Boxing
      
              System.out.println(a2 + " " + a3);
          }
      
      }


### Output:
50 5

## Simple Example of Unboxing in java:

The **automatic conversion of wrapper class type** into **corresponding primitive type**, is known as **Unboxing**. 
      
      package com.sourcecode.java5.autoboxing;
      
      public class UnboxingExample1 {
      
          public static void main(String args[]) {
              //Integer i = Integer(50);
              Integer i = Integer.valueOf(50);
              //Unboxing
              int a = i;
              System.out.println(a);
          }
      
      }


### Output:
50

## Autoboxing and Unboxing with **Comparison Operators**
**Autoboxing** can be performed with **comparison operators**. 

### Unboxing Example with Comparison Operation
      package com.sourcecode.java5.autoboxing;
      
      public class UnboxingExample2 {
      
          public static void main(String args[]) {
              Integer i = new Integer(50);
      
              if (i < 100) {            //unboxing internally
                  System.out.println(i);
              }
          }
      }

#### Output:
50

## Autoboxing and Unboxing with **Method Overloading**
In method overloading, **boxing** and **unboxing** can be **performed**. 
There are some rules for method overloading with boxing:
* Widening beats boxing
* Widening beats varargs
* Boxing beats varargs

### 1) Example of Autoboxing where widening beats boxing
   If there is possibility of widening and boxing, widening beats boxing.

      package com.sourcecode.java5.autoboxing;
      
      public class Boxing1 {
      
          static void m(int i) {
              System.out.println("int");
          }
      
          static void m(Integer i) {
              System.out.println("Integer");
          }
      
          public static void main(String args[]) {
              short s = 30;
              m(s);
          }
      
      }

### Output:
int

### 2) Example of Autoboxing where widening beats varargs
   If there is possibility of widening and varargs, widening beats var-args.

      package com.sourcecode.java5.autoboxing;
      
      public class Boxing2 {
      
          static void m(int i, int i2) {
              System.out.println("int int");
          }
      
          static void m(Integer... i) {
              System.out.println("Integer...");
          }
      
          public static void main(String args[]) {
              short s1 = 30, s2 = 40;
              m(s1, s2);
          }
      
      }

### Output:
int int
3) 
### 4) Example of Autoboxing where boxing beats varargs
   Let's see the program where boxing beats variable argument:

    package com.sourcecode.java5.autoboxing;
    
    public class Boxing3 {
    
        static void m(Integer i) {
            System.out.println("Integer");
        }
    
        static void m(Integer... i) {
            System.out.println("Integer...");
        }
    
        public static void main(String args[]) {
            int a = 30;
            m(a);
        }
    
    }


### Output:
Integer

### Method overloading with Widening and Boxing
Widening and Boxing can't be performed as given below:

package com.sourcecode.java5.autoboxing;

    public class Boxing4 {
    
        static void m(Long l) {
            System.out.println("Long");
        }
    
        public static void main(String args[]) {
            int a = 30;
            m(a);
        }
    
    }

### Output:
Compile Time Error<br>
C:\JavaNewFeatures\src\com\sourcecode\java5\autoboxing\Boxing4.java:11:11<br>
java: incompatible types: int cannot be converted to java.lang.Long<br>

---