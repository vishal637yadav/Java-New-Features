## Static Import
* It (static import) facilitate the java programmer to **access any static member of a class directly**. 
* There is no need to qualify it by the class name.

## Advantage of static import:

* Less coding is required if you have access any static member of a class frequently.

## Disadvantage of static import:
* If you **overuse** the static import feature, it **makes the program unreadable** and **unmaintainable**.

## Example 1 : Simple Example of static import

    package com.sourcecode.java5.staticimport;
    
    import static java.lang.System.*;
    
    public class StaticImportExample {
        
        public static void main(String[] args) {
            out.println("Hello");
            //Now no need of System.out
            out.println("Java");
        }

    }


### Output:
Hello<br>
Java<br>

# What is the difference between import and static import?
The **import** _allows_ the java programmer to **access classes** of a package **without package qualification**<br> 
_whereas_<br> 
the **static import** feature _allows_ to **access the static members** of a class **without the class qualification**.

>[!Note]
>The **import** provides **accessibility** to **classes** and **interface** whereas **static import** provides **accessibility** 
to **static members** of the **class**.

---