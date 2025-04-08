package _19_exception_handling;

class ThrowThrowsExample {
    // Method that declares an exception with throws
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
    }
}