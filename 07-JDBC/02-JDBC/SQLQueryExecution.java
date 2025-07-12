
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLQueryExecution {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC", "root", "root"
            );
            Statement stmt = con.createStatement();

            //SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROm student");
            System.out.println("Data: ");
            while(rs.next()){
                System.out.println(rs.getInt("id") + " | " + rs.getString("Name"));
            }
            //INSERT
            int insert = stmt.executeUpdate("INSERT INTO student VALUES (6, 'Prathamesh', 3019)");

            System.out.println("Inserted Rows: " + insert);

            // execute()
            boolean result = stmt.execute("SELECT * FROM student");
            System.out.println("execute() returned: " + result);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
