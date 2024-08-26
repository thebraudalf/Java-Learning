package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensional_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array
        int[][] arr = {
                {1, 2, 3, 4}, // 0th index
                {5, 6, 7}, // 1st index
                {8, 9} // 2nd index
        };

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " "); // matrix of
            }
            System.out.println();
        }


        int[][] newArr = new int[3][3];
        System.out.println(Arrays.toString(newArr)); // no. of rows

        // input 2 Dimensional arrays
        for (int row = 0; row < newArr.length; row++){
            // for each column in every row
            for (int col = 0; col < newArr[row].length; col++){
                newArr[row][col] = input.nextInt();
            }
        }

        // print 2d array

        // with nested loop
       // for (int row = 0; row < newArr.length; row++){
       //     for (int col = 0; col < newArr[row].length; col++){
       //         System.out.print(newArr[row][col] + " ");
       //    }
       //     System.out.println();
       // }

        // with Array class
       // for (int row = 0; row < newArr.length; row++){
      // System.out.println(Arrays.toString(newArr[row]));
     // }

        // with enhanced for loop or for each loop
        for (int[] row : newArr){
            System.out.println(Arrays.toString(row));
        }
    }
}
