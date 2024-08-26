package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Multi_Dimensional_ArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // creating multidimensional arraylist
        // In this, ArrayList is creating another array of arraylist
        // That's why we write number in initial capacity

        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        // initialization for capacity
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // adding elements
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                list.get(i).add(input.nextInt());
            }
        }

        System.out.println(list); // array of arraylist

    }
}
