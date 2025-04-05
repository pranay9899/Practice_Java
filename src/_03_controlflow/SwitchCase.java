package _03_controlflow;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;

        // A switch statement allows you to choose one of many code blocks to be executed.
        // It's cleaner than using multiple if-else statements when checking the same variable against many values.

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // exit the switch after matching case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // This executes when no matching case is found
                System.out.println("Invalid day");
        }
    }
}
