import java.util.Optional;
import java.util.Scanner;

public class Example{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        if(name=isEmpty()){
            name=null;
        }

        Optional<String> obj = Optional.ofNullable(name);
        System.out.println("Null");
        
    }
}