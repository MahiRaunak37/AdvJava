//type 2 connection
import java.sql.*;

public class AJ0004GetConnection {
    public static void main(String[] args) {
        try {
            Class C = Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@ORCLDB", "system", "raunak37");
            System.out.println("Connection Established Successfully");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
