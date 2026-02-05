import java.util.Scanner;

class Exam{
    static void decBin(int n){
        int[] arr = new int[100];
        int i;
        for( i=0;0<n;i++){
            arr[i]=n%2;
            n= n/2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j] + " ");
        }
        }
    }

public class DecBinary{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        System.out.println("decimal no. is = " + n);
        System.out.println("Binary  no. is = ");
        Exam.decBin(n);

    }
}