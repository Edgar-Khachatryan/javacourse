package javaarrays;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Array arr = new Array();
        int[] m = {1, 2, -4, 5, -45, 50, -3, 12};
//        arr.printInt(m);
        short[] a = {1, 2, 3};
//        arr.printShort(a);
        long[] b = {15151,2561949,99292};
//        arr.printLongMax(b);
        float[] c = {152.5f, 54.6f, 4.5f};
//        arr.printMinFloat(c);
        int [] x = {1,2,3,4};
        int [] k = new int[x.length];
//        arr.moveToAnother(x,k);
//        System.out.println(k);
        int[] sum = arr.addArrayElements(new int[]{1, 2, 3},new int[] {1,1,1});
//        System.out.println(Arrays.toString(sum));
        int [] array = {8,0,1,0,4,0,2};
        int count = arr.findK(array, 5);
//        System.out.println(count);
//        arr.findDifferences(array);
        int[] swapped = arr.descendingOrder(array);
//        System.out.println(Arrays.toString(swapped));
        int[] odded = arr.oddInTheLast(array);
//        System.out.println(Arrays.toString(odded));
        System.out.println(Arrays.toString(arr.removeZero(array)));
        int[][] matrix = new int[][] {{1,2,3},
                                      {4,5,6},
                                      {7,8,9}};
//        arr.aboveDiagonal(matrix);
        int[][] matrix1 = new int[][]  {{1,2,3},
                                        {4,5,6},
                                        {7,8,9}};


        System.out.println(Arrays.toString(arr.aboveDiagonalSwap(matrix1)));
    }
}
