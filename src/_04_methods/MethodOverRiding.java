package _04_methods;

/**
 * This program demonstrates Method Overriding in Java.
 * Method Overriding allows a subclass to provide a specific implementation
 * of a method that is already defined in its superclass.
 *
 * It supports runtime polymorphism — meaning the method that gets executed
 * is determined at runtime based on the actual object type, not the reference type.
 */

// Superclass
class Animal {
    // This method will be overridden in subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // This method is not overridden in subclasses and will be inherited with the same behavior
    public void sleep() {
        System.out.println("Animal sleeps");
    }
}

// Subclass Dog that overrides makeSound()
class Dog extends Animal {

    // Overriding method with the same name, return type, and parameters
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // New method specific to Dog class
    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Subclass Cat that also overrides makeSound()
class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class demonstrating method overriding and runtime polymorphism
public class MethodOverRiding {
    public static void main(String[] args) {

        // These demonstrate runtime polymorphism: method calls are resolved
        // at runtime based on the actual object type (Dog, Cat)
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling overridden methods
        animal1.makeSound();  // Output: Dog barks
        animal2.makeSound();  // Output: Cat meows

        // Calling non-overridden method (same behavior across subclasses)
        animal1.sleep();      // Output: Animal sleeps
        animal2.sleep();      // Output: Animal sleeps

        // animal1.fetch(); // ❌ Not allowed: fetch() is not part of Animal class

        // Safe downcasting: Check if animal1 is actually a Dog before calling Dog-specific method
        if (animal1 instanceof Dog) {
            ((Dog) animal1).fetch(); // ✅ Output: Dog fetches the ball
        }
    }
}
