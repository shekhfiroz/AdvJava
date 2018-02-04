package retrivefromtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//com.mysql.jdbc.Driver
//"jdbc:mysql://localhost:3306/jdbc","root","root"
public class RetriveformTable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));

		}
		conn.close();
	}

}
