import java.util.*;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class OptionalExample {

    public static void main(String[] args) {

        // Case 1: User exists
        Optional<User> user1 = findUserById(1);

        String name1 = user1
                .map(User::getName)
                .map(String::toUpperCase)
                .orElse("Unknown");

        System.out.println("User 1 Name: " + name1);

        // Case 2: User does NOT exist
        Optional<User> user2 = findUserById(2);

        String name2 = user2
                .map(User::getName)
                .map(String::toUpperCase)
                .orElse("Unknown");

        System.out.println("User 2 Name: " + name2);
    }

    // Simulated database method
    public static Optional<User> findUserById(int id) {

        if (id == 1) {
            return Optional.of(new User("Jerin"));
        } else {
            return Optional.empty();
        }
    }
}
