import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Select_DB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Password@123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM transactions  where customer_id> ?"))
              { 
            System.out.println("Connection Established Successfully!");
             
             stmt.setInt(1, 2);
            ResultSet rs = stmt.executeQuery();
            System.out.println("id\tcustomer_id");
            while (rs.next()) {
                int id= rs.getInt("transaction_id");
                int customer_id=rs.getInt("customer_id");
                System.out.println(id + "\t" + customer_id);
            }

        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}

