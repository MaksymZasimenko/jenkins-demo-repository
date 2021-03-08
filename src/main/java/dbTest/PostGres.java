package dbTest;

import org.junit.Assert;
import org.junit.Test;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PostGres {
    // Setting connection to DB URL -> pass the name of the library -> include the database type
    String demoHR = "jdbc:postgresql://localhost:5432/demoHR";
    String dbUsername = "postgres";
    String dbPassword = "";
    // Query all the results for department tables
    @Test
    public void countTest() throws SQLException {
        // Establish Database Connection
        Connection connection = DriverManager.getConnection(demoHR, dbUsername, dbPassword);
        // Establish a statement connection to read from the database
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        // Resultset interface allows us to query from the table
        ResultSet resultSet = statement.executeQuery("select * from departments");
        //scroll to the end to get all the results
        resultSet.last();
        //Verify that the query contains more than 0 records (rows)
        int rowCount = resultSet.getRow(); // returns the current row count
        System.out.println("row count = " + rowCount);
        Assert.assertTrue(rowCount > 0);
        resultSet.close();
        statement.close();
        connection.close();
    }
    @Test
    public void testDatabaseTable() throws SQLException {
        Connection connection = DriverManager.getConnection(demoHR, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from departments");
        while (resultSet.next()) {
            // Print the column with index 1
            System.out.println(resultSet.getString(1) + " " +
                    resultSet.getString("dept_no") + " " + resultSet.getString("dept_name"));
        }
    }
    // TODO query birthday, first name and lastname
    @Test
    public void test1() throws SQLException {
        Connection connection = DriverManager.getConnection(demoHR, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from employees");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("birth_date")
                    + " " + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
        }
    }
    // TODO Query and print all columns from salaries tables
    // TODO assert count for dept_emp table and print emp_no
    @Test
    public void metaData() throws SQLException {
        Connection connection = DriverManager.getConnection(demoHR, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "select * from departments";
        ResultSet resultSet = statement.executeQuery(sql);
        //METADATA: is the data describing the data is is being stored in the data source.
        //Metadata includes the name, size and number of rows for each table in the DB
        DatabaseMetaData dbMetadata = connection.getMetaData();
        // Return username of the database
        System.out.println(dbMetadata.getUserName());
        // Return Database type
        System.out.println(dbMetadata.getDatabaseProductName());
        ResultSetMetaData rsMedata = resultSet.getMetaData();
        System.out.println(rsMedata.getColumnCount());
        for (int i = 1; i <= rsMedata.getColumnCount(); i++) {
            System.out.println(i + " : " + rsMedata.getColumnName(i));
        }
        // Create a list of MAPS
        // MAPS is data structure that holds key and values
        List<Map<String, Object>> list = new ArrayList<>();
        ResultSetMetaData rsMetadata2 = resultSet.getMetaData();
        int columnCount = rsMetadata2.getColumnCount();
        while (resultSet.next()) {
            Map<String, Object> rowMap = new HashMap<>();
            for (int col = 1; col <= columnCount ; col++) {
                rowMap.put(rsMetadata2.getColumnName(col), resultSet.getObject(col));
            }
            list.add(rowMap);
        }
        for (Map<String, Object> a : list) {
            System.out.println(a.get("dept_name"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}