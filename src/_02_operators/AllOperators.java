package _02_operators;

/**
 * This class demonstrates all major types of Java operators:
 * Arithmetic, Relational, Logical, Assignment, Unary, Bitwise, and Ternary.
 */
public class AllOperators {
    public static void main(String[] args) {

        int a = 10, b = 3;

        // 🔹 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division (int division)
        System.out.println("a % b = " + (a % b));  // Modulo (remainder)

        // 🔹 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal
        System.out.println("a <= b: " + (a <= b));  // Less than or equal

        // 🔹 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  // AND
        System.out.println("x || y: " + (x || y));  // OR
        System.out.println("!x: " + (!x));          // NOT

        // 🔹 4. Assignment Operators
        int num = 5;
        System.out.println("\nAssignment Operators:");
        num += 3;  // num = num + 3
        System.out.println("num += 3 → " + num);
        num -= 2;  // num = num - 2
        System.out.println("num -= 2 → " + num);
        num *= 4;  // num = num * 4
        System.out.println("num *= 4 → " + num);
        num /= 2;  // num = num / 2
        System.out.println("num /= 2 → " + num);
        num %= 3;  // num = num % 3
        System.out.println("num %= 3 → " + num);

        // 🔹 5. Unary Operators
        int value = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("value = " + value);
        System.out.println("++value = " + (++value));  // Pre-increment
        System.out.println("--value = " + (--value));  // Pre-decrement
        System.out.println("value++ = " + (value++));  // Post-increment
        System.out.println("value-- = " + (value--));  // Post-decrement
        System.out.println("Final value = " + value);  // Final result

        // 🔹 6. Bitwise Operators
        int p = 5, q = 3;
        // 5 = 0101, 3 = 0011 (in binary)
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q));  // AND = 0001 = 1
        System.out.println("p | q = " + (p | q));  // OR  = 0111 = 7
        System.out.println("p ^ q = " + (p ^ q));  // XOR = 0110 = 6
        System.out.println("~p = " + (~p));        // NOT = Inverts bits
        System.out.println("p << 1 = " + (p << 1)); // Left shift = 10
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift = 2

        // 🔹 7. Ternary Operator
        int max = (a > b) ? a : b;  // condition ? value_if_true : value_if_false
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b = " + max);
    }
}
