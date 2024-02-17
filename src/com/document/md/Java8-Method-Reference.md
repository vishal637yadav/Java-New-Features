# Java Method References
* **Method Reference** is used to **refer method** of **functional interface**. 
* It is **compact** and **easy** form of **lambda expression**. 
* Each time **when you are using lambda expression** to just referring a method, you **can replace** your **lambda expression** with **method reference**. 

## Types of Method References
**3 types of method references** in java:

1. Reference to a **static method**.
2. Reference to an **instance method**.
3. Reference to a **constructor**.

### Types of Java Method References
1) **Reference to a Static Method**<br>
We can refer to **static method defined** in **the class**. 

#### **Syntax**

    ContainingClass::staticMethodName

#### Example 1
In the following example, we have defined a functional interface and referring a static method to it's functional method say().

      package com.sourcecode.java8.methodreference;
      
      interface Sayable1 {
         void say();
      }
      
      public class MethodReference1 {
      
          public static void saySomething() {
              System.out.println("Hello, this is static method.");
          }
      
          public static void main(String[] args) {
      
              // Referring static method
              Sayable1 sayable = MethodReference1::saySomething;
              // Calling interface method
              sayable.say();
      
          }
      }

### Output:

Hello, this is static method.

### Example 2
In the following example, we are using predefined functional interface Runnable to refer static method.

      package com.sourcecode.java8.methodreference;
      
      public class MethodReference2 {
      
          public static void ThreadStatus() {
              System.out.println("Thread is running...");
          }
      
          public static void main(String[] args) {
              Thread t2 = new Thread(MethodReference2::ThreadStatus);
              t2.start();
          }
      
      }

### Output:

Thread is running...

### Example 3
You can also use predefined functional interface to refer methods. 
In the following example, we are using BiFunction interface and using it's apply() method.

      package com.sourcecode.java8.methodreference;
      
      import java.util.function.BiFunction;
      
      class Arithmetic3 {
      
          public static int add(int a, int b) {
              return a + b;
          }
      
      }
      
      public class MethodReference3 {
      
          public static void main(String[] args) {
      
              BiFunction<Integer, Integer, Integer> adder = Arithmetic3::add;
              int result = adder.apply(10, 20);
              System.out.println(result);
          }
      
      }

### Output:

30

### Example 4
You can also override static methods by referring methods. 
In the following example, we have defined and overloaded three add methods.

      package com.sourcecode.java8.methodreference;
      
      import java.util.function.BiFunction;
      
      class Arithmetic4 {
      
          public static int add(int a, int b) {
              return a + b;
          }
      
          public static float add(int a, float b) {
              return a + b;
          }
      
          public static float add(float a, float b) {
              return a + b;
          }
      }
      
      public class MethodReference4 {
      
          public static void main(String[] args) {
      
              BiFunction<Integer, Integer, Integer> adder1 = Arithmetic4::add;
              BiFunction<Integer, Float, Float> adder2 = Arithmetic4::add;
              BiFunction<Float, Float, Float> adder3 = Arithmetic4::add;
              int result1 = adder1.apply(10, 20);
              float result2 = adder2.apply(10, 20.0f);
              float result3 = adder3.apply(10.0f, 20.0f);
              System.out.println(result1);
              System.out.println(result2);
              System.out.println(result3);
          }
      
      }


### Output:

30<br>
30.0<br>
30.0<br>

## **2) Reference to an Instance Method**
We can refer **instance methods**. 
In the following example, we are describing the process of referring the instance method.

#### **Syntax**

      containingObject::instanceMethodName  
### Example 1
In the following example, we are referring non-static methods. You can refer methods by class object and anonymous object.

      package com.sourcecode.java8.methodreference;
      
      interface Sayable5 {
      void say();
      }
      
      public class InstanceMethodReference5 {
      
          public void saySomething() {
              System.out.println("Hello, this is non-static method.");
          }
      
          public static void main(String[] args) {
      
              InstanceMethodReference5 methodReference = new InstanceMethodReference5(); // Creating object
              // Referring non-static method using reference
              Sayable5 sayable = methodReference::saySomething;
              // Calling interface method
              sayable.say();
              // Referring non-static method using anonymous object
              Sayable5 sayable2 = new InstanceMethodReference5()::saySomething; // You can use anonymous object also
              // Calling interface method
              sayable2.say();
      
          }
      
      }

### Output:

Hello, this is non-static method.<br>
Hello, this is non-static method.<br>

### Example 2
In the following example, we are referring instance (non-static) method. 
Runnable interface contains only one abstract method. So, we can use it as functional interface.

      package com.sourcecode.java8.methodreference;
      
      public class InstanceMethodReference6 {
      
          public void printnMsg() {
              System.out.println("Hello, this is instance method");
          }
      
          public static void main(String[] args) {
      
              Thread t2 = new Thread(new InstanceMethodReference6()::printnMsg);
              t2.start();
      
          }
      }


### Output:

Hello, this is instance method
### Example 3
In the following example, we are using BiFunction interface. It is a predefined interface and contains a functional method apply(). Here, we are referring add method to apply method.

      package com.sourcecode.java8.methodreference;
      
      import java.util.function.BiFunction;
      
      class Arithmetic7 {
         public int add(int a, int b) {
            return a + b;
         }
      }
      
      public class InstanceMethodReference7 {
      
          public static void main(String[] args) {
              BiFunction<Integer, Integer, Integer> adder = new Arithmetic7()::add;
              int result = adder.apply(10, 20);
              System.out.println(result);
          }
      
      }

### Output:
30

## 3) Reference to a Constructor
   You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.

#### Syntax

      ClassName::new  

### Example

    package com.sourcecode.java8.methodreference;
    
    interface Messageable {
    Message getMessage(String msg);
    }
    
    class Message {
    
        Message(String msg) {
            System.out.print(msg);
        }
    
    }
    
    public class ConstructorReference8 {
    
        public static void main(String[] args) {
            Messageable hello = Message::new;
            hello.getMessage("Hello");
        }
    
    }

### Output:

Hello
---
[**Next Topic :** Java 8 Functional Interfaces]()
