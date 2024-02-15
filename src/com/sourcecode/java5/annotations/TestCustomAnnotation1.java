package com.sourcecode.java5.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

//Creating annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    int value();
}

//Applying annotation
class Hello {
    @MyAnnotation(value = 10)
    public void sayHello() {
        System.out.println("hello annotation");
    }
}

//Accessing annotation
public class TestCustomAnnotation1 {

    public static void main(String[] args) throws Exception {

        Hello h = new Hello();
        Method m = h.getClass().getMethod("sayHello");

        MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: " + manno.value());
    }
}
