import java.time.LocalDateTime;
import java.util.*;

public class TimeExample{
    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);
        name= sc.nextLine();
        System.out.println(name+ " has born on " + LocalDateTime.now());
    }
}