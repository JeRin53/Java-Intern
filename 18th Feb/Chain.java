import java.util.Arrays;
import java.util.function.Consumer;

public class Chain{
    public static void main(String[] args){
    Consumer<String> print = s -> System.out.println(s);
    Consumer<String> toUpper = s -> 
    System.out.println(s.toUpperCase());
    

    Consumer<int[]> num = s -> System.out.println(Arrays.toString(s));
    // Consumer<int[]> nums = s -> {
    // for(int i=0;i<s.length;i++){
    //     s[i]+=1;
    // }System.out.println("Array after incrementing: " + Arrays.toString(s));};
     Consumer<int[]> nums = s -> {
    Arrays.stream(s).forEach(i -> System.out.println(i+1));};

    Consumer<int[]> combine = num.andThen(nums);
    // Chain operations
    Consumer<String> combined = print.andThen(toUpper);

    combined.accept("hello");
    int[] arr={1,2,3,4};
    combine.accept(arr);
    }
}