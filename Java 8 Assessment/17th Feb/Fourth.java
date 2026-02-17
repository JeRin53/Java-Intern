import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fourth {
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
        int sum= num.stream().mapToInt(Integer ::intValue).sum();
        System.out.println("Sum = " + sum);
        
    }
}