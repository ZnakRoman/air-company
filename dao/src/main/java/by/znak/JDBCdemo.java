package by.znak;


import java.sql.*;


public class JDBCdemo{
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/znakstore";
        String name = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println(12);
            connection = DriverManager.getConnection(url, name, password);
            System.out.println(34);
            Statement statement = null;
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO users (email, password, firstname, lastname, birthday)" +
                    "VALUES ('idontknow6@gmail.com', '12345678', 'Alexandr', 'Alexandroff', '1991-08-19');");
            System.out.println("Create user...");
            ResultSet result = statement.executeQuery("SELECT * FROM users WHERE email = 'idontknow2@gmail.com'");
            System.out.printf("$d | $s | $s | $s | $s | $s",
                    result.getInt("id"), result.getString("email"),
                    result.getString("password"), result.getString("firstname"),
                    result.getString("lastname"), result.getString("birthday"));
            statement.executeUpdate("UPDATE users SET password = '87654321' WHERE email = 'idontknow3@gmail.com'");
            System.out.println("User update...");
            statement.executeUpdate("DELETE FROM users WHERE email = 'idontknow5@gmail.com'");
        } catch (Exception ex) {
            System.out.println(0000000);
        }
        finally {
            if(connection != null){
                try {
                    connection.close();
                }
                catch (SQLException ex){
                    System.out.println(ex);
                }
            }
        }
    }
}
