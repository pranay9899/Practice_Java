package _05_constructors;

/**
 * This class demonstrates different types of constructors in Java:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Constructor Chaining using this()
 */

class Student {

    String name;
    int age;
    String course;

    // 1. Default Constructor
    public Student() {
        this("Unknown", 0, "None"); // Calls the parameterized constructor (chaining)
        System.out.println("Default constructor called");
    }

    // 2. Parameterized Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Parameterized constructor called");
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("---------------------------");
    }
}

public class Constructor {
    public static void main(String[] args) {

        // Creating object using default constructor
        Student s1 = new Student();
        s1.displayInfo();

        // Creating object using parameterized constructor
        Student s2 = new Student("Pranay", 22, "Java Programming");
        s2.displayInfo();

        // Constructor chaining was used in the default constructor
        // to reuse initialization logic from the parameterized one.
    }
}
