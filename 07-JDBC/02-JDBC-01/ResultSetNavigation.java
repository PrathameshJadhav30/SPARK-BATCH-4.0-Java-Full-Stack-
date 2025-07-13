import java.sql.*;

public class ResultSetNavigation {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JDBC", "root", "root");

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        rs.last();
        System.out.println("Last Row: " + rs.getString("Name"));

        rs.first();
        System.out.println("First Row: " + rs.getString("Name"));

        rs.beforeFirst();
        while(rs.next()){
            System.out.println(rs.getString("Name"));
        }
    }
}
