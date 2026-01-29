import java.util.*;

class ArrayExample{
    
    public static void main(String args[]){
      

        ArrayList<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");

      	System.out.println("Original List : "+al);
      	

        al.add(1, "For");

      	System.out.println("After Adding element at index 1 : "+ al);
      	

      	al.remove(0);
      
      	System.out.println("Element removed from index 0 : "+ al);
      	

      	al.remove("Geeks");
      
      	System.out.println("Element Geeks removed : "+ al);

      	al.set(0, "GFG");
      
        System.out.println("List after updation of value : "+al);
    }
}