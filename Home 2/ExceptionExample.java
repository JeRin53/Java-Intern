public class ExceptionExample {
    public static void main(String[] args) {
        int a=5;
        try{
            try{
             a= a/0;
            System.out.println("value of a : " + a);
        }catch(Exception e){
            System.out.println("Exception " + e.getMessage());
        }
    }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("The finally gets executed");
        }

    }
}
