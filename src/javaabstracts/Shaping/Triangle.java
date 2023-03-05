package javaabstracts.Shaping;

public class Triangle extends Shape{
    @Override
    protected void draw() {
        System.out.println("Drawing Triangle form");
    }

    @Override
    protected void erase() {
        System.out.println("Erasing the Triangle form");
    }
}
