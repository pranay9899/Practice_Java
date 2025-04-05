package _12_inheritance;

// Hierarchical Inheritance: One parent, multiple children
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println("--- Car Actions ---");
        car.start();
        car.drive();

        System.out.println("--- Bike Actions ---");
        bike.start();
        bike.ride();
    }
}
