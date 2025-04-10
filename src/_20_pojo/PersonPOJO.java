package _20_pojo;
/**
 * A simple POJO (Plain Old Java Object) class named PersonPOJO.
 * This class has private fields, public getters and setters,
 * and overrides equals(), hashCode(), and toString().
 */
public class PersonPOJO {

    // Fields (attributes) of the class
    private String name;
    private int age;
    private String email;

    // Default constructor
    public PersonPOJO() {
    }

    // Parameterized constructor
    public PersonPOJO(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override toString() to display object details
    @Override
    public String toString() {
        return "PersonPOJO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    // Override equals() to compare based on name and email
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                // Same object reference
        if (obj == null || getClass() != obj.getClass()) return false;

        PersonPOJO person = (PersonPOJO) obj;
        return name.equals(person.name) && email.equals(person.email);
    }

    // Override hashCode() to match equals logic
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    // Main method to test the POJO
    public static void main(String[] args) {
        PersonPOJO person1 = new PersonPOJO("Alice", 25, "alice@example.com");
        PersonPOJO person2 = new PersonPOJO("Alice", 30, "alice@example.com");

        // toString output
        System.out.println("Person1: " + person1);

        // equals comparison
        System.out.println("Are they equal? " + person1.equals(person2));

        // hashCode output
        System.out.println("HashCode of Person1: " + person1.hashCode());
        System.out.println("HashCode of Person2: " + person2.hashCode());
    }
}
