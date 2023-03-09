package javaexceptions.CalculateQuotient;

import java.util.Scanner;

public class Quotient {

    /**
     * finding quotient of two numbers
     */

    public void calcQuotient(){
        System.out.print("Enter the first integer: ");

        Scanner num = new Scanner(System.in);

        System.out.print("Enter the second integer: ");

        int num1 = num.nextInt();
        int num2 = num.nextInt();

        try {
            if (num2 <= 0) {
                throw new IllegalArgumentException("Second integer must be positive and grater than 0");
            }
            int quot = num1 / num2;
            System.out.println("The quotient is "  + quot);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
