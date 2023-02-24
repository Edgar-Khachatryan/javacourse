package javainheritance.ParentChild;

public class Child extends Parent {

    @Override
    protected void showMessage() {
        super.showMessage();
        System.out.println("Hello Child Class");
    }
}
