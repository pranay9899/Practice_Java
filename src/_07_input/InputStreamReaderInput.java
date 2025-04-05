package _07_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReaderInput Class
 * ----------------------------
 * Demonstrates how to read different types of input using InputStreamReader,
 * usually wrapped in BufferedReader for line-based reading.
 *
 * NOTE: All input is read as Strings and needs to be parsed to primitive types.
 */
public class InputStreamReaderInput {
    public static void main(String[] args) throws IOException {

        // InputStreamReader reads bytes and decodes them into characters using a charset
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr); // used for reading full lines efficiently

        // 1. String input
        System.out.print("Enter your full name: ");
        String name = reader.readLine();
        System.out.println("Name: " + name);

        // 2. int input
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Age: " + age);

        // 3. float input
        System.out.print("Enter your height (in feet): ");
        float height = Float.parseFloat(reader.readLine());
        System.out.println("Height: " + height + "ft");

        // 4. double input
        System.out.print("Enter your weight (in kg): ");
        double weight = Double.parseDouble(reader.readLine());
        System.out.println("Weight: " + weight + "kg");

        // 5. byte input
        System.out.print("Enter a small byte value: ");
        byte byteValue = Byte.parseByte(reader.readLine());
        System.out.println("Byte Value: " + byteValue);

        // 6. short input
        System.out.print("Enter your short ID: ");
        short shortId = Short.parseShort(reader.readLine());
        System.out.println("Short ID: " + shortId);

        // 7. long input
        System.out.print("Enter your bank account number (long): ");
        long accountNumber = Long.parseLong(reader.readLine());
        System.out.println("Account Number: " + accountNumber);

        // 8. boolean input
        System.out.print("Are you an employee? (true/false): ");
        boolean isEmployee = Boolean.parseBoolean(reader.readLine());
        System.out.println("Employee Status: " + isEmployee);

        // 9. char input (first character of string)
        System.out.print("Enter your blood group initial (A/B/O): ");
        char bloodGroup = reader.readLine().charAt(0);
        System.out.println("Blood Group: " + bloodGroup);

        // Summary
        System.out.println("\n--- Summary ---");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Height         : " + height + "ft");
        System.out.println("Weight         : " + weight + "kg");
        System.out.println("Byte Value     : " + byteValue);
        System.out.println("Short ID       : " + shortId);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Is Employee    : " + isEmployee);
        System.out.println("Blood Group    : " + bloodGroup);

        // No explicit need to close System.in stream
    }
}
