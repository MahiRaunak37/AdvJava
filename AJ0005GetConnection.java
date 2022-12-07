//type 4 connection
import java.sql.DriverManager;
import java.sql.Connection;
public class AJ0005GetConnection {
    public static void main(String[] args) {
        try{
            Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "raunak37");
            System.out.println("Connectin Established Successfully");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
