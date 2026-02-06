class Block{
   static int val_1;
   static int val_2;
   static void show(){
        System.out.println("The static block has been called.2");
   }
   static{
       System.out.println("The static block has been called.1");
       val_1=20;
       val_2=10;
      show();
   }

   static{
       System.out.println("The static block has been called.3");
   }
}
public class BlockExample{
   public static void main(String args[]){
      Block obj1= new Block();
      System.out.println(obj1.val_1);
      System.out.println(obj1.val_2);
      Block.show();
      
   }
}