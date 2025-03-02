package com.OOPs.SingletonClass;

// A Java Singleton Class is a class that can have only one object (an instance of the class) at a time.
// After the first time, if we try to instantiate the java singleton classes, the new variable also points to the first instance created.
class singletonClass {
    // privatize constructor
   private singletonClass() {}

    private static singletonClass instance;

   public static singletonClass getInstance() {
       // check weather 1 object is created or not
       if (instance == null) { instance = new singletonClass(); }
       return instance;
   }
}
