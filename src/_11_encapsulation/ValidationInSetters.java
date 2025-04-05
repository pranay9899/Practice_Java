package _11_encapsulation;

/**
 * Demonstrates validation logic inside setters.
 */
public class ValidationInSetters {
    private String email;

    public void setEmail(String email) {
        if (email.contains("@") && email.endsWith(".com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        ValidationInSetters user = new ValidationInSetters();
        user.setEmail("john.doe@example.com");
        System.out.println("Email set to: " + user.getEmail());
    }
}
