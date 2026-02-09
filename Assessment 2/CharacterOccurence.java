import java.util.*;

public class CharacterOccurence {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        text.replace(" ","");
        for(int i=0;i<text.length();i++){
            char ch= text.charAt(i);
            int count=0;

            for(int j=0;j<text.length();j++){
                if(ch==text.charAt(j)){
                    count ++;
                }
            }

           if(text.indexOf(ch)==i){
                System.out.println(ch+" : "+ count);
            }
        }
        

    }
}
