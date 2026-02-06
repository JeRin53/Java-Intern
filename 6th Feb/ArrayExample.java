
import java.util.Arrays;
import java.util.Scanner;

class Student{
    public static void show(int[] x){
        x[0]=99;
    }

    public static int calculateSum(int[] b){
        int sum=0;
        for(int i : b){
            sum +=i;
        }
        return sum;
    }
}
public class ArrayExample{
    public static void main(String[] args){
        int[] arr = new int[5];
        int i=0;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(arr));
        String numbers = Arrays.toString(arr);
        int[] arrCopy = arr.clone(); 
        System.out.println("number:"+numbers);
        Student.show(arr);
        System.out.println("number after updated:"+ Arrays.toString(arr));
        int sum=Student.calculateSum(arrCopy);
        System.out.println("number after Summed:"+ sum);
    }
}