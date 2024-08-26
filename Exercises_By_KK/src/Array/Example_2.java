package Array;

import javax.sound.midi.SysexMessage;

public class Example_2 {
    public static void main(String[] args) {
        // maximum value of an array
        int[] arr = {11, 29, 33, 46, 85, 14, 89, 45, 23};

        System.out.println(maxValue(arr) + " is the maximum value in this array.");

    }

    static int maxValue(int[] arr){
       int i = 0;

       // iterate over the condition
       while (i < arr.length - 1){
           if (arr[i] > arr[i + 1]){
               // put arr[i] in arr[i + 1]
               arr[i + 1] = arr[i];
           }
           else {
               // put arr[i + 1] in arr[i]
               arr[i] = arr[i + 1];
           }
           i++;
       }

       return arr[i];
    }
}
