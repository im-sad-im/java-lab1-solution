import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        // Creating an ArrayList to store names
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Hari");
        names.add("Gopal");

        // Accessing the elements using Iterator
        accessElementsUsingIterator(names);
    }

    private static void accessElementsUsingIterator(List<String> list) {
        // Getting the iterator for the list
        Iterator<String> iterator = list.iterator();

        // Using iterator to access elements
        System.out.println("Accessing elements using Iterator:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
