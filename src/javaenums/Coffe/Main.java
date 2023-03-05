package Coffe;

public class Main {
    public static void main(String[] args) {
//        printSizeInfo(CoffeeSizes.LARGE);
//        printSizeInfo(CoffeeSizes.MEDIUM);
//        printSizeInfo(CoffeeSizes.SMALL);
        for (CoffeeSizes size : CoffeeSizes.values()) {
            printSizeInfo(size);
        }
    }

    private static void printSizeInfo(CoffeeSizes size) {
        System.out.println("Name is: " + size.name());
        System.out.println(size.ordinal());
    }
}
