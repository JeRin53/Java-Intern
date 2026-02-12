import java.util.ArrayList;
import java.util.List;

public class  People  {
    public static void main(String[] args){
        List<String> ls = new ArrayList<>();
        ls.add("Jerin");
        ls.add("James");
        ls.add("Amal");
        ls.forEach(i -> System.out.println(i));
        System.out.println("all people with A : ");
        ls.stream()
        .filter (n -> n.startsWith("A"));
        .map (n -> n.toUpperCase());
        .forEach(System.out::println);
        

        Exam obj1= (i, j) ->  i+j;
            
        System.out.println(obj1.add(3,5));
    }
}