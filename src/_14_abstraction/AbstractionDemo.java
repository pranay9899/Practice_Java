package _14_abstraction;

/**
 * Abstract class: Animal
 * - Demonstrates abstraction by defining common behavior (abstract and non-abstract methods)
 */
abstract class Animal {
    // Abstract method: must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method: can be inherited and optionally overridden
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

/**
 * Subclass: Dog
 * - Implements the abstract method from Animal
 */
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

/**
 * Subclass: Cat
 * - Implements the abstract method from Animal
 */
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

/**
 * Main class to demonstrate abstraction
 */
public class AbstractionDemo {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Not allowed - cannot instantiate abstract class

        Animal dog = new Dog(); // ✅ Allowed - dynamic dispatch
        Animal cat = new Cat();

        dog.makeSound(); // Dog barks
        dog.eat();       // Animal eats food

        cat.makeSound(); // Cat meows
        cat.eat();       // Animal eats food
    }
}
