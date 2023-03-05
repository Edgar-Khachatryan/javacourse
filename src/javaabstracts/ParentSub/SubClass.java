package javaabstracts.ParentSub;

public class SubClass extends Parent{
    @Override
    protected void bMethod() {
        super.bMethod();
    }

    @Override
    protected void aMethod() {
        System.out.println("This is abstract method");
    }
}
