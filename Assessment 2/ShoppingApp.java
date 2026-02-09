import java.util.ArrayList;
import java.util.List;

class Product {
    private int productId;
    protected String productName;
    protected static int price;

    Product(int productId, String productName , int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    public void getId(int id){
            this.productId=id;
        }

    public static int calculateDiscount(){
        return price*10;
    }
     void  display(){
        System.out.println("Product id is: "+ productId + " Product name is: " + productName+ " Price is : " + price);
    }

    }


    class Electronics extends Product{
        int warratyPeriod;
        Electronics(int productId, String productName , int price,int w){
        super(productId, productName, price);
        warratyPeriod=w;
        }
        public void setWarranty(int warratyPeriod){
            this.warratyPeriod=warratyPeriod;
            System.out.println("The warranty period of product "+ productName+" is :"+ warratyPeriod);
        }
        
        public static  int calculateDiscount(){
            return price*5;
        }
    }

    class Clothing extends Product{
        int size;

        Clothing(int productId, String productName , int price,int s){
        super(productId, productName, price);
            size=s;

        }
        public static  int calculateDiscount(){
            return price*20;
        }
    }


public class ShoppingApp {
    public static void main(String[] args){
    List<String> obj = new ArrayList<>();
    obj.add("Sprit");
    obj.add("Mirinda");
    System.out.println(obj);
    
    Product obj1= new Product(101,"Pepsi",200);
    Product obj2= new Product(102,"Coco-Cola",250);
    obj1.display();
    Electronics ec1= new Electronics(100, "Phone", 3000, 5);
    System.out.println("Price after overriding :"+Product.calculateDiscount());
    obj1.getId(5);
    ec1.setWarranty(10);
   
    }
    
}
