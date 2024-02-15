package com.sourcecode.java5.annotations;

class A {
    void m() {
        System.out.println("hello m");
    }

    @Deprecated
    void n() {
        System.out.println("hello n");
    }
}

public class TestAnnotation3 {
    public static void main(String[] args) {

        A a = new A();
        a.n();
        a.m();
    }
}