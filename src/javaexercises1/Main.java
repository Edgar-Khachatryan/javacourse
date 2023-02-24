package javaexercises1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        multTable(); // Q1
//        powerOf(); // Q2
//        checkPrime(); // Q4 ??
//        askUser(); // Q5
//        reverse(); // Q3
//        countOf(); // Q6
//        largestSmallest(); // Q7
//        isArmstrong(); // Q8
//        calcSum(); // Q9
//        logarithmSum(); Q10
//        guessNumber(); Q 11
        printPattern2();


    }

    public static void multTable() {

        /**
         * multiply table
         */
        System.out.println("Enter a positive integer");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int i;
        for (i = 1; i < 11; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));

        }
    }

    public static void reverse() {
        System.out.println("Enter a number");
        Scanner num = new Scanner(System.in);
        String number = num.next();
        int i = 0;
        for (i = number.length(); i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void powerOf() {
        System.out.println("Enter first number ");
        Scanner num = new Scanner(System.in);
        int first = num.nextInt();
        System.out.println("Enter second number ");
        Scanner num1 = new Scanner(System.in);
        int second = num1.nextInt();
        int i;
        int res = 1;
        for (i = 0; i < second; i++) {
            res *= first;
        }
        System.out.println(res);
    }

    public static void checkPrime() {
        System.out.println("Enter a integer");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int i;
        boolean isPrime = false;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                isPrime = true;
            }
        }
        if (!isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }

    public static void askUser() {

        Scanner input = new Scanner(System.in);
        String askAgain;
        do {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
            System.out.print("Do you want to count again  (y/n)? ");
            askAgain = input.next();
        } while (askAgain == "y");
        System.out.println("Thank you Good Bye !");

    }

    public static void countOf() {
        Scanner sc = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        int i = 0;
        String askAgain;
        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num > 0) {
                countPositive++;
            } else if (num < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.println("Do you want to continue ? Y/N");
            askAgain = sc.next();

        } while (askAgain.equals("Y"));
        System.out.println("Positive count of number is: " + countPositive);
        System.out.println("Negative count of number is: " + countNegative);
        System.out.println("Zero count of number is: " + countZero);
    }


    public static void largestSmallest() {
        Scanner sc = new Scanner(System.in);


        int max = 1;
        int min = 100;
        String askAgain;
        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            System.out.println("Do you want to continue ? Y/N");
            askAgain = sc.next();
        } while (askAgain.equals("Y"));
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);

    }


    public static void isArmstrong() {
        int i;
        for (i = 2; i < 501; i++) {
            int sum = 0;
            int num = i;

            while (num != 0) {

                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == i) {
                System.out.println(i + " Is a armstring numbber");
            }
        }
    }

    public static void calcSum() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 1;
        int i;
        for (i = 2; i < num; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }

    public static void logarithmSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0;
        int log = 1;
        for (int i = 1; i <= n; i++) {
            sum += log * (1.0 / i);
            log *= -1;
        }
        System.out.println("The natural logarithm of 2 is approximately: " + sum);

    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNum = sc.nextInt(100);
        int guess;
        do {
            System.out.println("Gues the number from 1-100");
            guess = sc.nextInt();
            if (guess > randomNum) {
                System.out.println("It is too high");
            } else if (guess < randomNum) {
                System.out.println("It is too low");
            }
        } while (guess != randomNum);
        System.out.println("You guess the number !");
    }


    public static void printPattern() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printPattern1(){
        int rows = 6;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < rows ; j++) {
                if (j < rows-i){
                    System.out.print(" ");

                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern2(){
        int rows = 6;
        int low = 1;
        int high = 9;
        int mid = (high-low)/2;
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j <= mid+i ; j++) {

                if (j>=mid-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void printPattern3(){
        int start = 1;
        int low = 1;
        int high = 9;
        int mid = (high - low)/2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < high + 3; j++) {
                if (j>=mid-i && j <= mid+i){
                    System.out.print(i+1);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern4(){
        int low = 1;
        int high = 9;
        int mid = (high-low)/2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < high; j++) {
                if (j>=mid-i && j <= mid+i){
                    System.out.print(Math.abs(mid-j)+1);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    
}



