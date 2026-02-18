import java.util.Optional;

public class OptionalExample2{
    public static void main(String[] args){
        Optional<Integer> name= getName(1);
        Integer check= name.isPresent()? name.get():null;
        System.out.print(check);
    }

    private static Optional<Integer> getName(int n){
        return Optional.empty();
    }
}