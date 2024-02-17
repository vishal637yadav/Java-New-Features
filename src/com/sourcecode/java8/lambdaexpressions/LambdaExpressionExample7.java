package com.sourcecode.java8.lambdaexpressions;

import java.util.List;
import java.util.ArrayList;

public class LambdaExpressionExample7 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        //forEach Loop
        list.forEach((n) -> System.out.println(n));

    }
}
