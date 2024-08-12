package L01;

import java.util.Arrays;

public class RefVar_15 {
    static void ChangeNum(int n1, int n2) {
        System.out.println("n1: " + n1 + ", n2: " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1: " + n1 + ", n2: " + n2);

    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 8;

        System.out.println("BEFORE ------------ num1: " + num1 + ", num2: " + num2);

        ChangeNum(num1, num2);

        System.out.println("AFTER ------------ num1: " + num1 + ", num2: " + num2);

        int[] arr = {1, 2, 3};
        int[] brr = {4, 5, 6};
        int[] crr = merge(arr,brr);

        System.out.println("crr -> "+Arrays.toString(crr));


        System.out.println("arr -> "+Arrays.toString(arr));
        System.out.println("brr -> "+Arrays.toString(brr));

        swapArray(arr, brr);

        System.out.println("arr -> "+Arrays.toString(arr));
        System.out.println("brr -> "+Arrays.toString(brr));



    }

    private static void swapArray(int[] arr, int[] brr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = brr[i];
            brr[i] = temp;
        }

    }

    private static int[] merge(int[] arr, int[] brr) {
        int[] crr = new int[arr.length + brr.length];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            crr[k++] = arr[i];
//            crr[k] = arr[i];
//            k=k+1;
//            k+=1;
//            k++;
//            ++k;
        }

        for (int i = 0; i < brr.length; i++) {
            crr[k++] = brr[i];
        }
        return crr;
    }
}
