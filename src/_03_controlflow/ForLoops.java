package _03_controlflow;

public class ForLoops {
    public static void main(String[] args) {

        // 1. Basic for loop
        // Use when you know how many times you want to loop
        System.out.println("Basic for loop - Counting 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            // Starts from 1, runs while i <= 5, increments i each time
            System.out.println("i = " + i);
        }

        System.out.println();

        // 2. Reverse for loop
        // Counts down from 5 to 1
        System.out.println("Reverse for loop - Counting down from 5:");
        for (int i = 5; i >= 1; i--) {
            // Starts from 5, runs while i >= 1, decrements i each time
            System.out.println("i = " + i);
        }

        System.out.println();

        // 3. Nested for loop
        // A loop inside another loop, often used for 2D data like matrices
        System.out.println("Nested for loop - Printing a 3x3 matrix of stars:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                // Prints a * in the same line, space separated
                System.out.print("* ");
            }
            // After printing one row, go to the next line
            System.out.println();
        }

        System.out.println();

        // 4. Enhanced for loop (for-each loop)
        // Used to iterate over arrays or collections
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Enhanced for loop - Iterating through an array:");
        for (int num : numbers) {
            // num holds each element of the array one by one
            System.out.println("Number: " + num);
        }
    }
}
