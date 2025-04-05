package _11_encapsulation;

/**
 * Write-only field using only setter (no getter).
 */
public class WriteOnlyProperty {
    private String password;

    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
            System.out.println("Password has been set.");
        } else {
            System.out.println("Password must be at least 6 characters.");
        }
    }

    public static void main(String[] args) {
        WriteOnlyProperty obj = new WriteOnlyProperty();
        obj.setPassword("secure123");

        // System.out.println(obj.password); ❌ Not allowed
        // System.out.println(obj.getPassword()); ❌ No getter provided
    }
}
