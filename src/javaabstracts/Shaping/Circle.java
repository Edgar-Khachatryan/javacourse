package javaabstracts.Shaping;

public class Circle extends Shape{
    @Override
    protected void draw() {
        System.out.println("Drawing Circle form");
    }

    @Override
    protected void erase() {
        System.out.println("Erasing the circle form");
    }
}
