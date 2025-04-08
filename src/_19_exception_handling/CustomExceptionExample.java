package _19_exception_handling;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    static void validateMarks(int marks) throws CustomException {
        if (marks < 0 || marks > 100) {
            throw new CustomException("Marks should be between 0 and 100.");
        } else {
            System.out.println("Marks are valid: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            validateMarks(110);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
