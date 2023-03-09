package javaexceptions.SquareRoot;
import java.util.Scanner;


public class SquareRoot {

    /**
     * calculating square root of given number
     */

    public void printSquareRoot(){
        System.out.print("Enter a number: ");


        Scanner num = new Scanner(System.in);
        int number  = num.nextInt();

        try {

            if (number < 0) {
                throw new IllegalArgumentException();
            }

            double square = Math.sqrt(number);
            System.out.println("Square root is: " + square);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid number");
        } catch (Exception e) {
            System.out.println("Invalid number");
        }
    }
}
