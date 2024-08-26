package Array;

import java.util.Arrays;

public class Example_3 {
    public static void main(String[] args) {
        // reverse an array
        int[] arr = {1, 2, 3, 4, 5, 6};

        reverseArr(arr);

        System.out.print(Arrays.toString(arr));
    }

    // using with two pointers algorithm
    static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swapValue(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapValue(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}