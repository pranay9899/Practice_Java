package _07_input;

import java.util.Scanner;

/**
 * ScannerInput Class
 * ------------------
 * This class demonstrates how to take input in Java using the Scanner class.
 * It covers all primitive data types, input validation, and examples of best practices.
 */

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads an entire line including spaces
        System.out.println("Hello, " + name);

        // 2. int (Integer) input
        System.out.print("Enter your age (int): ");
        int age = scanner.nextInt(); // Reads integer input
        System.out.println("Your age is: " + age);

        // 3. float input
        System.out.print("Enter your height in feet (float): ");
        float height = scanner.nextFloat(); // Reads float input
        System.out.println("Your height is: " + height + "ft");

        // 4. double input
        System.out.print("Enter your percentage (double): ");
        double percentage = scanner.nextDouble(); // Reads double input
        System.out.println("Your percentage is: " + percentage + "%");

        // 5. byte input
        System.out.print("Enter your lucky byte number: ");
        byte byteValue = scanner.nextByte(); // Reads byte input
        System.out.println("Your lucky byte is: " + byteValue);

        // 6. short input
        System.out.print("Enter your short number: ");
        short shortValue = scanner.nextShort(); // Reads short input
        System.out.println("Your short number is: " + shortValue);

        // 7. long input
        System.out.print("Enter your mobile number (long): ");
        long longValue = scanner.nextLong(); // Reads long input
        System.out.println("Your mobile number is: " + longValue);

        // 8. boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // Reads boolean input
        System.out.println("Student status: " + isStudent);

        // Clear the buffer before reading char
        scanner.nextLine(); // Consume leftover newline

        // 9. char input (Scanner does not have nextChar, so we take first character of string)
        System.out.print("Enter your grade (A/B/C): ");
        char grade = scanner.nextLine().charAt(0); // Reads first character of the next line
        System.out.println("Your grade is: " + grade);

        // Summary
        System.out.println("\n--- Summary of Your Input ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Height      : " + height + "ft");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Lucky Byte  : " + byteValue);
        System.out.println("Short Value : " + shortValue);
        System.out.println("Mobile      : " + longValue);
        System.out.println("Is Student  : " + isStudent);
        System.out.println("Grade       : " + grade);

        // Close the scanner object
        scanner.close();
    }
}
