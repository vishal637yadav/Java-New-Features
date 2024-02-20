package com.sourcecode.java8.functionalinterface.function;

// importing Function interface

import java.util.function.Function;

public class FunctionInterfaceExample1 {

    static String show(String message) {
        return "Hello " + message;
    }

    public static void main(String[] args) {
        // Function interface referring to a method
        Function<String, String> fun = FunctionInterfaceExample1::show;
        // Calling Function interface method
        System.out.println(fun.apply("Peter"));
    }
}
