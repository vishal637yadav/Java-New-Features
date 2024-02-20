package com.sourcecode.java8.functionalinterface;

@FunctionalInterface
interface sayable {

    void say(String msg);   // abstract method

}

@FunctionalInterface
interface Doable extends sayable {

    //methods from object class are allowed in functional interface.
    int hashCode();
    String toString();
    boolean equals(Object obj);

}

@FunctionalInterface
public interface InValidFunctionalInterfaceExample extends sayable {
    // Invalid '@FunctionalInterface' annotation; InValidFunctionalInterfaceExample is not a functional interface
    // as now InValidFunctionalInterfaceExample have two abstract methods doIt() and say(String say);
    //void doIt();
}
