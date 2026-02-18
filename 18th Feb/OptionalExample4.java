import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample4{
    public static void main(String[] args){
        Optional<Integer> number= getName(1);
        Integer check= number.orElseThrow(() -> new NoSuchElementException());
        System.out.print(check);
    }

    private static Optional<Integer> getName(int n){
        return Optional.empty();
    }
}