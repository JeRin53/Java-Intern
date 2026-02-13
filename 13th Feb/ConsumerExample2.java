import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample2 {
    List<String> cities = new ArrayList<>();

    public void city() {
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add("Pune");
    }

    public static void main(String[] args) {
        ConsumerExample2 example = new ConsumerExample2();
        example.city(); 

        Consumer<String> printConsumer = city -> System.out.println(city);

        example.cities.forEach(printConsumer);
    }
}