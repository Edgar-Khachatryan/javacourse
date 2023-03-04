package javamethods;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        returnZero(8,7);
        hello();
        bool();
        chr();
        flt();
        recur();

    }

    /**
     * @param x
     * @param y
     * @return returning 0
     */

    public static int returnZero(int x, int y) {
        return 0;
    }

    /**
     * printing string
     */


    public static void hello() {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter smth here");
        String hello = hi.nextLine();
        return;
    }

    /**
     * entering boolean value
     */

    public static void bool() {
        Scanner bool1 = new Scanner(System.in);
        System.out.println("Enter True or False");
        boolean final1 = bool1.nextBoolean();
        System.out.println("Hello World !");
    }


    /**
     * priting char
     * @return
     */

    public static char chr() {
        Scanner tar = new Scanner(System.in);
        System.out.println("Enter a character");
        char tar1 = tar.next().charAt(0);
        System.out.println(tar1);
        return tar1;
    }


    /**
     * printing float
     * @return
     */

    public static float flt() {
        Scanner first = new Scanner(System.in);
        System.out.println("Enter a first floating number");
        float a = first.nextFloat();
        Scanner second = new Scanner(System.in);
        System.out.println("Enter second floating number");
        float b = second.nextFloat();

        return a;
    }

    /**
     * creating recursion
     */


    static void recur() {
        System.out.println("Recursia");
        recur();
    }

}
