import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Student{
    public static void main(String[] args){
        

        Consumer<String> consume=  s -> System.out.println(s);

        consume.accept("Jerin");

        Consumer<List<Integer>> numbers = x ->
        {
            for(Integer i :x)
                System.out.println(i);
        };

        Consumer<List<Integer>> number = x ->
        {
            for(Integer i :x)
                System.out.println(i + 100);
        };

        numbers.accept(Arrays.asList(3,2,4));
        Consumer<List<Integer>> total= numbers.andThen(number);
        total.accept(Arrays.asList(9,3,6,1));
    }


}