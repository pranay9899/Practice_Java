package _22_collections;

import java.util.*;

/**
 * This class demonstrates the usage of major Java Collections:
 * - List: Ordered, allows duplicates
 * - Set: Unordered, no duplicates
 * - Map: Key-value pairs, unique keys
 * - Queue: FIFO structure
 * It also covers iteration techniques and sorting.
 */
public class CollectionsDemo {

    public static void main(String[] args) {

        // List Example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // List allows duplicates

        System.out.println("List Example (fruits):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Set Example
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10); // Duplicate, won't be added

        System.out.println("\nSet Example (unique numbers):");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }

        // Map Example
        Map<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(1, "Alice");
        idNameMap.put(2, "Bob");
        idNameMap.put(3, "Charlie");
        idNameMap.put(2, "David"); // Key 2 will be updated to David

        System.out.println("\nMap Example (ID to Name):");
        for (Map.Entry<Integer, String> entry : idNameMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " => Name: " + entry.getValue());
        }

        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("\nQueue Example (FIFO):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Retrieves and removes head
        }

        // Sorting List
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);
        System.out.println("\nUnsorted numbers: " + numbers);

        Collections.sort(numbers); // Default ascending sort
        System.out.println("Sorted (Ascending): " + numbers);

        // Custom sort using Comparator (Descending order)
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Sorted (Descending): " + numbers);
    }
}

