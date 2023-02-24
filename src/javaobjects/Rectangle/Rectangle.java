package javaobjects.Rectangle;

public class Rectangle {
    private int len;
    private int width;

    public Rectangle(int len, int width) {
        this.len = len;
        this.width = width;
    }

    public int calculateArea(){
        return len * width;
    }

    public int getLen(){
        return len;
    }
    public int getWidth(){
        return width;
    }


}
