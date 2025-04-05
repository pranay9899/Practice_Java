package _11_encapsulation;

/**
 * Read-only field using only a getter (no setter).
 */
public class ReadOnlyProperty {
    private final String country = "India";  // Immutable value

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        ReadOnlyProperty obj = new ReadOnlyProperty();
        System.out.println("Country: " + obj.getCountry());

        // obj.country = "USA"; ❌ Not allowed (final + private)
    }
}
