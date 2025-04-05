package _11_encapsulation;

/**
 * Demonstrates use of getters and setters.
 */
public class GetterSetter {
    private int score;

    // Getter
    public int getScore() {
        return score;
    }

    // Setter with validation
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Invalid score. Must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        GetterSetter student = new GetterSetter();
        student.setScore(95);
        System.out.println("Student Score: " + student.getScore());
    }
}
