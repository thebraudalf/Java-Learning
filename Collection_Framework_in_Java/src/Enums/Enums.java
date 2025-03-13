package Enums;

public class Enums{

    // A Java enumeration is a class type. Although we don't need to instantiate an enum using "new",
    // it has the same capabilities as other classes. This fact makes Java enumeration a very powerful tool. Just like classes, you can give them
    // constructors, add instance vars and methods, and even implement interfaces.
    // The main objective of an enum is to define our own data types(Enumeration Data Types).
    enum Week implements TestEnums{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // These are enums constants
        // public, static, and final
        // since its final you cannot create child enum
        // type is week

        Week(){
            System.out.println("Constructor called " + this);
        }

        @Override
        public void hello(){
            System.out.println("Hello!!");
        }
        // this is not public or protected, only private or default
        // Because we don't want to create new objects

        // Internally: public static final week Monday = new Week();
    }

    public static void main(String[]args){
        // Declaring enums
        Week week;
        week = Week.Monday;
        System.out.println(week); // Monday
        week.hello(); // Hello!!

        // valuesOf() method returns the enum constants of the specified string value if exists.
        System.out.println(Week.valueOf("Monday")); //

        // values() method can be used to return all values present inside the enum.
        for(Week day: Week.values()){
            System.out.println(day);
        }

        // ordinal() method is used as, each constant index can be found. just like an array index.
        System.out.println(week.ordinal()); // 0
    }

}