package javaabstracts.ParentSub;

public abstract class Parent {
    public Parent(){
        System.out.println("This is constructor of abstract class");
    }

    protected abstract void aMethod();

    protected void bMethod(){
        System.out.println("This is normal method of abstract class");
    }
}
