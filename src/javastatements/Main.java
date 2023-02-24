package javastatements;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        checkOddEven(8);
//        checkPositiveNegative(10);
//        System.out.println(checkSecondNumber(974));
//        justCheck(10);
//        checkDivide(10);
//        System.out.println(checkSecondNumber(10));
//        checkCoordinates(1, 2, 3);
//        checkBiggest(10, 15, 20);
//        checkLeapYear(1997);
//        printEight();
//        fixMistakes();
//        printFirstDigit(265);
//        whileDo(1, 0);
//        squarePic();
//        sumOfEn();
//        multiplyByEn();
        checkSam();
//        findMinMax();
//        samOfDigits();

    }


    public static void checkOddEven(double x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }

    public static void checkPositiveNegative(float x) {
        if (x > 0) {
            System.out.println(x + " is positive");
        } else if (x == 0) {
            System.out.println("0 is neither a positive nor a negative");
        } else {
            System.out.println(x + " is negative ");
        }
    }

    public static void justCheck(float x) {
        if (x < 8 && x > 5 || x < 20 && x > 15) {
            System.out.println("X meets your conditions");
        } else {
            System.out.println("X does not meet your conditions");
        }
    }

    public static void checkDivide(float x) {
        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println("X meets your conditions to divide");
        } else {
            System.out.println("X doesn't meet your conditions to divide");
        }
    }

    public static boolean checkSecondNumber(int x) {
        if ((x / 10) % 10 == 7) {
            System.out.println("The second digit is 7");
            return true;
        } else {
            System.out.println("The second digit is NOT 7");
            return false;

        }
    }

    public static void checkCoordinates(double x, double y, double k) {
        if (k <= ((x - 0) * (x - 0) + (y - 5) * (y - 5))) {
            System.out.println("K in that space");
        } else {
            System.out.println("K not in that space");
        }
    }

    public static void checkBiggest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("a is the biggest");
        } else if (b >= a && b >= c) {
            System.out.println("b is the biggest");
        } else {
            System.out.println("c is the biggest");
        }
    }

    public static void checkLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " is NOT leap");
        }
    }

    public static void printEight() {
        int x = 0;
        while (x++ < 10) {
            if (x == 8) {
                System.out.println(x);
                break;
            }
        }
    }

    public static void fixMistakes() {
        int x = 2;
        int y = 5;
        while (x < 10) {
            x++;
            y++;
//            System.out.println(y);
        }
        System.out.println(y);

        int a = 15;
        while (a > 10) {
            a = --a; // setting -- before a
        }
        System.out.println(a);
    }

    public static void printFirstDigit(int x) {
        while (x >= 10) {
            x = x / 10;
        }
        System.out.println(x);
    }

    public static void whileDo(int x, int y) {
        do {
            System.out.println(x + y);
            x++;
            y++;
        }
        while (x < 5 && x < 10);
    }

    public static void squarePic() {
        for (int i = 1; i < 5; i++) {
            System.out.println("****");
        }
    }

    public static void sumOfEn() {
        System.out.println("Enter the number \n");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        int sam = 0;
        for (int i = 0; i < m; i++) {
            if (i % 5 == 0) {
                sam += i;
            }
        }
        System.out.println(sam);
    }

    public static void multiplyByEn() {
        System.out.println("Enter the number: ");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        int sam = 0;
        if (m < 10) {
            System.out.println("Enter number which is greater than or equal to 10");
        } else {
            for (int i = 10; i <= m; i++) {
                if (i % 5 == 0) {
                    sam += i;
                }
            }
            System.out.println(sam);
        }
    }

    public static void checkSam(){
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        int mult = 1;
        if(m >=10 && m <= 99){
            for (int i = 10; i <= m; i += 2 ){
                mult *= i;
            }
        }else {
            System.out.println("Enter a number than greater than 10 and less than 99");
        }
        System.out.println(mult);
    }

    public static void findMinMax(){
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        int max = 0;

//        System.out.println((1 + m - 1)/2);
        for (int i = 1; i < m ; i++){
            if (i > max){
                max = i;
            }
        }
        System.out.println((max + 1)/2);
    }

    public static void samOfDigits(){
        System.out.println("Enter a 5 digit number");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        int sam = 0;
        while (m > 0){
            sam += m % 10;
            m/=10;
        }
        System.out.println(sam);
    }

}
