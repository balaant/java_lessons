package lesson.jdbc;

import java.sql.*;

public class HSQLDBExample {
    private static final String CREATE_TABLE_SQL = "create table users ( id  int primary key," +
            "  name varchar(20),  email varchar(20),  country varchar(20)," +
            "  password varchar(20) );";

    private static final String DELETE_USERS_SQL = "DROP table users";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
            "  (id, name, email, country, password) VALUES " +
            " (?, ?, ?, ?, ?);";

    private static final String QUERY = "select id,name,email,country,password from users where id =?";


    private static final String UPDATE_USERS_SQL = "update users set name = ? where id = ?;";


    public static void main(String[] args) throws SQLException{
        deleteTable();
        createTable();
        insertRecord();
        selectTable();
        updateRecord();
        selectTable();

        // Step 4: try-with-resource statement will auto close the connection.
    }

    public static void selectTable() throws SQLException {
        try (Connection connection = JdbcUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                String password = rs.getString("password");
                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
            }
        } catch (SQLException e) {
            JdbcUtils.printSQLException(e);
        }
    }

    public static void deleteTable() throws SQLException {

        System.out.println(DELETE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JdbcUtils.getConnection();
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(DELETE_USERS_SQL);
        } catch (SQLException e) {
            // print SQL exception information
            JdbcUtils.printSQLException(e);
        }
    }

    public static void createTable() throws SQLException {

        System.out.println(CREATE_TABLE_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JdbcUtils.getConnection();
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(CREATE_TABLE_SQL);
        } catch (SQLException e) {
            // print SQL exception information
            JdbcUtils.printSQLException(e);
        }
    }

    public static void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JdbcUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Tony");
            preparedStatement.setString(3, "tony@gmail.com");
            preparedStatement.setString(4, "US");
            preparedStatement.setString(5, "secret");

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JdbcUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }

    public static void updateRecord() throws SQLException {
        System.out.println(UPDATE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JdbcUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1, "Ram");
            preparedStatement.setInt(2, 1);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JdbcUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
