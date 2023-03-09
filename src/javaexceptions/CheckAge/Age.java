package javaexceptions.CheckAge;

import java.util.Scanner;

public class Age {

    /**
     * checking age
     */

    public void checkAge(){
        System.out.print("Enter your age: ");
        Scanner num = new Scanner(System.in);
        int age = num.nextInt();

        try {
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Wrong age");
            }
            System.out.println("Your age is " + age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
