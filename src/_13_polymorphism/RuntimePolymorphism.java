package _13_polymorphism;

/**
 * Demonstrates Runtime Polymorphism using method overriding.
 * The method that gets executed is determined at runtime based on the object's actual type.
 */

// Superclass
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick!");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a button press!");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Vehicle myVehicle;

        myVehicle = new Bike();  // Runtime decision
        myVehicle.start();       // Output: Bike is starting with a kick!

        myVehicle = new Car();   // Now reference points to Car
        myVehicle.start();       // Output: Car is starting with a button press!
    }
}
