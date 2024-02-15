package com.sourcecode.java5.autoboxing;

public class UnboxingExample1 {

    public static void main(String args[]) {
        //Integer i = Integer(50);
        Integer i = Integer.valueOf(50);
        //Unboxing
        int a = i;
        System.out.println(a);
    }

}
