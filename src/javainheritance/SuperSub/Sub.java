package javainheritance.SuperSub;

public class Sub extends Super {
    String message = "Hello SubClass class";

    /**
     * printing messages from Child and Parent Class
     */
    public void printMessage(){
        System.out.println(super.message);
        System.out.println(message);
    }

}
