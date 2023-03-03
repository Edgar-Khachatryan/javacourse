package javainheritance.ParentChild;

public class Child extends Parent {

    /**
     * showing message both Parent and Child
     */

    @Override
    protected void showMessage() {
        super.showMessage();
        System.out.println("Hello Child Class");
    }
}
