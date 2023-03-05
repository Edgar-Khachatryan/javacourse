package javaabstracts.Shaping;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.erase();
        Shape triangle = new Triangle();
        triangle.draw();
        triangle.erase();
        Shape square = new Square();
        square.draw();
        square.erase();
    }
}
