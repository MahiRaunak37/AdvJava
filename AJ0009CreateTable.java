import java.sql.*;  //import sql package in code

public class AJ0009CreateTable {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:ORCLDB", "RAUNAK", "RAUNAK");
            System.out.println("Connection Established Successfully");
            Statement stmt = con.createStatement();
            stmt.execute("create table emp1(emp_name varchar(20), emp_id number(10))");
            System.out.println("Table Created Successfully");
            stmt.executeUpdate("insert into emp1 values('raunak',123)");
            System.out.println("Insertion Successful");
            ResultSet rs = stmt.executeQuery("select * from emp1");
            ResultSetMetaData rsm = rs.getMetaData();
            int n = rsm.getColumnCount();
            System.out.println(n);

            for (int i = 1; i <= n; i++) {
                System.out.print(rsm.getColumnName(i) + " ");
            }
            System.out.println();
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getInt(2));
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
