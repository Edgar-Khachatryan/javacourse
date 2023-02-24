package javaoperators;

public class Main {


    public static void main(String[] args) {

        arithmetic1(8,6);
        arithmetic2(6.4,0.03);
        arithmetic3();
        unary(10,-88,true);
//        assignment();
        relational(10,20);
        additional();
        shift();

    }


    public static void arithmetic1(int a, int b){
        /*
        @param int a
        @param int b
        printing all possible actions with them
         */

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);

    }

    public static void arithmetic2(double c, double d){
        /*
        @param double C
        @param double d
        printing all possible actions with them
         */

        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);
    }

    public static void arithmetic3(){
        /*
        @param int x
        @param int y
        printing the values of x and y
         */

        int x = 2*((5+3)*4-8);
        int y = 2*5+3*4-8;
        System.out.println(x);
        System.out.println(y);
    }

    public static void unary(int e, int f,boolean n1){
        /*
        @param int e
        @param int f
        @param boolean n1
        manupulating with them
         */
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        int x = 3;
        int y = ++x * 5/x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + x);

    }
    public static void assignment(){
        /*
        trying to assign different data types with each other
         */

        int x = (int)1.0;
        short y = (short)1921222;
        System.out.print(2147483647+1);
        long a = (x=3);
        boolean b = false;
//        boolean c = (v=true); //error
//        System.out.println(c);

    }

    public static void relational(int x, int y){

        /*
        @param int x
        @param int y
        understanding which one is bigger
         */

        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }

    public static void additional() {

        /*
        fixing tutor's bugs
         */

        float a = 2.1f; //added f
        byte x = 5;
        byte y = 10;
        int z = x+y; // changing type byte to int
        short d = 10;
        short b = 3;
        int p = x*y; // changing type byto to int
        long h = 10;
        int g = 5;
        g = (int) (g * h); // changing type which should received to int

        int xx = 10;
        int yy = 5;
        xx = xx + yy;
        yy = xx - yy;
        xx = xx - yy;
        System.out.println("xx: "+ xx);
        System.out.println("yy: " + yy);

        int n = 100;
        int aa = 1;
        int an = 100;
        int sam = n * (aa + an) / 2;
        System.out.println("Sum of 1-100 is: " + sam);

    }

    public static void shift(){

        /*
        shifting manipulations
         */

        System.out.println(10<<2);
        System.out.println(-10<<3);
        System.out.println(20>>2);
        System.out.println(15>>3);


    }



}

