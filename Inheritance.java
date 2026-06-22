/*
 * Inheritance.java
 * Topic: Inheritance & method overriding
 * Concepts: single inheritance, constructors, polymorphism, method overriding
 * How to run: javac Inheritance.java && java Inheritance
 * Notes: Demonstrates `Animal` base class, `Dog` subclass, and simple polymorphic
 * method calls with `Shape` examples.
 */
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is the animal Constructor");
    }

    void eat() {
        System.out.println(name + " eats food");
    }

    void sleep() {
        System.out.println(name + " sleeps 24 hours");
    }

    void age() {
        System.out.println(name + " age is " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void bark() {
        System.out.println(name + " barks very loudly");
    }
}

class Shape {
    void draw() {
        System.out.println("drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing a circle");
    }

    void hello() {
        System.out.println("hello this is cirle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("drawing a square");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Animal a1 = new Animal("sheep", 25);
        a1.eat();
        a1.sleep();
        a1.age();
        Dog d1 = new Dog("bruno", 30);
        d1.eat();
        d1.sleep();
        d1.bark();
        d1.age();

        Shape s1 = new Circle();
        s1.draw();
        Circle c1 = new Circle();
        c1.hello();
        Shape s2 = new Square();
        s2.draw();
    }
}
