package com.sourcecode.java8.lambdaexpressions;

@FunctionalInterface  //It is optional
interface Drawables {
    public void draw();
}

public class LambdaExpressionExample2 {
    
    public static void main(String[] args) {
        int width = 10;

        //with lambda
        Drawables d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
