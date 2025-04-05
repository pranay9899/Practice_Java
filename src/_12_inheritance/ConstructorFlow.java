package _12_inheritance;

/**
 * Demonstrates constructor flow in inheritance.
 * When a subclass object is created, superclass constructor is called first.
 */

class Parent {
    public Parent() {
        System.out.println("Parent constructor executed.");
    }
}

class Child extends FirstParent {
    public Child() {
        System.out.println("Child constructor executed.");
    }
}

public class ConstructorFlow {
    public static void main(String[] args) {
        Child child = new Child(); // Observe the order of constructor calls
    }
}
