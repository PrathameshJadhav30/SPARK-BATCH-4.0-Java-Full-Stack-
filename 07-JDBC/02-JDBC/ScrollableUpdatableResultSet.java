import java.sql.*;

public class ScrollableUpdatableResultSet {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JDBC","root","root"
        );

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        rs.absolute(2); //Move to 2nd Row
        rs.updateString("Name", "UpdatedAditi");
        rs.updateRow();

        System.out.println("Row Updated Successfully");

        rs.close();
        con.close();
    }
}
