package _25_generics;

/**
 * Demonstrates:
 * 1. Generic class
 * 2. Generic method
 * 3. Bounded type parameter
 * 4. Wildcards
 */

// Generic class that works with any type T
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// Generic method to print any type of array
class GenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Generic class with bounded type (only Number or its subclasses)
class Calculator<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

// Class to demonstrate wildcards
class WildcardDemo {
    public static void printListData(java.util.List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        // Generic class usage
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics!");
        System.out.println("Box contains: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Box contains: " + intBox.get());

        // Generic method usage
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"Java", "Generics", "Demo"};
        System.out.print("Integer array: ");
        GenericMethod.printArray(intArr);
        System.out.print("String array: ");
        GenericMethod.printArray(strArr);

        // Bounded type usage
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println("Sum (bounded): " + intCalc.add(10, 20));

        // Wildcard usage
        java.util.List<String> strList = java.util.Arrays.asList("One", "Two", "Three");
        java.util.List<Integer> numList = java.util.Arrays.asList(100, 200, 300);
        System.out.print("Wildcard list (Strings): ");
        WildcardDemo.printListData(strList);
        System.out.print("Wildcard list (Integers): ");
        WildcardDemo.printListData(numList);
    }
}
