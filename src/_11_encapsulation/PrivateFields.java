package _11_encapsulation;

/**
 * Demonstrates private fields (data hiding).
 */
public class PrivateFields {
    private String secret = "TopSecret123";

    public void revealSecret() {
        System.out.println("Secret value: " + secret);
    }

    public static void main(String[] args) {
        PrivateFields obj = new PrivateFields();
        obj.revealSecret();

        // Direct access like below is not allowed
        // System.out.println(obj.secret); ❌ Compile-time error
    }
}
