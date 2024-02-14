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