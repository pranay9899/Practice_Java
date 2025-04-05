package _06_tostring;

/**
 * This class demonstrates:
 * 1. What is toString()
 * 2. Why we override it
 * 3. Best practices for overriding
 */

// Class without overriding toString()
class DefaultToString {
    int id = 1;
    String name = "Default";

    // No toString() method here
}

// Class with overridden toString()
class CustomToString {
    int id;
    String name;
    String department;

    // Constructor
    public CustomToString(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    /**
     * Overriding toString() to provide meaningful string representation of object
     * This helps during debugging, logging, or printing objects
     */
    @Override
    public String toString() {
        return "CustomToString {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class ToStringMethod {
    public static void main(String[] args) {

        // Using class without overriding toString()
        DefaultToString defaultObj = new DefaultToString();
        System.out.println("Default toString() output:");
        System.out.println(defaultObj);  // Will print: _06_tostring.DefaultToString@hashcode

        System.out.println("\nCustom toString() output:");
        // Using class with overridden toString()
        CustomToString customObj = new CustomToString(101, "Pranay", "Software");
        System.out.println(customObj); // Will print meaningful data

        /**
         * Best Practices for toString():
         * - Always override it in POJO / Entity / DTO classes
         * - Include relevant fields only (avoid sensitive info like passwords)
         * - Keep the format clean and readable
         * - Helpful for logging and debugging
         */
    }
}
