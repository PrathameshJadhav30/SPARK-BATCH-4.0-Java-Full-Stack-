import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertDemo {

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
            //String query = "select * from student";
            String query = "insert into student values (5, 'Sanika', 3017)";

            //ResultSet rs = statement.executeQuery(query);
            int update = statement.executeUpdate(query);
            System.out.println("Inserted " + update + " Rows");


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
