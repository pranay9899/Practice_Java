package _09_objects_parameters;

/**
 * Demonstrates:
 * 1. Creating objects in Java.
 * 2. Passing objects as method parameters.
 * 3. How object references work.
 * 4. Mutability of objects.
 */
class Person {
    String name;
    int age;

    // Constructor to initialize Person object
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectParameter {

    // Method to modify Person object - changes will reflect outside
    static void modifyPerson(Person p) {
        p.name = "Updated " + p.name;   // Modifying original object's name
        p.age += 5;                     // Increasing age
    }

    // Method that tries to reassign the reference (won't affect original)
    static void reassignPerson(Person p) {
        p = new Person("New Person", 99); // New object assigned to local reference
    }

    public static void main(String[] args) {

        // Creating an object of Person
        Person person1 = new Person("Pranay", 22);
        System.out.println("Original Person:");
        person1.display();

        // Passing object to method that modifies it
        modifyPerson(person1);
        System.out.println("\nAfter modifyPerson() call:");
        person1.display(); // Reflects change because the object is mutable and reference is passed

        // Passing object to method that reassigns it internally
        reassignPerson(person1);
        System.out.println("\nAfter reassignPerson() call:");
        person1.display(); // No change here because reassignment doesn’t affect the original reference

        // Showing two references pointing to the same object
        Person person2 = person1;
        person2.name = "Changed via person2";
        System.out.println("\nAfter changing via person2:");
        person1.display(); // Shows updated name because both references point to the same object
    }
}
