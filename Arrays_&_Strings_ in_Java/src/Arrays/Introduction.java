package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        // Arrays : Arrays are allows us to store multiple values of the same types in a single variable
        // In arrays indexing is being used, and they start from 0

        // syntax of array
        // datatype[] variable_name = new datatype[size]

        // declaration of array in the stack
        int[] arr;

        // There are two ways in initialization of array (object is being created in the heap)
        // First way
        int [] newArr = {32, 43, 43, 94, 54, 64};
        System.out.println(Arrays.toString(newArr)); // [32, 43, 43, 94, 54, 64]

        /// Second way
        arr = new int[5];

        // putting values in array (we can use this also to change values at particular index)
        arr[0] = 32;
        arr[1] = 23;
        arr[2] = 43;
        arr[3] = 50;
        arr[4] = 53;
        System.out.println(Arrays.toString(arr)); // [32, 23, 43, 50, 53]

        // if you put value in next index which is out of limit then you get
        // arr[5] = 43;
        // System.out.println(Arrays.toString(arr)); // Error : ArrayIndexOutOfBoundsException


        // if you print empty array of primitive data types
        int[] val = new int[5];
        System.out.println(val[4]); // 0

        // if you print non primitive data type array
        String[] nullValue = new String[3];
        System.out.println(nullValue[0]); // null

        // Note : Array objects are in heap they are may not be continuous depends on JVM

    }
}
