import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; // Replace with your database name
    private static final String USER = "root"; // XAMPP default username
    private static final String PASSWORD = ""; // Leave blank for XAMPP default password

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to MySQL database!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        // Test the database connection
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
