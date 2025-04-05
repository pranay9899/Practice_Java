package _15_interfaces;

/**
 * Interface A
 */
interface Flyable {
    void fly();
}

/**
 * Interface B
 */
interface Swimmable {
    void swim();
}

/**
 * Class implementing both interfaces
 * - Demonstrates multiple inheritance using interfaces
 */
class BirdFish implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Flying in the sky...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming in the water...");
    }
}

public class MultipleInheritanceWithInterfaces {
    public static void main(String[] args) {
        BirdFish creature = new BirdFish();
        creature.fly();
        creature.swim();
    }
}
