import java.sql.SQLException;

public class SQLExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new SQLException("Simulated SQl Error");
        } catch(SQLException e){
            System.out.println("Caught SQlException: " + e.getMessage());
        }
    }
}
