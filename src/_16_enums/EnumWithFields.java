package _16_enums;

/**
 * This example shows how Enums can have fields, constructors, and methods.
 */
enum Planet {
    MERCURY(3.3), VENUS(4.8), EARTH(5.9), MARS(6.4);

    private double mass; // mass in 10^24 kg

    // Constructor
    Planet(double mass) {
        this.mass = mass;
    }

    // Getter
    public double getMass() {
        return mass;
    }
}

public class EnumWithFields {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet + " has mass: " + planet.getMass() + " x10^24 kg");
        }
    }
}
