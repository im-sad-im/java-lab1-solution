import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {
        // Implementing Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");

        System.out.println("Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Implementing List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("\nList:");
        for (String item : list) {
            System.out.println(item);
        }

        // Implementing Set
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        System.out.println("\nSet:");
        for (String color : set) {
            System.out.println(color);
        }
    }
}
