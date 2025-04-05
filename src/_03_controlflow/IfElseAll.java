package _03_controlflow;

public class IfElseAll {
    public static void main(String[] args) {
        int number = -5;

        // 1. Simple if statement
        // Executes this block only if the condition is true
        if (number != 0) {
            System.out.println("Number is not zero");
        }

        // 2. if-else statement
        // Executes one block if true, another if false
        if (number > 0) {
            System.out.println("Positive number (checked using if-else)");
        } else {
            System.out.println("Not a positive number (checked using if-else)");
        }

        // 3. else-if ladder
        // Useful when you have multiple conditions to check in sequence
        if (number > 0) {
            System.out.println("Positive number (checked using else-if ladder)");
        } else if (number < 0) {
            System.out.println("Negative number (checked using else-if ladder)");
        } else {
            System.out.println("Number is zero (checked using else-if ladder)");
        }

        // 4. Nested if
        // An if statement inside another if statement
        int a = 10;
        int b = 20;

        if (a > 0) {
            if (b > a) {
                System.out.println("b is greater than a (checked using nested if)");
            }
        }

        // BONUS: Check if a number is even or odd using if-else
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
