import java.util.*;
import java.util.stream.*;

public class StreamFullExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jerin", "John", "James");

        List<String> result = names.stream()
                .filter(s -> s.length() > 3)       // Keep names with 4+ characters
                .distinct()                        // Remove duplicates
                .map(String::toUpperCase)          // Convert to uppercase
                .sorted()                          // Sort alphabetically
                .limit(2)                          // Take first 2 elements
                .collect(Collectors.toList());     // Terminal operation

        System.out.println("Final Result:");
        System.out.println(result);
    }
}
