import java.sql.*;

public class InsertStudentRecords {

    public static void main(String[] args) {
        // Database connection parameters for PostgreSQL
        String url = "jdbc:postgresql://localhost:5432/SS_BCA";
        String username = "postgres";
        String password = "malisadim123";

        // JDBC variables
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // SQL query to insert student records
            String sql = "INSERT INTO Student (S_ID, S_Name, S_Address, Semester) VALUES (?, ?, ?, ?)";

            // Prepare the statement
            preparedStatement = connection.prepareStatement(sql);

            // Insert four student records
            for (int i = 1; i <= 4; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "Student " + i);
                preparedStatement.setString(3, "Address " + i);
                preparedStatement.setInt(4, i % 2 + 1); // Semester: 1 or 2
                preparedStatement.executeUpdate();
            }

            System.out.println("Records inserted successfully.");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
