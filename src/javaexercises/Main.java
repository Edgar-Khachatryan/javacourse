package javaexercises;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println(packageRice(1, 1, 6));
        checkOddEven();
        largestSmallest();
    }

    /**
     * @param small
     * @param goal
     * @param big
     * @return
     * returning boolean
     */

    public static boolean packageRice(int small, int goal, int big) {
        goal = 1 % big;
        if (small == goal) {
            return true;
        } else return false;

    }


    public static void checkOddEven() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is even");
        } else {
            System.out.println(randomNumber + " is odd");
        }

    }

    /**
     * pick up random min and max numbers
     */

    public static void largestSmallest() {
        Random random = new Random();
        int step = 10;
        int min = 100;
        int max = 0;
        int i = 0;
        System.out.println("Random numbers: ");
        while (i < step) {
            int randomNumber = random.nextInt(100);
            System.out.print(randomNumber + "  ");
            if (randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > max) {
                max = randomNumber;
            }
            i++;
        }
        System.out.println();
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
}
