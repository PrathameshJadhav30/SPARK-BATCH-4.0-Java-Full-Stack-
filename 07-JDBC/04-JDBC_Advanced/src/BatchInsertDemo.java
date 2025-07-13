import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchInsertDemo {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()){
            String sql = "INSERT INTO students(name, age) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Amit");
            ps.setInt(2, 20);
            ps.addBatch();

            ps.setString(1, "Neha");
            ps.setInt(2, 22);
            ps.addBatch();

            int[] result = ps.executeBatch();
            System.out.println("Batch Excecuted. Rows Inserted: " + result.length);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
