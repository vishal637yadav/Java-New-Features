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
