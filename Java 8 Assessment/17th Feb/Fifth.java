import java.util.Optional;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name");
        String name = sc.nextLine();
        if(name.isEmpty())
        name=null;

        Optional<String> opt = Optional.ofNullable(name);

        System.out.println(opt.orElse("null"));
    }
}
