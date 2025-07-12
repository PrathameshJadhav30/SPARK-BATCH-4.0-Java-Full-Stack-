import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC", "root", "root"
            );

            System.out.println("Database Connected Succesfully!");

            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
