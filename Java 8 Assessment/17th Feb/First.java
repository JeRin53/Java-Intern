import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class First{
    public static void main(String[] args) {
        String[] arr= {"Jerin","Jacob","Palatty"};
        List<String> alpha = Arrays.stream(arr).sorted().toList();
        System.out.println(alpha);
    }
}