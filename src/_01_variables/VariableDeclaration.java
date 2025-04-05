package _01_variables;

/**
 * This class demonstrates how to declare, initialize,
 * and use variables of various data types in Java.
 */
public class VariableDeclaration {
    public static void main(String[] args) {

        // 🔹 Declaration (Reserves memory but doesn't assign value yet)
        int age;            // int - whole number (4 bytes)
        String name;        // String - a class, stores text (reference type)

        // 🔹 Initialization (Assign values to declared variables)
        age = 22;
        name = "Pranay";

        // 🔹 Declaration + Initialization in one step
        double percentage = 88.5;   // double - decimal number with more precision (8 bytes)

        // ✅ More examples with all data types:

        // 🔸 Integer Types
        byte smallByte = 120;       // byte - very small integer (-128 to 127, 1 byte)
        short shortNum = 32000;     // short - larger than byte (-32,768 to 32,767, 2 bytes)
        int intNum = 100000;        // int - commonly used whole number (4 bytes)
        long longNum = 9876543210L; // long - very large whole number (8 bytes, needs 'L' suffix)

        // 🔸 Floating Point Types
        float floatNum = 23.45f;    // float - decimal with less precision (4 bytes, needs 'f' suffix)
        double doubleNum = 99.99;   // double - high-precision decimal (8 bytes)

        // 🔸 Character Type
        char grade = 'A';           // char - single character (2 bytes)

        // 🔸 Boolean Type
        boolean isPassed = true;    // boolean - true or false (1 bit)

        // ✅ Output all variables to console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);

        System.out.println("byte: " + smallByte);
        System.out.println("short: " + shortNum);
        System.out.println("int: " + intNum);
        System.out.println("long: " + longNum);
        System.out.println("float: " + floatNum);
        System.out.println("double: " + doubleNum);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isPassed);
    }
}
