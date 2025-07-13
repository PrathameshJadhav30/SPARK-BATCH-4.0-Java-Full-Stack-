import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl;

public class RowSetDemo {
    public static void main(String[] args) {
        try {
            JdbcRowSet rowSet = new JdbcRowSetImpl(DBConnection.getConnection());
            rowSet.setCommand("SELECT * FROM employees");
            rowSet.execute();

            while (rowSet.next()) {
                System.out.println("Name: " + rowSet.getString("name"));
            }

            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
