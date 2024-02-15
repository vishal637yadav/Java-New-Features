package com.sourcecode.java5.autoboxing;

public class BoxingExample1 {

    public static void main(String args[]) {
        int a = 50;
        //noinspection removal
        Integer a2 = new Integer(a);//Boxing

        Integer a3 = 5;//Boxing

        System.out.println(a2 + " " + a3);
    }

}
