import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  Even2  {
    public static void main(String[] args){
        List<Integer>ls = Arrays.asList(1,2,3,4);
        List<Integer>pd = new ArrayList<>();
        ls.stream()
        .filter(i -> i%2==0)
        .forEach(System.out::println);
}
}