import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Create_DB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Password@123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) { 
            System.out.println("Connection Established Successfully!");

            
            String sql = "CREATE TABLE Jobs (" +
                "job_id INT NOT NULL PRIMARY KEY," +
                "NAME VARCHAR(40) NOT NULL," +
                "place INT NOT NULL," +
                "salary DECIMAL(10, 2)" +
                ")";
            stmt.executeUpdate(sql);

            System.out.println("Created Table 'Jobs'  successfully!");

        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}

