import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Second {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        List<Integer> num= new ArrayList<>(5);
        while(i<n){
            num.add(sc.nextInt());
            i++;
        }
        System.out.println("Even numbers are:");
         List<Integer> even=num.stream()
        .filter(e -> e%2==0)
        .collect(Collectors.toList());

        System.out.println(even);
    }
}
