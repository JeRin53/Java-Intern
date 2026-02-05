import java.util.*;




public class Control2{

static boolean evenOdd(int n){
  return n % 2==0 ;
  }
    public static void main(String[] args){
        int num=0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(Control2.evenOdd(n)){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}