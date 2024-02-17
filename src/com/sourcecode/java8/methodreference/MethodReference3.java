package com.sourcecode.java8.methodreference;

import java.util.function.BiFunction;

class Arithmetic3 {

    public static int add(int a, int b) {
        return a + b;
    }

}

public class MethodReference3 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = Arithmetic3::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }

}
