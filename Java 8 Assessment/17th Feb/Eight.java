import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Eight {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit:");
        int n= sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("The First  number greater than 50 in the list is :");
        Integer result=list.stream()
        .filter(e -> e > 50)
        .findFirst()
        .orElse(null);

        System.out.println(result);
        
    
    }
}

