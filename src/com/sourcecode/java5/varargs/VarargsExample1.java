package com.sourcecode.java5.varargs;

public class VarargsExample1 {

    static void display(String... values) {
        System.out.println("display method invoked ");
    }

    public static void main(String[] args) {
        display();  // zero argument
        display("my", "name", "is", "varargs"); // four arguments
        display("I", "am", "Vishal", "from", "Pune", "using", "varargs"); // seven arguments

    }

}
