package javaabstracts.Interfaces;

public class MyClass implements A,B{

    /**
     * overiding method from A interface
     */

    @Override
    public void methOne() {
        System.out.println("Printing method from A");
    }

    /**
     * overiding method from B interface
     */

    @Override
    public void methTwo() {
        System.out.println("Printing method from B");
    }
}
