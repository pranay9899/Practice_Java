package _19_exception_handling;

class FinallyExample {
    public static void main(String[] args) {
        /**
         *  The finally block follows a try block or a catch block.
         *  A finally block of code always executes, irrespective of occurrence of an Exception.
         *  Using a finally block allows you to run any cleanup-type statements that you want to execute,
         *  no matter what happens in the protected code.
         **/
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}