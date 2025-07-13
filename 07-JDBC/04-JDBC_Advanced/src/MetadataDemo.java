import java.sql.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetadataDemo {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {
            // DatabaseMetaData
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("DB Product: " + dbmd.getDatabaseProductName());
            System.out.println("Driver: " + dbmd.getDriverName());

            // ResultSetMetaData
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            ResultSetMetaData rsmd = rs.getMetaData();

            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println(rsmd.getColumnName(i) + " - " + rsmd.getColumnTypeName(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
