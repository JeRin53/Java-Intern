import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create and populate an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");   // index 0
        fruits.add("Banana");  // index 1
        fruits.add("Mango");   // index 2
        fruits.add("Grapes");  // index 3

        // Retrieve the element at index 1 ("Banana")
        String secondFruit = fruits.get(1);

        // Print the retrieved element
        System.out.println("The element at index 1 is: " + secondFruit);
    }
}
