import java.util.Scanner;

public class Exam1{
    public static void main(String[] args){
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no.s");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}