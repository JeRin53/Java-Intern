import java.util.*;
import java.util.function.Consumer;
class Consable implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.println(i);
    }
}
public class Lamda2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2,3,1,5,4);
    //     Consumer<Integer> c=new Consumer<Integer>() {
    //         public void accept(Integer i){
    //         System.out.println(i);
    // }
    Consumer<Integer> c= i -> System.out.println(i);
    list.forEach(c);

        };
        }