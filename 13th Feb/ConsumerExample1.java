

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String args[])
    {
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i <= list.size(); i++)
                list.set(i, 2 - list.get(i));
        };
        Consumer<List<Integer> >  dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        System.out.println();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        try {
            dispList.andThen(modify).accept(list);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}