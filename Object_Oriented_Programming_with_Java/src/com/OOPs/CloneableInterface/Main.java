package com.OOPs.CloneableInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[]args) throws CloneNotSupportedException{
        Human User1 = new Human(23, "User1");
        // one way to clone one obj
        //Human User2 = new Human(User1);

        // another way to clone obj
        Human User2 = (Human)User1.clone();
        System.out.println(User2.age + " " + User2.name); // 23 User1
        System.out.println(Arrays.toString(User2.arr)); // [3, 4, 5, 6, 9, 1]

        /// This is the example of shallow copy
        // Here changing of User2 arr which reflects also to the User1 arr
        User2.arr[2] = 100;

        System.out.println(Arrays.toString(User2.arr)); // [3, 4, 100, 6, 9, 1]
        System.out.println(Arrays.toString(User1.arr)); // [3, 4, 100, 6, 9, 1]

        // This is the example of Deep Copy
        // Here does not changing of User2 arr which reflects also to the User1 arr
        System.out.println(Arrays.toString(User2.arr)); // [3, 4, 100, 6, 9, 1]
        System.out.println(Arrays.toString(User1.arr)); // [3, 4, 5, 6, 9, 1]

    }
}
