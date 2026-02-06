import java.time.LocalDateTime;
import java.util.*;

public class MultiArrayExample{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       int[][] arr = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
}