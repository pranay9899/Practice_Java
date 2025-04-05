package _01_variables;

/**
 * This class demonstrates the 3 main types of variables in Java:
 * - Static (class-level)
 * - Instance (object-level)
 * - Local (method-level)
 */
public class VariableTypes {

    // 🔹 Static Variable: Shared among all instances of the class
    // Lives in the Method Area and belongs to the class, not objects
    static String staticVar = "I'm a static variable";

    // 🔹 Instance Variable: Unique to each object
    // Lives in the Heap, tied to object state
    String instanceVar = "I'm an instance variable";

    public void demonstrateVariables() {
        // 🔹 Local Variable: Declared inside a method
        // Lives in the Stack and only accessible within this method
        String localVar = "I'm a local variable";

        // Accessing all types of variables
        System.out.println(staticVar);          // Can access static variables directly
        System.out.println(instanceVar);        // Can access instance variables inside non-static method
        System.out.println(localVar);           // Local variable within this method
    }

    public static void main(String[] args) {
        // ✅ Static variable can be accessed without creating any object
        System.out.println("Accessing staticVar from main: " + staticVar);

        // ✅ Instance variable requires object creation
        VariableTypes obj = new VariableTypes(); // Creating an object
        System.out.println("Accessing instanceVar from main: " + obj.instanceVar);

        // ✅ Calling method to demonstrate local variable usage
        obj.demonstrateVariables();
    }
}
