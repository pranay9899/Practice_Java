package _12_inheritance;

// Single Inheritance: One parent, one child
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class SingleInheritance extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        SingleInheritance dog = new SingleInheritance();
        dog.eat();  // inherited method
        dog.bark(); // child method
    }
}