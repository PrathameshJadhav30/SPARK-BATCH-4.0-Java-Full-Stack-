import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC", "root", "root"
            );

            String query = "INSERT INTO student (id, Name, rollNo) VALUES (?, ? , ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 4);
            pstmt.setString(2, "Sneha");
            pstmt.setInt(3, 104);

            System.out.println("Records Inserted Using PreparedStatement");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
