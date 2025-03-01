package com.OOPs.StaticKeyword;

// it is used to show the initialization of static variables
public class staticBlock {
    static int a = 4;
    static int b;

    // Java supports a special block called a static block(also called a static clause) that can be used for
    // static initialization of a class. This code inside a static block is executed only
    // once: the first time class is loaded into memory.
    static {
        System.out.println("This is static block."); // This is static block.(this will run only once)
        b += a * 5;
    }

    public static void main(String[]args){
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b); // 4 20

        staticBlock.b += 3;
        System.out.println(staticBlock.a + " " + staticBlock.b); // 4 23

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b); // 4 23
    }
}
