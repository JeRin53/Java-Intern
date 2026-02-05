import java.util.*;

public class Control1{
    public static void main(String[] args){
        int num=0;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
          System.out.print(" numbers are : ");
        for(int i=0;i<n;i++){
             if(i%2==1)
                continue;
             System.out.print(i + " ");
            
        }
         System.out.print("nil");
    }
}