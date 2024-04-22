package com.sourcecode.java11;

public class StringClassNewlyAddedMethod {

    public static void main(String[] args) {
        System.out.println("------Main Method-----");
        isBlank_methodDemo();

    }

    public static void isBlank_methodDemo(){
        System.out.println("---isBlank_methodDemo---");
        String s = "";
        System.out.println("s='' then s.isBlank() ="+s.isBlank());
        s = "      ";
        System.out.println("s='      ' then s.isBlank() ="+s.isBlank());
    }

    public static void lines_methodDemo(){
        System.out.println("---isBlank_methodDemo---");
        String s = "";
        System.out.println("s='' then s.isBlank() ="+s.lines());
        s = "      ";
        System.out.println("s='      ' then s.isBlank() ="+s.isBlank());
        s.strip();
    }

}
