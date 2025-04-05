package _10_classes_objects;

/**
 * This class represents a Student with attributes like name, age, and grade.
 * It demonstrates:
 * 1. Class structure and field declaration.
 * 2. Constructor for object instantiation.
 * 3. Object creation and method usage.
 */
public class Student {

    // Fields (instance variables)
    String name;
    int age;
    char grade;

    // Constructor to initialize object
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {

        // Creating objects using constructor
        Student student1 = new Student("Pranay", 22, 'A');
        Student student2 = new Student("Meena", 20, 'B');

        // Calling method on object
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayDetails();
    }
}
