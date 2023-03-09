package javaexceptions.ReciprocalNumber;

import java.util.Scanner;

public class Reciprocal {

    /**
     * Finding reciprocal of given number
     */

    public void reciprocalNumber(){
        System.out.println("Enter a integer");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        try {
            double recip = 1.0 / number;
            System.out.println("Reciprocal is: " + recip );
        } catch (ArithmeticException e) {
            System.out.println("You can divide by zero");
        }

    }



}
