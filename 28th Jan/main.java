class Notification{
                
                 void send(){
                        System.out.println("A notification send");
                }
              }
                
                class EmailNotification extends Notification{
                        @Override
                         void send(){
                        System.out.println("Email notification has been send");
                }
                
                }
                class SmsNotification extends Notification{
                        @Override
                         void send(){
                        System.out.println("Sms notification has been send");
                }
                
                }
              
              class main{ 
              public static void main(String[] args ){
              
              SmsNotification n2 = new SmsNotification();
              n2.send();
              }
              }
            
      
