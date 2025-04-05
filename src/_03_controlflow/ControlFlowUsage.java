package _03_controlflow;

public class ControlFlowUsage {
    
    public static void main(String[] args) {

        // ============================
        // 1. if, else if, else
        // ============================
        int marks = 85;

        // if-else helps to take decisions based on conditions
        if (marks >= 90) {
            System.out.println("Excellent!"); // Executes if marks >= 90
        } else if (marks >= 75) {
            System.out.println("Very Good!"); // Executes if marks are between 75 and 89
        } else {
            System.out.println("Needs Improvement"); // Executes if marks < 75
        }

        // ============================
        // 2. switch-case with break
        // ============================
        int choice = 2;

        // switch is used when we check one variable against multiple constant values
        switch (choice) {
            case 1:
                System.out.println("Option 1 Selected");
                break; // Exit switch after a case is matched
            case 2:
                System.out.println("Option 2 Selected");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        // ============================
        // 3. for loop with continue and break
        // ============================
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue");
                continue; // Skips current iteration when i == 3
            }

            if (i == 5) {
                System.out.println("Breaking loop at 5");
                break; // Exits the loop when i == 5
            }

            System.out.println("i = " + i);
        }

        // ============================
        // 4. while loop with continue and break
        // ============================
        System.out.println("While Loop Example:");
        int w = 0;
        while (w < 5) {
            w++;

            if (w == 2) {
                System.out.println("Continue at w = 2");
                continue; // Skip printing 2
            }

            if (w == 4) {
                System.out.println("Break at w = 4");
                break; // Stop loop when w is 4
            }

            System.out.println("w = " + w);
        }

        // ============================
        // 5. do-while loop with break and continue
        // ============================
        System.out.println("Do-While Loop Example:");
        int d = 0;
        do {
            d++;

            if (d == 2) {
                System.out.println("Do-While continue at d = 2");
                continue; // Skips current iteration
            }

            if (d == 4) {
                System.out.println("Do-While break at d = 4");
                break; // Exit loop early
            }

            System.out.println("d = " + d);
        } while (d < 5);

        // ============================
        // 6. return statement in a method
        // ============================
        int result = checkEvenOrOdd(7); // We use return to exit a method and send back a value
        System.out.println("checkEvenOrOdd(7) returned: " + result);
    }

    // Method demonstrating use of 'return'
    public static int checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return 0; // Returning 0 means even
        } else {
            return 1; // Returning 1 means odd
        }
    }
}
