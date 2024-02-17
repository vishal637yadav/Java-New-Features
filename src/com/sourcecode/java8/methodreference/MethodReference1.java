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
