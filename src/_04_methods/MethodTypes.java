package _04_methods;

public class MethodTypes {

    // 1. No return type & No parameters
    // Used for actions that don't need input and don't return anything
    public void greetUser() {
        System.out.println("Hello! Welcome to Java.");
    }

    // 2. No return type & With parameters
    // Useful when you want to process input but don't return anything
    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 3. With return type & No parameters
    // Returns a fixed value; no input needed
    public String getGreeting() {
        return "Good Morning!";
    }

    // 4. With return type & With parameters
    // Accepts input and returns a calculated value
    public int multiply(int x, int y) {
        return x * y;
    }

    // 5. Static method
    // Can be called without creating an object; useful for utility methods
    public static void printInfo() {
        System.out.println("This is a static method.");
    }

    // 6. Overloaded method (same name, different parameters)
    // Helps with code readability and reusability
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 7. Recursive method
    // A method that calls itself; useful for problems like factorial, Fibonacci, etc.
    public int factorial(int n) {
        if (n == 0) return 1; // base case
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();

        // Calling method with no return and no parameters
        obj.greetUser();

        // Method with parameters but no return
        obj.printSum(5, 10);

        // Method with return value and no parameters
        String greet = obj.getGreeting();
        System.out.println(greet);

        // Method with both return type and parameters
        int product = obj.multiply(4, 6);
        System.out.println("Product: " + product);

        // Static method call
        MethodTypes.printInfo();

        // Method overloading
        System.out.println("Int add: " + obj.add(10, 20));
        System.out.println("Double add: " + obj.add(10.5, 5.5));

        // Recursive method example
        int fact = obj.factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }
}
