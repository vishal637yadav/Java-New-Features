# Java Functional Interfaces / Single Abstract Method Interfaces (SAM)
* An Interface that contains **exactly** **one abstract method** is known as **functional interface**. 
* It can have any number of **default**, **static methods** but _can contain_ **only one abstract method**. 
* It _can also_ **declare methods** of **object class**.
* **Functional Interface** is also known as **Single Abstract Method Interfaces or SAM** Interfaces. 
* It is a new feature in Java, which helps to achieve **functional programming approach**.

### Example 1

    package com.sourcecode.java8.functionalinterface;
    
    @FunctionalInterface
    interface sayable1 {
        void say(String msg);
    }

    public class FunctionalInterfaceExample1 implements sayable1 {
    
        public void say(String msg) {
            System.out.println(msg);
        }
    
        public static void main(String[] args) {
            FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
            fie.say("Hello there");
        }
    
    }

### Output:

Hello there

>[!IMPORTANT]
>A functional interface can have **methods of object class**.

### Example 2

    package com.sourcecode.java8.functionalinterface;
    
    @FunctionalInterface
    interface sayable2 {
    
        void say(String msg);   // abstract method
    
        // It can contain any number of Object class methods.
        int hashCode();
    
        String toString();
    
        boolean equals(Object obj);
    }
    
    public class FunctionalInterfaceExample2 implements sayable2 {
    
        public void say(String msg) {
            System.out.println(msg);
        }
    
        public static void main(String[] args) {
            FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
            fie.say("Hello there");
        }
    
    }

### Output:

Hello there

## Invalid Functional Interface
A functional interface can **extends another interface** only when it **does not have any abstract method**.

    package com.sourcecode.java8.functionalinterface;
    
    @FunctionalInterface
    interface sayable {
    
        void say(String msg);   // abstract method
    
    }
    
    @FunctionalInterface
    interface Doable extends sayable {
    
        //methods from object class are allowed in functional interface.
        int hashCode();
        String toString();
        boolean equals(Object obj);
    
    }
    
    @FunctionalInterface
    public interface InValidFunctionalInterfaceExample extends sayable {
        
        // Invalid '@FunctionalInterface' annotation; InValidFunctionalInterfaceExample is not a functional interface
        // as now InValidFunctionalInterfaceExample have two abstract methods doIt() and say(String say);
        void doIt();

    }

### Output:
**compile-time error**<br>
Multiple non-overriding abstract methods found in interface com.sourcecode.java8.functionalinterface.Doable

### Example 3
In the following example, a functional interface is extending to a non-functional interface.

    package com.sourcecode.java8.functionalinterface;
    
    interface Doable3 {
        default void doIt() {
            System.out.println("Do it now");
        }
    }
    
    @FunctionalInterface
    interface Sayable3 extends Doable3 {
        void say(String msg);   // abstract method
    }
    
    public class FunctionalInterfaceExample3 implements Sayable3 {
    
        @Override
        public void say(String msg) {
            System.out.println(msg);
        }
    
        public static void main(String[] args) {
            FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
            fie.say("Hello there");
            fie.doIt();
        }
    
    }


### Output:

Hello there<br>
Do it now

## Java Predefined-Functional Interfaces
* Java provides **predefined functional** _interfaces_ to deal with functional programming by using 
**lambda** and **method references**.

* We can also define your own **custom** **functional interface**. 
* Java Predefined-Functional Interfaces are placed in package : **java.util.function package**.

## List of functional interface

| **Interface**                                                                                                                                        | **Description**                                                                                                             |
|------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| [BiConsumer<T,U>](https://github.com/vishal637yadav/JavaNewFeatures/blob/master/src/com/document/md/Java8-Functional-Interface-BiConsumer.md)                                                                                                                                  | 	It represents an operation that accepts two input arguments and returns no result.                                         | 
| Consumer<T>                                                                                                                                          | 	It represents an operation that accepts a single argument and returns no result.                                           | 
| Function<T,R>                                                                                                                                        | 	It represents a function that accepts one argument and returns a result.                                                   | 
| [Predicate<T>](https://github.com/vishal637yadav/JavaNewFeatures/blob/master/src/com/document/md/Java8-Functional-Interface-Predicate-Interface.md) | 	It represents a predicate (boolean-valued function) of one argument.                                                       | 
| BiFunction<T,U,R>                                                                                                                                    | 	It represents a function that accepts two arguments and returns a a result.                                                | 
| BinaryOperator<T>                                                                                                                                    | 	It represents an operation upon two operands of the same data type. It returns a result of the same type as the operands.  | 
| BiPredicate<T,U>                                                                                                                                     | 	It represents a predicate (boolean-valued function) of two arguments.                                                      | 
| BooleanSupplier                                                                                                                                      | 	It represents a supplier of boolean-valued results.                                                                        | 
| DoubleBinaryOperator                                                                                                                                 | 	It represents an operation upon two double type operands and returns a double type value.                                  | 
| DoubleConsumer                                                                                                                                       | 	It represents an operation that accepts a single double type argument and returns no result.                               | 
| DoubleFunction<R>                                                                                                                                    | 	It represents a function that accepts a double type argument and produces a result.                                        | 
| DoublePredicate                                                                                                                                      | 	It represents a predicate (boolean-valued function) of one double type argument.                                           | 
| DoubleSupplier                                                                                                                                       | 	It represents a supplier of double type results.                                                                           | 
| DoubleToIntFunction                                                                                                                                  | 	It represents a function that accepts a double type argument and produces an int type result.                              | 
| DoubleToLongFunction                                                                                                                                 | 	It represents a function that accepts a double type argument and produces a long type result.                              | 
| DoubleUnaryOperator                                                                                                                                  | 	It represents an operation on a single double type operand that produces a double type result.                             | 
| IntBinaryOperator                                                                                                                                    | 	It represents an operation upon two int type operands and returns an int type result.                                      | 
| IntConsumer                                                                                                                                          | 	It represents an operation that accepts a single integer argument and returns no result.                                   | 
| IntFunction<R>                                                                                                                                       | 	It represents a function that accepts an integer argument and returns a result.                                            | 
| IntPredicate                                                                                                                                         | 	It represents a predicate (boolean-valued function) of one integer argument.                                               | 
| IntSupplier                                                                                                                                          | 	It represents a supplier of integer type.                                                                                  | 
| IntToDoubleFunction                                                                                                                                  | 	It represents a function that accepts an integer argument and returns a double.                                            | 
| IntToLongFunction                                                                                                                                    | 	It represents a function that accepts an integer argument and returns a long.                                              | 
| IntUnaryOperator                                                                                                                                     | 	It represents an operation on a single integer operand that produces an integer result.                                    | 
| LongBinaryOperator                                                                                                                                   | 	It represents an operation upon two long type operands and returns a long type result.                                     | 
| LongConsumer                                                                                                                                         | 	It represents an operation that accepts a single long type argument and returns no result.                                 | 
| LongFunction<R>                                                                                                                                      | 	It represents a function that accepts a long type argument and returns a result.                                           | 
| LongPredicate                                                                                                                                        | 	It represents a predicate (boolean-valued function) of one long type argument.                                             | 
| LongSupplier                                                                                                                                         | 	It represents a supplier of long type results.                                                                             | 
| LongToDoubleFunction                                                                                                                                 | 	It represents a function that accepts a long type argument and returns a result of double type.                            | 
| LongToIntFunction                                                                                                                                    | 	It represents a function that accepts a long type argument and returns an integer result.                                  | 
| LongUnaryOperator                                                                                                                                    | 	It represents an operation on a single long type operand that returns a long type result.                                  | 
| ObjDoubleConsumer<T>                                                                                                                                 | 	It represents an operation that accepts an object and a double argument, and returns no result.                            | 
| ObjIntConsumer<T>                                                                                                                                    | 	It represents an operation that accepts an object and an integer argument. It does not return result.                      | 
| ObjLongConsumer<T>                                                                                                                                   | 	It represents an operation that accepts an object and a long argument, it returns no result.                               | 
| Supplier<T>                                                                                                                                          | 	It represents a supplier of results.                                                                                       | 
| ToDoubleBiFunction<T,U>                                                                                                                              | 	It represents a function that accepts two arguments and produces a double type result.                                     | 
| ToDoubleFunction<T>                                                                                                                                  | 	It represents a function that returns a double type result.                                                                | 
| ToIntBiFunction<T,U>                                                                                                                                 | 	It represents a function that accepts two arguments and returns an integer.                                                | 
| ToIntFunction<T>                                                                                                                                     | 	It represents a function that returns an integer.                                                                          | 
| ToLongBiFunction<T,U>                                                                                                                                | 	It represents a function that accepts two arguments and returns a result of long type.                                     | 
| ToLongFunction<T>                                                                                                                                    | 	It represents a function that returns a result of long type.                                                               | 
| UnaryOperator<T>                                                                                                                                     | 	It represents an operation on a single operand that returnsa a result of the same type as its operand.                     | 

### [Next TopicJava 8 Stream]()

