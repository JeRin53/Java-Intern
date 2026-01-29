import java.util.ArrayList;
import java.util.List;

class UserAccount {
    String username;
    double balance;

    UserAccount(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }
}

public class ReturnMastery {

    // 1. Returning a Primitive Value (int)
    public static int addBonus(int currentScore) {
        int bonus = 50;
        return currentScore + bonus; // Hands back the new total to the caller
    }

    // 2. Early Return (The "Guard Clause")
    public static void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Stopping payment.");
            return; // EXIT IMMEDIATELY: No more code in this method will run
        }
        System.out.println("Processing payment of: $" + amount);
    }

    // 3. Returning a Custom Object
    public static UserAccount createDefaultUser(String name) {
        UserAccount newUser = new UserAccount(name, 100.0);
        return newUser; // Hands back the entire object reference
    } 

    // 4. Returning a Collection (Multiple items)
    public static List<String> getPermissions() {
        List<String> list = new ArrayList<>();
        list.add("READ");
        list.add("WRITE");
        return list; // Returns the list as a single object
    }

    public static void main(String[] args) {
        // CATCHING return values in variables
        int finalScore = addBonus(100);
        System.out.println("Final Score: " + finalScore);

        // USING return to exit early
        processPayment(-50); // This will hit the 'return' and stop

        // STORING a returned object
        UserAccount user = createDefaultUser("Alice");
        System.out.println("User " + user.username + " created with balance: $" + user.balance);

        // ITERATING through a returned list
        List<String> perms = getPermissions();
        System.out.println("User Permissions: " + perms);
    }
}
