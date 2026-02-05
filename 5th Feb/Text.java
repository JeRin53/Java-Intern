import java.util.*;


public class Text{
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter limit : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
         System.out.print("Enter Key " + i +": ");
        int key = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Key Value : ");
        String value = sc.nextLine();
        map.put(key,value);
        }
        SortedMap<Integer,String> sortMap = new TreeMap<>(map);

        for(Map.Entry<Integer,String> entry : sortMap.entrySet())
        {
            System.out.println("map key is " + entry.getKey() + "map value is" + entry.getValue());
        }
    }
}