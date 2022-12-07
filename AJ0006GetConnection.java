import java.sql.*;
public class AJ0006GetConnection {
    public static void main(String[] args)
	{
		try
		{
			Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
            
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","raunak37");
			System.out.println("Connection established successfully");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}  
}
