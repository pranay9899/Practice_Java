package _01_variables;

/**
 * This class demonstrates all the primitive data types in Java.
 * Java has 8 primitive types: int, float, double, char, boolean, byte, short, and long.
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integer type - 4 bytes
        int number = 100;

        // Floating point type - 4 bytes
        float floatNumber = 10.5f; // Note the 'f' at the end for float literals

        // Double type (more precision than float) - 8 bytes
        double doubleNumber = 99.99;

        // Character type - 2 bytes (stores single Unicode character)
        char character = 'P';

        // Boolean type - 1 bit (true or false)
        boolean isJavaFun = true;

        // Byte type - 1 byte (-128 to 127)
        byte smallByte = 127;

        // Short type - 2 bytes (-32,768 to 32,767)
        short shortNumber = 32000;

        // Long type - 8 bytes (used for large integers)
        long bigLong = 123456789L; // Note the 'L' at the end for long literals

        // Output each variable to the console
        System.out.println("int: " + number);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + character);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("byte: " + smallByte);
        System.out.println("short: " + shortNumber);
        System.out.println("long: " + bigLong);
    }
}
