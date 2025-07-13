import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandling {
    public static void main(String[] args) {
        Connection con = null;
         try {
             con = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/JDBC", "root", "wrong_password");

         } catch (SQLException e){
             System.out.println("Error Code: " + e.getErrorCode());
             System.out.println("SQL State: " + e.getSQLState());
             e.printStackTrace();
         } finally {
             try {
                 if(con != null){
                     con.close();
                 }
             }catch (SQLException e){
                 e.printStackTrace();
             }
         }
    }
}
