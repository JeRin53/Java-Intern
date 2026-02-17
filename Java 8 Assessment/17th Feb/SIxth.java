import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SIxth {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter limit:");
    Map<Integer,String> map = new HashMap<>();
    int n= sc.nextInt();
    for(int i=0 ; i<n ; i++){
        System.out.println("Enter the key : ");
        int key=sc.nextInt();
        System.out.println("Enter the value : ");
        String value = sc.next();
        map.put(key,value);
    }
    map.forEach((k,v) -> System.out.println(k+ " : " + v));
    }
}
