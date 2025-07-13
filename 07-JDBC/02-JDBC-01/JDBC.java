import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

    //1. Load the driver class
    //2.Get Connection from DB
    //3.Create Statement
    //4.Execute Query
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC","root","root"
            );
            Statement statement = con.createStatement();
            String query = "select * from student";

            ResultSet rs = statement.executeQuery(query);
            System.out.println("------Read Data------");

            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + " | " + rs.getString("Name") + " | " +
                                rs.getInt("rollNo")
                );
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
