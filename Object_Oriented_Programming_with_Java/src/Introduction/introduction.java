package Introduction;

public class introduction {
    public static void main(String[] args) {
        /// Problem Statements to understand classes and objects

        // if we have to store roll no. of 5 students
        int[] rollNo = new int[5];

        // if we have to store name of 3 students
        String[] name = new String[5];

        // if we have to store roll no., name, and marks of 5 students then
        // we have to write their array in different names
        int[] rollno = new int[5];
        String[] Name = new String[5];
        float[] marks = new float[5];


        // To reduce this process we use the concept of OOPs which are classes and objects
        // init arr to Student class
        Student[] st = new Student[5];
        //System.out.println(Arrays.toString(st)); // [null, null, null, null, null]

        // declaring Student class and referencing it to it's objects
        Student st0;
        st0 = new Student();
        //System.out.println(st0.rollNo); // 0
        //System.out.println(st0.name); // null
        //System.out.println(st0.marks); // 90.0


        // There are two ways to create an instance of a class
        // First Way
        // instantiate Student class with var st1 here
        Student st1 = new Student();
        st1.marks = 30.24f;
        System.out.println(st1.rollNo); // 20
        System.out.println(st1.name); // st
        System.out.println(st1.marks); // 30.24
        st1.greeting();

        // Second Way
        // instantiate Student class with constructor
        Student st2 = new Student(12, "st2", 78.98f);
        System.out.println(st2.rollNo); // 12
        System.out.println(st2.name); // st2
        System.out.println(st2.marks); // 78.98
        st2.changeName("student");
        st2.greeting();
    }
}

// creating class for every single student
class Student {
    // declaring objects
    int rollNo;
    String name;
    // if we directly init the marks in the class itself
    // then we cannot reinit when referencing
    float marks = 90;

    // Methods are similar to functions and expose the behavior of objects. methods allows us to reuse code, improving both efficiency and organization
    void greeting() { System.out.println("Hello! " + name); }

    void changeName(String name) { this.name = name; }

    /// Here we need a way to add values to above properties through object, and we need one word to access every object
    // Constructor: Constructor is a block of codes similar to the method. It is called when an instance of the class is created.
    // It is a special type of method that is used to initialize the object.

    // This constructor is called ByDefault Constructor
    Student() {
        // "this" keyword is a reference variable that refers to the current object
        this.rollNo = 20;
        this.name = "st";
        this.marks = 92.24f;
    }

    // This constructor is called Parameterized Constructor
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
