import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Third {
    public static void main(String[] args) {
        String[] arr= {"Jerin","Jacob","Palatty"};
        List<String> alpha = Arrays.stream(arr).map(e -> e.toUpperCase()).toList();
        System.out.println(alpha);
    }
}
