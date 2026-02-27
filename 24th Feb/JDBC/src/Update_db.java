import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Update_db{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Password@123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) { 
            System.out.println("Connection Established Successfully!");

            
            String sql ="UPDATE Jobs SET salary = 36000, place = 'Bangalore' WHERE job_id = 101";
            int jerin= stmt.executeUpdate(sql);
                 System.out.println("Updated Table 'Jobs'  successfully! (Added count: " + jerin + ")");

        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}

