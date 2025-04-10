package _24_annotations;

/**
 * Demonstrates use of built-in annotations like @Override, @Deprecated, @SuppressWarnings,
 * and how to define and use a custom annotation.
 */
public class AnnotationDemo {

    @Deprecated // Marks that this method should not be used anymore
    public void oldMethod() {
        System.out.println("This is a deprecated method");
    }

    @Override // Tells compiler that this method is overriding a superclass method
    public String toString() {
        return "AnnotationDemo class with built-in annotations";
    }

    @SuppressWarnings("unused") // Suppresses compiler warning for unused variable
    public void suppressedWarningExample() {
        int unusedVariable = 10; // This would normally cause a warning
    }

    public static void main(String[] args) {
        AnnotationDemo demo = new AnnotationDemo();
        demo.oldMethod(); // Using a deprecated method
        System.out.println(demo.toString());
    }
}
