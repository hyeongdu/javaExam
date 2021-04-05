import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main 
{
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			Statement stmt = con.createStatement();
			
			StringBuffer sb = new StringBuffer();
			sb.append("select table_name from user_tables where table_name like 'ROOM%' ");
			ResultSet rs = stmt.executeQuery(sb.toString());
			if(rs.next())
				System.out.println(rs.getString(1));
				
			
			
			
			rs.close();
			stmt.close();
			con.close();
		} catch(SQLException sqle) {
			System.out.println("Connection Error");
			sqle.printStackTrace();
		}

	}

}
