import java.util.Optional;

public class OptionalExample3{
    public static void main(String[] args){
        Optional<Integer> number= getName(1);
        Integer check= number.orElseGet(() -> null);
        System.out.print(check);
    }

    private static Optional<Integer> getName(int n){
        return Optional.empty();
    }
}