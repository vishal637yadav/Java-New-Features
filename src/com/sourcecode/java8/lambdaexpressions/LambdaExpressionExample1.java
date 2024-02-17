package com.sourcecode.java8.lambdaexpressions;

// Without Lambda Expression Example

interface Drawable {
    public void draw();
}

public class LambdaExpressionExample1 {

    public static void main(String[] args) {
        int width = 10;
        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
