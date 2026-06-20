/*
 * Oops.java
 * Topic: Object-oriented basics (OOPS)
 * Concepts: classes, constructors, default values, instance fields, and methods
 * How to run: javac Oops.java && java Oops
 * Notes: Multiple small class examples showing constructors, default values,
 * and basic object instantiation.
 */
class Student {
    String name = "hardik";
    int age = 10;
}

class Student1 {
    String name;
    int age;
}

class Student2 {

    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("your name is " + name + " and your age is " + age);
    }

    // static void display1() { // static methods cannot access the non static
    // variables
    // System.out.println("your name is " + name + " and your age is " + age);
    // }
}

class Car {
    String brand;
    String color;

    Car() {
        System.out.println("default constructor is called");
        // display(); if we call the method from the constructor its value will be null
    }

    void display() {
        System.out.println("the brand of the car is " + brand + " and its color is " + color);
    }
}

public class Oops {
    public static void main(String args[]) {

        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student1 s2 = new Student1();
        s2.name = "Ramesh";
        s2.age = 22;
        System.out.println(s2.name);
        System.out.println(s2.age);

        Student2 s3 = new Student2("Sharma", 35);
        s3.display();
        System.out.println(s3.name);
        System.out.println(s3.age);

        Car c1 = new Car();
        c1.brand = "mercedes";
        c1.color = "red";
        c1.display();
    }
}
