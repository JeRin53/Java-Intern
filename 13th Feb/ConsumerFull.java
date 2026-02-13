import java.util.function.*;

public class ConsumerFull {
    public static void main(String[] args) {
        

        Predicate<Integer> predicate = p -> p%2==0;
        Function<Integer,Integer> function = i -> i*100;
        Supplier<Integer> supply = () -> 2;
        Consumer<Integer> consume= s -> System.out.println(s*3);

        consume.accept(function.apply(supply.get()));
        System.out.println(predicate.test(2));
        
    }
}
