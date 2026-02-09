
import java.util.Arrays;
import java.util.*;

public class ArrayExam{
    static void secondLargest(int[]arr){
        int first=0;
        int second=0;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            }
            else if (i>second && i!=first){
                second=i;
            }
        }
        System.out.println("Second largest element is:"+ second);

    }

    static void duplicate(int[] arr){
        Set<Integer> set= new HashSet<>();
        for (int i: arr) 
            set.add(i);
        System.out.println("After removing:" + set);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        secondLargest(arr);
        duplicate(arr);

    }
}