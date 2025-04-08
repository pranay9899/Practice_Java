package _19_exception_handling;
// Declares the package for organizational purposes, grouping related classes together.

class FinallyExample {
    // Defines the class 'FinallyExample'.
    public static void main(String[] args) {
        // The main method serves as the program's entry point.

        /**
         *  The finally block is a feature of exception handling.
         *  It ensures that certain code always runs, regardless of whether an exception occurs.
         *  This is especially useful for cleanup tasks or mandatory code execution.
         **/
        try {
            int[] numbers = {1, 2, 3};
            // Declares an integer array with three elements.
            System.out.println(numbers[3]);
            // Tries to access the 4th element (index 3) of the array.
            // This will throw an ArrayIndexOutOfBoundsException as the index is out of range.
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catches the ArrayIndexOutOfBoundsException when trying to access an invalid array index.
            System.out.println("Exception: " + e.getMessage());
            // Prints the exception message to notify the user of the error.
        } finally {
            System.out.println("This block always executes.");
            // The 'finally' block executes no matter what happens,
            // ensuring that this message is printed even if an exception occurs.
        }
    }
}
