package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        // Swapping values in an array

        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        swap(arr, 3, 4);

        System.out.println(Arrays.toString(arr));

    }

    // swap function
    static int swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr[index2];
    }

}
