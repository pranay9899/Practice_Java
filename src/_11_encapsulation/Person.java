package _11_encapsulation;

/**
 * This class demonstrates the concept of Encapsulation in Java.
 * Encapsulation is the practice of hiding internal object details
 * and exposing only necessary parts using methods (getters/setters).
 */
public class Person {

    // Private fields (data hiding)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        // Validation logic can be added here
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        // Validating age before setting
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 1 and 120.");
        }
    }

    // Method to display details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object
        Person person = new Person();

        // Setting values using setter methods
        person.setName("Pranay");
        person.setAge(22);

        // Accessing values using getter methods
        System.out.println("Name from getter: " + person.getName());
        System.out.println("Age from getter: " + person.getAge());

        // Displaying complete info
        System.out.println("\nDisplaying person info:");
        person.displayPerson();
    }
}
