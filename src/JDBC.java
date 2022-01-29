import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName="root";
            String password="mysqlroot";
        Connection connection = DriverManager.getConnection(url,userName,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from products");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("product_name"));
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
