package _23_nested_classes;

/**
 * Demonstrates all types of nested classes in Java:
 * - Static Nested Class
 * - Inner (non-static) Class
 * - Local Class
 * - Anonymous Class
 */
public class NestedClassesDemo {

    // Static Nested Class (doesn't need outer class instance)
    static class StaticNested {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    // Inner Class (non-static, needs outer class instance)
    class Inner {
        void display() {
            System.out.println("Inside Inner (Non-static) Class");
        }
    }

    void demonstrateLocalClass() {
        // Local Class (defined inside a method)
        class Local {
            void display() {
                System.out.println("Inside Local Class (defined inside a method)");
            }
        }
        Local local = new Local();
        local.display();
    }

    void demonstrateAnonymousClass() {
        // Anonymous class extending a class or implementing an interface
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous Class implementing Runnable");
            }
        };
        anonymous.run();
    }

    public static void main(String[] args) {

        // Static Nested Class - can be called without creating an instance of outer class
        StaticNested staticNested = new StaticNested();
        staticNested.display();

        // Inner Class - needs an outer class instance
        NestedClassesDemo outer = new NestedClassesDemo();
        Inner inner = outer.new Inner();
        inner.display();

        // Local Class demonstration
        outer.demonstrateLocalClass();

        // Anonymous Class demonstration
        outer.demonstrateAnonymousClass();
    }
}
