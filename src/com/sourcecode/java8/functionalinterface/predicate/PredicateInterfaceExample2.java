package com.sourcecode.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample2 {

    static Boolean checkAge(int age) {
        return age > 17;
    }

    public static void main(String[] args) {
        // Using Predicate interface
        Predicate<Integer> predicate = PredicateInterfaceExample2::checkAge;
        // Calling Predicate method
        boolean result = predicate.test(25);
        System.out.println(result);
    }

}
