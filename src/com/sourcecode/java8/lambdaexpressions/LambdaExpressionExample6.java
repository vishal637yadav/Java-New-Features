package com.sourcecode.java8.lambdaexpressions;

interface Addable6 {
    int add(int a, int b);
}

public class LambdaExpressionExample6 {

    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable6 ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable6 ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }

}
