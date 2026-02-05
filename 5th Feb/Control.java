import java.util.*;

public class Control{
    public static void main(String[] args){
        int num=0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("nums  are: ");
        for(int i=0;i<n;i++){
             
            if(i==5)
             break;
            System.out.println(i + " ");
            
        }
         System.out.print("exit");
         sc.close();
    }
}