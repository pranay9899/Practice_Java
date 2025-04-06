package _16_enums;

/**
 * This class demonstrates the basics of Enums in Java.
 */
enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class EnumBasics {
    public static void main(String[] args) {
        // Assigning an enum value
        Direction dir = Direction.NORTH;
        System.out.println("Direction: " + dir);

        // Comparing enum values using ==
        if (dir == Direction.NORTH) {
            System.out.println("You're heading North!");
        }

        // Iterating over enum values
        System.out.println("\nAll directions:");
        for (Direction d : Direction.values()) {
            System.out.println(d);
        }
    }
}
