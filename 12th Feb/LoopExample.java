import java.util.*;

public class LoopExample {
    public static void main(String[] args) {

        List<String> names =
            Arrays.asList("Rahul","Ravi","Anu","Ram","Sita");

       
        for(String n : names)
            System.out.println(n);

       
        names.forEach(n -> System.out.println(n));

     
        names.forEach(n -> 
            System.out.println(n.toUpperCase()));

       
        names.stream()
             .filter(n -> n.startsWith("R"))
             .forEach(System.out::println);
    }
}

