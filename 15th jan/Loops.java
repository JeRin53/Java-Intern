public class Loops {
    public static void main(String[] args) {
    
        System.out.println("For Loop:");
        for(int i=1;i<=5;i++)
                System.out.println("i ="+i);
                
        System.out.println("while Loop:");
        int j=1;
        System.out.println("j =");
        while(j<=5){
                System.out.println("   "+j);
        j++;
        }
        
        System.out.println("do while Loop:");
        int k=1;
        do{
                System.out.println("k ="+k);
        k++;
        }while(k<=5);
        
        
        System.out.println("Enhanced for each loop");
        int[] arr={1,2,3,4};
        for(int num:arr){
                System.out.println("num ="+ num);
        }
      }
    }
                
                
