import java.util.Optional;

public class OptionalExample{
    public static void main(String[] args){
        Optional<Integer> name= getName(1);
        Integer check= name.orElse(null);
        System.out.print(check);
    }

    private static Optional<Integer> getName(int n){
        return Optional.empty();
    }
}