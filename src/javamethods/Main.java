import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        System.out.println("Input an integer ");
        int c = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Input an another integer ");
        int d = b.nextInt();
        System.out.println(scanner(c,d));
    }

    /**
     * @param x
     * @param y
     * @return
     * returning 0
     */

    public static int scanner(int x, int y) {
        return 0;
    }
}

    public class Main {
        public static void main(String[] args) {
            hello();

        }
        public static void hello(){
            Scanner hi = new Scanner(System.in);
            System.out.println("Enter smth here");
            String hello = hi.nextLine();
            return;
        }
}


public class Main {

    public static void  bool(){
        Scanner bool1 = new Scanner(System.in);
        System.out.println("Enter True or False");
        boolean final1 = bool1.nextBoolean();
        System.out.println("Hello World !");
    }

    public static void main(String[] args) {
        bool();
    }
}

    public class Main {

        public static char chr(){
            Scanner tar = new Scanner(System.in);
            System.out.println("Enter a character");
            char tar1 = tar.next().charAt(0);
            System.out.println(tar1);
            return tar1;
        }

        public static void main(String[] args) {
            chr();
        }
}

    public class Main {

        public static float flt(){
            Scanner first = new Scanner(System.in);
            System.out.println("Enter a first floating number");
            float a = first.nextFloat();
            Scanner second = new Scanner(System.in);
            System.out.println("Enter second floating number");
            float b = second.nextFloat();

            return a;
        }

        public static void main(String[] args) {

            System.out.println(flt());

        }
}



    public class Main {

        static void recur(){
            System.out.println("Recursia");
            recur();
        }

        public static void main(String[] args) {
            recur();
        }
}
