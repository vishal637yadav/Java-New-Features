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
