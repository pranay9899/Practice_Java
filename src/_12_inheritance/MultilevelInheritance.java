package _12_inheritance;

/**
 * This class demonstrates Multilevel Inheritance in Java.
 * In multilevel inheritance, a class is derived from a class which is also derived from another class.
 *
 * Hierarchy:
 * GrandParent → Parent → Child (MultilevelInheritance)
 */

// Top-level parent class
class GrandParent {
    void showGrandParent() {
        System.out.println("I am the Grandparent");
    }
}

// Parent class inherits from GrandParent
class FirstParent extends GrandParent {
    void showParent() {
        System.out.println("I am the Parent");
    }
}

// Child class inherits from Parent (which in turn inherits from GrandParent)
public class MultilevelInheritance extends FirstParent {
    void showChild() {
        System.out.println("I am the Child");
    }

    public static void main(String[] args) {
        // Creating object of the most derived class
        MultilevelInheritance child = new MultilevelInheritance();

        // Accessing methods from all levels of the inheritance hierarchy
        child.showGrandParent();  // Method from GrandParent
        child.showParent();       // Method from Parent
        child.showChild();        // Method from MultilevelInheritance (Child)
    }
}
