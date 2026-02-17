import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nine {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit:");
        int n= sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("After Removing duplicates :");
        List<Integer> num=list.stream()
        .distinct()
        .collect(Collectors.toList());

        System.out.println(num);
    }
}
