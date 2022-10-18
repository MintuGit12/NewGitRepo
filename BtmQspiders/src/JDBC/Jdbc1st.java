package JDBC;
import java.sql.*;
public class Jdbc1st {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:oci:@XE","SCOTT","TIGER");
	Statement st=conn.createStatement();
	ResultSet rs = st.executeQuery("SELECT * FROM EMP");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"result printed");
	}
	conn.close();
	}

}
