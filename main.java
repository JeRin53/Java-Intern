 import java.util.ArrayList;
 class Item{
        public String name;
        private int quantity;
        
        public Item(String name,int quantity){
                this.name=name;
                this.quantity=quantity;
        }
         public String getName(){
                return name;
                }
        public int getQuantity(){
                return quantity;
                }
        }
        
 class Inventory {
        
        private ArrayList<Item> items;
        
        public Inventory() {
                items= new ArrayList<>(); 
        }
        
        public void addItem(Item item) {
                items.add(item);
        }
        
        public void displayInventory(){
                for(Item item:items)
                        System.out.println("Item: " + item.getName() + "Quantity : " + item.getQuantity());
        }
}
      
public class main{
                public static void main(String[] args)
                {
                Inventory inventory=new Inventory();
                
                Item item1 = new Item("Apples",20);
                Item item2 = new Item("Orange",22);
                
                inventory.addItem(item1);
                inventory.addItem(item2);
                
                inventory.displayInventory();
                }
              }
                
                


