import java.util.*;
class BankAccount{
        int accountNumber;
        String accountHolderName;
        int balance;
        
        
        void deposit(int deposit){
        deposit += balance;
        System.out.println("The total balance after deposit is :" + balance);
        }
        
        void withdraw(double amount){
        if(amount<=balance){
          balance -= amount;
          System.out.println("Amount"  + amount + "has been withdrawn:");
          }
        else{
          System.out.println("Amount"  + amount + "has not been withdrawn:");
        }
          
          System.out.println("The total balance after withdrawn  is :" + balance);
          
        }
        
        public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        BankAccount bank=new BankAccount();
        System.out.println("Enter Account number");
        int acc = sc.nextInt();
        System.out.println("Enter Account Holder name");
        String accName= sc.nextLine();
        System.out.println("Enter initial balance ");
        double balance= sc.nextDouble();
        System.out.println("choose option :");
        System.out.println("\n 1.Deposit \n 2.Withdrawn \n 3.View Account Details \n 4 4.Exit" );
        int option = sc.nextInt();
        switch(option){
        case 1:
          bank.deposit(1000);
          break;
        case 2:
          bank.withdraw(2000);
          break;
        case 3:
          System.out.println("Account details are: ");
          System.out.println("Given account no. is :"+ acc);
          System.out.println("Account holder name is : "+ accName);
          System.out.println("The initial balance is : "+ balance);
          break;
        case 4:
          System.exit(0);
          break;
        
        
        }
      }
  }
        
        
