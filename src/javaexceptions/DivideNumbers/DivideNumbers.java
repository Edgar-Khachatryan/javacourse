package javaexceptions.DivideNumbers;
import java.util.Scanner;


public class DivideNumbers {

    /**
     * dividing two numbers
     */

    public void divide(){

        Scanner nums = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter the first number: ");
        num1 = nums.nextInt();

        System.out.print("Enter the second number: ");
        num2 = nums.nextInt();

        try {
            if (num2 == 0) {
                throw new ArithmeticException();
            }
            double div = (double) num1 / num2;
            System.out.println("Number is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        }

    }
}
