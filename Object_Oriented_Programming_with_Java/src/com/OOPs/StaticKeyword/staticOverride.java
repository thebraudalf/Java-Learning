package com.OOPs.StaticKeyword;

public class staticOverride {
    static void greeting(){
        System.out.println("This is staticOverride class. Greet!");
    }
}

class newOverride extends staticOverride{
    static void greeting(){
        System.out.println("This is newOverride class. Greet!");
    }
}

class normalOverride {
    public static void main(String[] args) {

        staticOverride.greeting(); // This is staticOverride class. Greet!

        // In static method you can inherit, but you cannot override it
        newOverride obj1 = new newOverride();
        obj1.greeting(); // This is newOverride class. Greet!

        staticOverride obj2 = new newOverride();
        obj2.greeting(); // This is staticOverride class. Greet!
    }
}
