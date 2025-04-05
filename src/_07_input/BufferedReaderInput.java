package _07_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReaderInput Class
 * -------------------------
 * This class demonstrates how to take input in Java using BufferedReader.
 * BufferedReader reads input as Strings, so all primitive types must be parsed.
 */

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {

        // BufferedReader is used for efficient reading of characters, arrays, and lines
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 1. String input
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name);

        // 2. int input
        System.out.print("Enter your age (int): ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Your age is: " + age);

        // 3. float input
        System.out.print("Enter your height in feet (float): ");
        float height = Float.parseFloat(reader.readLine());
        System.out.println("Your height is: " + height + "ft");

        // 4. double input
        System.out.print("Enter your percentage (double): ");
        double percentage = Double.parseDouble(reader.readLine());
        System.out.println("Your percentage is: " + percentage + "%");

        // 5. byte input
        System.out.print("Enter your lucky byte number: ");
        byte byteValue = Byte.parseByte(reader.readLine());
        System.out.println("Your lucky byte is: " + byteValue);

        // 6. short input
        System.out.print("Enter your short number: ");
        short shortValue = Short.parseShort(reader.readLine());
        System.out.println("Your short number is: " + shortValue);

        // 7. long input
        System.out.print("Enter your mobile number (long): ");
        long longValue = Long.parseLong(reader.readLine());
        System.out.println("Your mobile number is: " + longValue);

        // 8. boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = Boolean.parseBoolean(reader.readLine());
        System.out.println("Student status: " + isStudent);

        // 9. char input (read a string and get first character)
        System.out.print("Enter your grade (A/B/C): ");
        char grade = reader.readLine().charAt(0);
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

        // No need to close BufferedReader connected to System.in
    }
}
