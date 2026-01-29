abstract class Payment {
                       int balance= 10000;
                        abstract void processPayment(double amount);
                        }
                class CreditCardPayment extends Payment{
                        void processPayment(double amount){
                                balance -=amount;
                         System.out.println("Credit card balance limit after payment of " + amount + "is: " + balance);
                        }
                        
                }
                class UpiPayment extends Payment{
                        void processPayment(double amount){
                                balance -=amount;
                                System.out.println("Account balance  after payment of " + amount + "is: " + balance);
                        }
                        
                }
              
              public class PaymentApp{
                public static void main(String[] args){
                    Payment p1 = new CreditCardPayment();
                    Payment p2 = new UpiPayment();
                    
                    p1.processPayment(2000);
                    p2.processPayment(1500);
                }
              }
