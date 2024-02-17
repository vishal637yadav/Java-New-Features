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
