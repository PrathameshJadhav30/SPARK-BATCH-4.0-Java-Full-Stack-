import java.io.*;
import java.sql.*;

public class BlobDemo {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {
            FileInputStream fis = new FileInputStream("input.jpg");
            PreparedStatement ps = con.prepareStatement("INSERT INTO files(name, data) VALUES(?, ?)");
            ps.setString(1, "photo");
            ps.setBlob(2, fis);
            ps.executeUpdate();
            System.out.println("Image inserted into BLOB column.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
