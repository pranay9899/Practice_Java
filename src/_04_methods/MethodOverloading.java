package _04_methods;

public class MethodOverloading {

    /*
     * Method Overloading allows multiple methods with the same name but different
     * parameter lists. This helps in code readability and flexibility.
     *
     * Overloading is resolved at compile-time (static binding).
     */

    // Method 1: No parameters
    public void greet() {
        System.out.println("Hello!");
    }

    // Method 2: One String parameter
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: Two parameters (String and int)
    public void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    // Method 4: Same number of parameters, different types
    public void greet(int age, String name) {
        System.out.println("Hi " + name + ", your age is " + age + ".");
    }

    // Method 5: Same name, different return type - NOT VALID alone
    // Return type alone can't differentiate methods in overloading
    // public int greet(String name) { return 1; } // ❌ Compiler error

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling overloaded methods
        obj.greet(); // No argument
        obj.greet("Pranay"); // One String argument
        obj.greet("Pranay", 25); // Two arguments (String, int)
        obj.greet(25, "Pranay"); // Two arguments (int, String)
    }
}
