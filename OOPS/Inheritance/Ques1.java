// Q1: Simple Single-Level Inheritance
// Create a base class Animal with a method makeSound() that prints "Animal makes a sound".
// Create a derived class Dog that overrides the makeSound() method to print "Dog barks".
// In the main method, call the method using both Animal and Dog objects and observe the output.

// 🔍 Concept Covered: Method overriding, single-level inheritance

public class Ques1 {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.makeSound();

        Dog d = new Dog();
        d.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
