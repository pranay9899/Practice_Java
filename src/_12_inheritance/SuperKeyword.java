package _12_inheritance;

/**
 * Demonstrates the use of the `super` keyword.
 * - Accessing superclass methods/fields.
 * - Calling superclass constructor.
 */

class Person {
    String name = "John";

    public Person() {
        System.out.println("Person constructor called.");
    }

    public void showInfo() {
        System.out.println("Person name: " + name);
    }
}

class Student extends Person {
    String name = "Pranay";  // This hides the parent variable

    public Student() {
        super(); // Call to Person's constructor
        System.out.println("Student constructor called.");
    }

    public void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name using super: " + super.name); // Accessing parent variable
        super.showInfo(); // Accessing parent method
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
