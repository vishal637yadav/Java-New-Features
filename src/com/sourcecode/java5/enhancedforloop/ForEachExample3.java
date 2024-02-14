package com.sourcecode.java5.enhancedforloop;

import java.util.ArrayList;

public class ForEachExample3 {

    public static void main(String[] args) {
        //Creating a list of elements
        ArrayList<String> list = new ArrayList<>();
        list.add("vimal");
        list.add("sonoo");
        list.add("ratan");
        //traversing the list of elements using for-each loop
        for (String s : list) {
            System.out.println(s);
        }

    }

}
