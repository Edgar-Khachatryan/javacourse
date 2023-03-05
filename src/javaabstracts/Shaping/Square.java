package javaabstracts.Shaping;

public class Square extends Shape {
    @Override
    protected void draw() {
        System.out.println("Drawing Square form");
    }

    @Override
    protected void erase() {
        System.out.println("Erasing the Square form");
    }
}
