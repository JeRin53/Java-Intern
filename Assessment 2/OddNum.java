public class OddNum {
    public static boolean checkOdd(int[] arr){
        for(int i: arr)
        if(arr[i]%2==0){
            return false;
        }
        return true;
        }
    
    public static void main(String[] args) {
        int[] arr={1,3};
        if(checkOdd(arr)){
            System.out.println("It is odd");
        }
        else{
            System.out.println("Contains  even no.s alsoo");
        }
    }
}
