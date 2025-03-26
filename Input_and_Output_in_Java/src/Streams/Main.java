package Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        System.out.println(list);


        System.out.println(); // used for new line

        // Performing Stream operations
        List<Integer> ls = list.stream()
                // filter() method is used to filter the stream elements
                // here filtering out even elements
                .filter(i -> i % 2 == 0)
                // toList() is used to collect stream or list elements
                .toList();

        System.out.println(ls); // list of even numbers
    }
}
