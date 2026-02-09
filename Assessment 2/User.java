import java.util.Scanner;

public class User {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        int length= text.length();
        System.out.println("Text characters length is : "+length);
        String[] words = text.split(" ");
        System.out.println("Text words length is : "+words.length);
        StringBuilder sb= new StringBuilder(text);
        System.out.println("The reverse of text  is : "+ sb.reverse());


    }
}
