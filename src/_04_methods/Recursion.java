package _04_methods;

/**
 * This class demonstrates the concept of Recursion in Java.
 * Recursion is a technique where a method calls itself to solve a smaller part of the problem.
 */
public class Recursion {

    // Recursive method to calculate factorial of a number
    public static int factorial(int n) {
        // Base condition: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: 0th = 0, 1st = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive call for previous two numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive method to calculate sum of digits of a number
    public static int sumOfDigits(int number) {
        // Base condition: if number is 0, return 0
        if (number == 0) {
            return 0;
        }
        // Add last digit + recursive call on remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {

        // Factorial of 5 => 5 * 4 * 3 * 2 * 1 = 120
        int fact = factorial(5);
        System.out.println("Factorial of 5 is: " + fact);

        // 6th Fibonacci number => 0, 1, 1, 2, 3, 5, 8
        int fib = fibonacci(6);
        System.out.println("6th Fibonacci number is: " + fib);

        // Sum of digits of 1234 => 1 + 2 + 3 + 4 = 10
        int digitSum = sumOfDigits(1234);
        System.out.println("Sum of digits of 1234 is: " + digitSum);
    }
}
