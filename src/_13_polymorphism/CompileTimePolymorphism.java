package _13_polymorphism;

/**
 * Demonstrates Compile-time Polymorphism using method overloading.
 * The method to call is determined at compile time based on method signatures.
 */
public class CompileTimePolymorphism {

    // Overloaded methods with different parameter lists

    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        obj.greet();                      // No arguments
        obj.greet("Pranay");              // Single argument
        obj.greet("Pranay", 22);          // Two arguments
    }
}
