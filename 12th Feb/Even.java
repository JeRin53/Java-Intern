import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  Even  {
    public static void main(String[] args){
        List<Integer>ls = Arrays.asList(1,2,3,4);
        List<Integer>pd = new ArrayList<>();
        for(Integer i=1; i<5;i++){
        if(i%2==0){
           pd.add(i);
        }
    }
        System.out.println(pd);
}
}