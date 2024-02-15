package com.sourcecode.java5.annotations;

class Animal {
    void eatSomething() {
        System.out.println("eating something");
    }
}

class Dog extends Animal {
    //Uncommenting below line will give compile time error as method not overriden due to spelling miss-take of method name.
    //@Override
    void eatsomething() {
        System.out.println("eating foods");
    }//should be eatSomething
}

public class TestAnnotation1 {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.eatSomething();
    }
}
