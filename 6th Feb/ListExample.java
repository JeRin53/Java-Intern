import java.util.*;

public class ListExample{
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        for(int i : ls)
            System.out.println(i);
    }
}