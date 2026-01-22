// 1. ABSTRACTION: Interface defines the 'what' (contract) without the 'how'
interface PaymentMethod {
    void pay(double amount);
}

// 2. ENCAPSULATION: Data is hidden and accessed only via methods
class UserAccount {
    private double balance = 5000.0; // Private to prevent direct modification

    public double getBalance() {
        return balance;
    }

    public void deduct(double amount) {
        if (amount <= balance) balance -= amount;
    }
}

// 3. INHERITANCE: CreditCard and UPI 'extend' the concept of Payment
class CreditCard extends UserAccount implements PaymentMethod {
    @Override
    public void pay(double amount) {
        deduct(amount);
        System.out.println("Paid $" + amount + " via Credit Card. New Balance: $" + getBalance());
    }
}

class UPI extends UserAccount implements PaymentMethod {
    @Override
    public void pay(double amount) {
        deduct(amount);
        System.out.println("Paid $" + amount + " via UPI. New Balance: $" + getBalance());
    }
}

// THE ENTRY POINT: Necessary to run the program
public class Main {
    public static void main(String[] args) {
        // 4. POLYMORPHISM: One interface (PaymentMethod) takes multiple forms
        PaymentMethod myPayment;

        myPayment = new CreditCard();
        myPayment.pay(150.0); // Execution depends on the object type (CreditCard)

        myPayment = new UPI();
        myPayment.pay(50.0);  // Same method name, different behavior (UPI)
    }
}

