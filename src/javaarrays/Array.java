package javaarrays;

public class Array {

    /**
     * array of ints
     * printing positive integers
     */
    public void printInt(int[] n) {

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                System.out.print(n[i] + " ");
            }
        }
    }

    /**
     * array of shorts
     * printing reversed
     */
    public void printShort(short [] s){

        for (int i = s.length-1; i >= 0 ; i--) {
            System.out.println(s[i] + " ");
        }
    }
    /**
     * array of longs
     * printing largest long number
     */
    public void printLongMax(long [] l){

        long max = l[0];
        for (int i = 0; i < l.length; i++) {
            if (l[i] > max){
                max = l[i];
            }
        }
        System.out.println(max);
    }
    /**
     * printing minimum float value from array
     */
    public void printMinFloat( float [] f){

        float min = f[0];
        for (int i = 0; i < f.length; i++) {
            if (f[i]<min){
                min=f[i];
            }
        }
        System.out.println(min);
    }
    /**
     *moving from array to another array
     */

    public void moveToAnother(int n[], int m[]){

        for (int i=0; i<n.length; i++){
            m[i]=n[i];
        }
    }

    /**
     * adding elements from 2 arrays
     * @param k
     * @param x
     * @return
     */
    public int[] addArrayElements(int[] k, int[] x){
        int[] plusRes = new int[k.length];
        for (int i = 0; i < k.length; i++) {
            plusRes[i] = k[i] + x[i];
        }
        return plusRes;
    }

    /**
     * finding Kth element
     * @param arr
     * @param k
     * @return
     */
    public int findK(int[] arr, int k){
        int count = 0;
        for(int i:arr){
            if(i==k){
                count++;
            }
        }
        return count;
    }

    /**
     * creating 3 different value from array
     * @param arr
     */

    public void findDifferences(int[] arr){

        for (int i = 0; i<arr.length-2; i++){
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                }
            }
        }
    }

    /**
     * return array in descending order
     * @param arr
     * @return
     */
    public int[] descendingOrder(int [] arr){
        int forSwap;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] < arr[j]) {
                    forSwap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = forSwap;
                }
            }
        }
        return arr;
    }

    /**
     * odd numbers ordering in the last of the array
     * @param arr
     * @return
     */

    public int[] oddInTheLast(int [] arr){
        int odd;
        for (int i = 0; i < arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]%2==1){
                    odd=arr[i];
                    arr[i]= arr[j];
                    arr[j] = odd;
                }
            }
        }
        return arr;
    }

    /**
     * removing 0 from the array
     * @param arr
     * @return
     */

    public int[] removeZero(int [] arr){
        int countZero=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                countZero++;
                for (int j = i; j < arr.length -1; j++) {
                    arr[j] = arr[j + 1];
                }
            }

        }
        int[] withoutZero = new int[arr.length - countZero];
        for (int i = 0; i < withoutZero.length; i++) {
            withoutZero[i] = arr[i];
        }
        return withoutZero;

    }

    /**
     * printing values above of diagonal
     * @param arr
     */
    public void aboveDiagonal(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j>i){
                    System.out.println(arr[i][j]);
                }
                if (i>j){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public int[][] aboveDiagonalSwap(int [][] arr){
        int right;
        int left;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j>i){
                    right=arr[i][j];
                    arr[i][j]= arr[j][i];
                    arr[j][i] = right;
                }

            }
        }
        return arr;
    }


}
