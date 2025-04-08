package _19_exception_handling; // Declares the package name for organizational purposes.

class MultipleCatchExample { // Defines the class 'MultipleCatchExample'.
    public static void main(String[] args) { // The main method is the entry point of the program.
        try {
            // Attempts to execute the following block of code which may throw exceptions.
            String str = null;
            // Declares a String variable 'str' and assigns it a null value.

            System.out.println(str.length());
            // Tries to access the length of the string. This will throw a NullPointerException
            // because 'str' is null and doesn't point to a valid object.
        } catch (NullPointerException e) {
            // Catches NullPointerException specifically when 'str.length()' is accessed on a null object.
            System.out.println("Caught NullPointerException: " + e.getMessage());
            // Prints an error message for the caught NullPointerException.
        } catch (Exception e) {
            // Catches other generic exceptions (if any) that are not NullPointerException.
            System.out.println("Caught generic exception: " + e.getMessage());
            // Prints an error message for the generic exception.
        }
    }
}
