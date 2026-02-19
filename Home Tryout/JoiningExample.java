import java.util.*;
import java.util.stream.*;

public class JoiningExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jerin", "John", "James");

        String joined = names.stream()
                .collect(Collectors.collect(", "));

        System.out.println(joined);
    }
}
