package com.sourcecode.java8.lambdaexpressions;

interface Sayable4 {
    String say(String name);
}

public class LambdaExpressionExample4 {

    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable4 s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable4 s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
