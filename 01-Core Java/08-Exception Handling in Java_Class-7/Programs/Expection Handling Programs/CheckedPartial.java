import java.sql.SQLException;

public class CheckedPartial {
    public static void main(String[] args) {
        try {
            throw new SQLException("Database error");
        } catch(SQLException e){
            System.out.println("Caught SQL Exception: " + e);
        }
    }
}
