# Java Annotations

Java **Annotation** is a **tag** that represents the **metadata**( i.e. attached with class, interface, methods or fields) 
to indicate some **additional information** which can be **used by** **java compiler** and **JVM**.

> [!IMPORTANT]
> **Annotations** in Java are **used** to **provide additional information**,<br> so it is an **alternative option** for **XML** and **Java marker interfaces**.

## Annotations Types :
* Built-in Annotations 
* Custom Annotations.

## Built-In Java Annotations
There are several built-in annotations in Java. Some **annotations are applied** to **Java code** and **some to other annotations**.

### Built-In Java Annotations used in **Java code**
* @Override
* @SuppressWarnings
* @Deprecated

### Built-In Java Annotations used in **other annotations**
* @Target
* @Retention
* @Inherited
* @Documented

### Understanding Built-In Annotations
Let's understand the built-in annotations first.

1. @Override
**@Override** annotation **assures** that the **subclass method is overriding** the **parent class method**. 
_If it is not_ so, _**compile time error** occurs_.


Sometimes, we does the silly mistake such as spelling mistakes etc. 
So, it is better to mark @Override annotation that provides assurity that method is overridden.

      package com.sourcecode.java5.annotations;

      class Animal {
         void eatSomething() {
         System.out.println("eating something");
         }
      }
      
      class Dog extends Animal {
      
          @Override
          void eatsomething() {
              System.out.println("eating foods");
          }//should be eatSomething
      }
      
      public class TestAnnotation1 {
         public static void main(String args[]) {
            Animal a = new Dog();
            a.eatSomething();
         }
      }
  

### Output:
**Comple Time Error**<br>
Method does not override method from its superclass

2. @SuppressWarnings
**@SuppressWarnings** annotation: is **used** **to suppress warnings** _issued by_ **the compiler**.

         package com.sourcecode.java5.annotations;
         
         import java.util.*;
         
         public class TestAnnotation2 {
         
             @SuppressWarnings("unchecked")
             public static void main(String args[]) {
                 ArrayList list = new ArrayList();
                 list.add("sonoo");
                 list.add("vimal");
                 list.add("ratan");
         
                 for (Object obj : list)
                     System.out.println(obj);
         
             }
         }

### Without  @SuppressWarnings("unchecked") below warning are given by Compiler
It will show warning at compile time because we are using **non-generic collection**.<br>
**Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'<br>**

### With  @SuppressWarnings("unchecked") below warning are given by Compiler
Now no warning at compile time.

3. @Deprecated
**@Deprecated** annoation marks that **this method is deprecated** so **compiler prints warning**. 
It **informs user that** it **may be removed** in the **future versions**. 
So, it is better not to use such methods.

         package com.sourcecode.java5.annotations;
         
         class A {
            void m() {
               System.out.println("hello m");
            }
         
             @Deprecated
             void n() {
                 System.out.println("hello n");
             }
         }
         
         public class TestAnnotation3 {
            public static void main(String[] args) {
            
               A a = new A();
               a.m();
               a.n();
            }
         }

### At Compile Time:
Deprecated member 'n' is still used<br>
'n()' is deprecated<br>

Note: Test.java uses or overrides a deprecated API.<br>
Note: Recompile with -Xlint:deprecation for details.<br>

### At Runtime:
hello n<br>
hello m

## Java Custom Annotations / User-defined Annotations
The **@interface** element is used to declare an annotation. 
For example:
            
      @interface MyAnnotation{}  

Here, **MyAnnotation** is the **custom annotation name**.

>[IMPORTANT]
>Points to remember for java custom annotation signature :
>1. Method should not have any throws clauses
>2. Method should return one of the following: primitive data types, String, Class, enum or array of these data types. 
>3. Method should not have any parameter. 
>4. We should attach @ just before interface keyword to define annotation. 
>5. It may assign a default value to the method.

## Types of Annotation
There are **three types** of annotations.
1. Marker Annotation
2. Single-Value Annotation
3. Multi-Value Annotation

Java Annotation Types
1) **Marker Annotation :**
   An annotation that has **no method**, is called marker annotation. 
For example:
                  
         @interface MyAnnotation{}

The **@Override** and **@Deprecated** are **marker** annotations.

2) **Single-Value Annotation :**
   An annotation that **has one method**, is called single-value annotation. 
For example:

         @interface MyAnnotation {  
            int value();  
         }
We can provide the **default value also**. For example:

      @interface MyAnnotation {  
         int value() default 0;  
      }

## How to apply Single-Value Annotation
Let's see the code to apply the single value annotation.

      @MyAnnotation(value=10)  
The **value** can be anything.

3) **Multi-Value Annotation : **
  
An annotation that **has more than one method**, is called **Multi-Value** annotation. For example:

      @interface MyAnnotation {  
         int value1();  
         String value2();
         String value3();  
      }  
We can provide the **default value also**. For example:

      @interface MyAnnotation{  
         int value1() default 1;  
         String value2() default "";  
         String value3() default "xyz";  
      }  

## How to apply Multi-Value Annotation

Let's see the code to apply the multi-value annotation.

      @MyAnnotation(value1=10,value2="Arun Kumar",value3="Ghaziabad")

## Built-in Annotations used in custom annotations in java
* @Target
* @Retention
* @Inherited
* @Documented

### @Target

**@Target** tag is used to **specify at which type**, the annotation is used.

The **java.lang.annotation.ElementType** enum declares many constants to specify the type of element where annotation is to be 
applied such as **TYPE, METHOD, FIELD** etc. <br>Let's see the constants of ElementType enum:

|**Element Types**	|**Where the annotation can be applied**|
|TYPE|	class, interface or enumeration|
|FIELD|	fields|
|METHOD|	methods|
|CONSTRUCTOR|	constructors|
|LOCAL_VARIABLE|	local variables|
|ANNOTATION_TYPE|	annotation type|
|PARAMETER|	parameter|

### Example to specify annoation for a class
      @Target(ElementType.TYPE)  
      @interface MyAnnotation {  
         int value1();  
         String value2();  
      }  
### Example to specify annotation for a class, methods or fields
      @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
      @interface MyAnnotation{  
         int value1();  
         String value2();  
      }  

## @Retention
**@Retention** annotation is used to **specify to what level annotation** will be available.

|**RetentionPolicy**|	Availability|
|RetentionPolicy.SOURCE|	refers to the source code, discarded during compilation.<br> It will not be available in the compiled class.|
|RetentionPolicy.CLASS|	refers to the .class file, available to java compiler but not to JVM.<br> It is included in the class file.|
|RetentionPolicy.RUNTIME|	refers to the runtime, available to java compiler and JVM .|

### Example to specify the RetentionPolicy
      @Retention(RetentionPolicy.RUNTIME)  
      @Target(ElementType.TYPE)  
      @interface MyAnnotation{  
         int value1();  
         String value2();  
      }  
### Example of custom annotation: creating, applying and accessing annotation
Let's see the simple example of creating, applying and accessing annotation.

      package com.sourcecode.java5.annotations;
      
      import java.lang.annotation.*;
      import java.lang.reflect.*;
      
      //Creating annotation
      @Retention(RetentionPolicy.RUNTIME)
      @Target(ElementType.METHOD)
      @interface MyAnnotation {
         int value();
      }
      
      //Applying annotation
      class Hello {
         @MyAnnotation(value = 10)
         public void sayHello() {
            System.out.println("hello annotation");
         }
      }
      
      //Accessing annotation
      public class TestCustomAnnotation1 {
      
          public static void main(String[] args) throws Exception {
      
              Hello h = new Hello();
              Method m = h.getClass().getMethod("sayHello");
      
              MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
              System.out.println("value is: " + manno.value());
          }
      }

### Output:
value is: 10


## How built-in annotaions are used in real scenario?
In real scenario, java programmer only need to apply annotation. 
He/She doesn't need to create and access annotation. Creating and Accessing annotation is performed 
by the implementation provider. On behalf of the annotation, java compiler or JVM performs 
some additional operations.

## @Inherited
By default, annotations are not inherited to subclasses. 
The **@Inherited annotation** marks the **annotation to be inherited** to subclasses.

      @Inherited  
      @interface ForEveryone { }//Now it will be available to subclass also

      @interface ForEveryone { }  
      class Superclass{ }

      class Subclass extends Superclass{ }

## @Documented
The @Documented Marks the annotation for inclusion in the documentation.

