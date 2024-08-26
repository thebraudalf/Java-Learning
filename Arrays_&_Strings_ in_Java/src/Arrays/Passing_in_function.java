package Arrays;

import java.util.Arrays;

public class Passing_in_function {
    public static void main(String[] args) {
        int[] arr = {23, 43, 73, 89, 99};

        changeArray(arr);

        System.out.println(Arrays.toString(arr)); // [54, 43, 73, 23, 99]
    }

    // passing array in function's parameter
    static void changeArray(int[] arr){
        arr[0] = 54;
        arr[3] = 23;
    }
}
