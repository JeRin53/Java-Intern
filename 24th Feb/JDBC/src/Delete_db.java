import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Delete_db{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Password@123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) { 
            System.out.println("Connection Established Successfully!");

            
            String sql ="delete from Jobs WHERE job_id = 101";
            int result= stmt.executeUpdate(sql);
                 System.out.println("Deleted Column from Table 'Jobs'  successfully! (Added count: " + result + ")");

        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}

