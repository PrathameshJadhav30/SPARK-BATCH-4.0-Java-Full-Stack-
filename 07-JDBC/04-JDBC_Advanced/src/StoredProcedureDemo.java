import com.mysql.cj.jdbc.CallableStatement;

import java.sql.Connection;
import java.sql.Types;

public class StoredProcedureDemo {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {
            CallableStatement cs = (CallableStatement) con.prepareCall("{call getEmployeeDetails(?, ?, ?)}");
            cs.setInt(1, 101);      //IN parameter
            cs.registerOutParameter(2, Types.VARCHAR);  //OUT
            cs.registerOutParameter(3, Types.DOUBLE);   //OUT

            cs.execute();

            System.out.println("Name: " + cs.getString(2));
            System.out.println("Salary: " + cs.getDouble(3));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
