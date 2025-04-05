package _15_interfaces;

/**
 * Functional Interface: only one abstract method.
 */
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class FunctionalInterfaceLambda {
    public static void main(String[] args) {
        // Using Lambda Expression
        Greeting greet = () -> System.out.println("Hello from Lambda!");
        greet.sayHello();
    }
}
