package com.OOPs.StaticKeyword;

// problem statement used to show the work and use case of "static" keyword
class Human {
    // and their properties are
    int age;
    String name;
    boolean maritalStatus;
    int salary;

    // When a var is declared than as static, then a single copy of the var is created and shared among all objects of the class level.
    // Static vars are, essentially, global vars. All instances of the class share the same static var.
    // Here the static var for the property that is common to all objects.
    static long population;

    public Human(int age, String name, boolean maritalStatus, int salary) {
        this.age = age;
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.salary = salary;

        // Here we don't have to use "this" keyword because "this" refers to object or instance of the class
        // and static vars are associated with class not with object or instance of the class
        Human.population += 1;
    }

    static void message() {
        System.out.println("Hello World");
//        System.out.println(this.age); // we can't use "this" keyword because "this" refers to objects or instance of the class and static methods can't access instance vars
    }

}
