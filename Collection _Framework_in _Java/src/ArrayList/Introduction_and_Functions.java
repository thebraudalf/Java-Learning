package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Introduction_and_Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ArrayList is a class implemented using a list interface, in that provides the functionality of dynamic array where the size of array is not fixed
        // Size is not fixed there

        // syntax
        ArrayList<Integer>list = new ArrayList<>(5);

        list.add(23);
        list.add(53);
        list.add(43);
        list.add(132);
        list.add(53);
        list.add(43);
        list.add(132);
        list.add(53);
        list.add(43);
        list.add(132);
        list.add(53);
        list.add(43);
        list.add(132);
        list.add(53);
        list.add(43);
        list.add(132);

        // There is no need to use toString() method to print
        System.out.println(list); // [23, 53, 43, 132, 53, 43, 132, 53, 43, 132, 53, 43, 132, 53, 43, 132]

        // .set() method is used to replace the specific elements at the specific position in this list with the specified element
        list.set(0, 199);

        // .contains() method is used if this list contain specified element and return true if it is
        System.out.println(list.contains(132)); // true

        // .remove() method is used to removes the specific element from the specific position in this list
        list.remove(3);

        System.out.println(list); // [199, 53, 43, 53, 43, 132, 53, 43, 132, 53, 43, 132, 53, 43, 132]


        // input in arraylist
        System.out.print("Enter the element : ");

        for (int i=0; i<5; i++ ){
            list.add(input.nextInt());
        }

        for (int i=0; i<5; i++){
            //.get() method is used to return the element at the specified position in this list
            System.out.print(list.get(i) + " "); // use get method here and put i in it, list[index] will not work here
        }

    }
}
