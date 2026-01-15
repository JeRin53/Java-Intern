public class Decisionmaking{
        public static void main(String[] args)
        {
        int a=-9,b=20;
        if(a<b)
                System.out.println(b+"is grater ");
        if(a%2==0)
                System.out.println(a+"is even ");
        else
                System.out.println(a+"is odd ");
                
        if(a>0)
                System.out.println(a+"is positive");
        else if(a==0)
                System.out.println(a+"is 0");
        else
                System.out.println(a+"is negative");
                
        int day=3;
        switch(day){
            case 1:
                  System.out.println("is 0");
            case 2:
                  System.out.println("is 00");
            case 3:
                  System.out.println("is 000");
                  break;
            default:
                  System.out.println("is 0000");
            }
        }
      }
