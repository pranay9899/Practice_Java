package _15_interfaces;

/**
 * Basic interface with method signatures only.
 */
interface Vehicle {
    void start();
    void stop();
}

/**
 * A class implementing the Vehicle interface.
 */
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with brake.");
    }
}

public class InterfaceBasics {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
