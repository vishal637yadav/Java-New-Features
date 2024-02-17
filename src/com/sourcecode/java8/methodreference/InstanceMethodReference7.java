package com.sourcecode.java8.methodreference;

import java.util.function.BiFunction;

class Arithmetic7 {
    public int add(int a, int b) {
        return a + b;
    }
}

public class InstanceMethodReference7 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new Arithmetic7()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }

}
