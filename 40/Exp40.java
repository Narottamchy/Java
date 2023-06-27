import java.sql.*;

public class Exp40 {
    public static void main(String[] args) {
        String url = "jdbc:ucanaccess://path_to_database_file.accdb";
        String tableName = "your_table_name";

        try {
            // Step 1: Load the JDBC driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // Step 2: Establish the connection to the database
            Connection connection = DriverManager.getConnection(url);

            // Step 3: Create a statement object
            Statement statement = connection.createStatement();

            // Step 4: Execute the SQL query to retrieve the data
            String sqlQuery = "SELECT * FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Step 5: Process the result set and display the data
            while (resultSet.next()) {
                String column1 = resultSet.getString("column_name1");
                String column2 = resultSet.getString("column_name2");
                // Repeat the above line for each column in your table

                System.out.println("Column 1: " + column1);
                System.out.println("Column 2: " + column2);
                // Repeat the above lines for each column in your table
            }

            // Step 6: Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error accessing the database: " + e.getMessage());
        }
    }
}
