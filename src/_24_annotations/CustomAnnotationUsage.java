package _24_annotations;

/**
 * Demonstrates how to use a custom annotation and retrieve it using reflection.
 */
public class CustomAnnotationUsage {

    @CustomAnnotation(value = "Important Method", version = 2)
    public void annotatedMethod() {
        System.out.println("This method is annotated with a custom annotation.");
    }

    public static void main(String[] args) throws Exception {
        CustomAnnotationUsage obj = new CustomAnnotationUsage();
        obj.annotatedMethod();

        // Use reflection to get annotation info
        CustomAnnotation annotation = obj.getClass()
                .getMethod("annotatedMethod")
                .getAnnotation(CustomAnnotation.class);

        if (annotation != null) {
            System.out.println("CustomAnnotation found with value: " + annotation.value());
            System.out.println("Version: " + annotation.version());
        }
    }
}
