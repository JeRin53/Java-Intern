import java.util.LinkedList;
import java.util.Scanner;

public class Scan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();

        for(int i=0; i<3 ; i++){
            ll.add(sc.nextLine());
        }
        sc.nextLine();
        System.out.println(ll);
        ll.add(1,"Hi");
        System.out.println(ll);

        sc.close();
    }
}