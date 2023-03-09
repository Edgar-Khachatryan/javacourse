package javaexceptions.SumOfElements;
import java.util.Scanner;
public class SumOfElements {

    /**
     * entering integers anc calculating the sum
     */

    public void findSum(){
        System.out.print("Enter the size of the array: ");

        Scanner num = new Scanner(System.in);

        int number = num.nextInt();

        int[] arr = new int[number];
        int sum = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Enter an integer: ");
            try {
                arr[i] = num.nextInt();
                sum += arr[i];
            } catch (Exception e) {
                System.out.println("Enter a integer");
                return;
            }
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
