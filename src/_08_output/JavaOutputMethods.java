package _08_output;

/**
 * JavaOutputMethods class
 * -----------------------
 * Demonstrates various output methods in Java including:
 * - System.out.print()
 * - System.out.println()
 * - System.out.printf()
 * - String.format()
 * - System.err.println()
 */
public class JavaOutputMethods {
    public static void main(String[] args) {

        // --- System.out.print() ---
        // Outputs text on the same line without adding a new line at the end
        System.out.print("This is printed using print(). ");
        System.out.print("It continues on the same line. ");
        System.out.print("Still same line!\n"); // add manual line break

        // --- System.out.println() ---
        // Outputs text followed by a new line (moves to the next line)
        System.out.println("This is printed using println().");
        System.out.println("Each println() starts on a new line.");

        // --- System.out.printf() ---
        // Used for formatted output — similar to C-style formatting
        // Useful when you want aligned or structured output
        String name = "Pranay";
        int age = 22;
        double percentage = 88.75;

        System.out.printf("Name: %s | Age: %d | Percentage: %.2f%%\n", name, age, percentage);
        // %s = String, %d = integer, %.2f = float with 2 decimal points, %% = percent symbol

        // --- String.format() ---
        // Similar to printf, but it returns the formatted string instead of printing it
        String formatted = String.format("Formatted String -> Name: %s, Age: %d, Score: %.1f", name, age, percentage);
        System.out.println(formatted); // then we can print it normally

        // --- System.err.println() ---
        // Used to print error messages (displays in red in most IDEs/terminals)
        System.err.println("This is an error message using System.err");

        // --- Print variables together using concatenation ---
        int x = 10;
        int y = 20;
        System.out.println("Sum of x and y is: " + (x + y));  // Concatenates and evaluates the expression

        // --- Unicode characters and escape sequences ---
        System.out.println("Unicode example: \u2764"); // Heart symbol
        System.out.println("New line \nTab space \tQuote: \"Hello\"");
    }
}
