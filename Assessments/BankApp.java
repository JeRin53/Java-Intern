class BankAccount {

    private int balance;
    public BankAccount(int amount) {
        balance = amount;
    }
    public synchronized void withdraw(int amount) {

        String thread = Thread.currentThread().getName();

        System.out.println(thread + " is trying to withdraw " + amount);
        System.out.println("Balance before withdrawal: " + balance);

        if (balance >= amount) {

            balance = balance - amount;

            System.out.println(thread + " withdrawal successful");
            System.out.println("Balance after withdrawal: " + balance);

        } else {

            System.out.println(thread + " cannot withdraw because of Insufficient balance");
            System.out.println("Balance remains: " + balance);
        }
            System.out.println("\n");
        try{
                Thread.sleep(1000);
                
                
                }catch(InterruptedException e)
                {
                
                }
      }
    }
        
    class User extends Thread{
    
        BankAccount account;
        int amount;
        
        public User(BankAccount acc, int amt, String name){
            super(name);
            this.account = acc;
            this.amount=amt;
            
        }
        public void run(){
            account.withdraw(amount);
      }
    }

public class BankApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        User user1 = new User(account, 800, "User1");
        User user2 = new User(account, 1200, "User2");

        user1.start();
        user2.start();
        }
    }
