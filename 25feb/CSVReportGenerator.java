import java.io.*;
import java.sql.*;

public class CSVReportGenerator {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";  // Update with your DB URL
        String username = "your_username";  // Your database username
        String password = "your_password";  // Your database password
        String csvFile = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\employees.csv";  // Output CSV file name

        // Database connection and CSV writing
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // SQL query to fetch employee records
            String query = "SELECT employee_id, name, department, salary FROM employees";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // BufferedWriter to write CSV file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
                // Write the CSV header
                writer.write("Employee ID,Name,Department,Salary");
                writer.newLine();

                // Write the records to CSV
                while (rs.next()) {
                    int employeeId = rs.getInt("employee_id");
                    String name = rs.getString("name");
                    String department = rs.getString("department");
                    double salary = rs.getDouble("salary");

                    // Write each employee record as a new line in the CSV file
                    writer.write(employeeId + "," + name + "," + department + "," + salary);
                    writer.newLine();
                }

                System.out.println("CSV report generated successfully: " + csvFile);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
