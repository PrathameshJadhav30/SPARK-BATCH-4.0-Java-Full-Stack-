import java.sql.Connection;
import java.sql.Statement;

public class TransactionDemo {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()){
            con.setAutoCommit(false);  //manual commit

            try {
                Statement st = con.createStatement();
                st.executeUpdate("UPDATE accounts SET balance = balance - 1000 WHERE id = 1");
                st.executeUpdate("UPDATE accounts SET balance = balance + 1000 WHERE id = 2");
                con.commit();
                System.out.println("Transaction Committed.");
            } catch (Exception e){
                con.rollback();
                System.out.println("Transaction Rooled Back.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
