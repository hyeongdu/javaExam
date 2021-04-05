import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class PreparedStatementEx
{
	static 	
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnfe) 
		{
			cnfe.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		PreparedStatement pstmt4 = null;
		ResultSet rs = null;
		
		try 
		{
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott",
				"tiger");
			String sql = null;
			
			//----------------------------------------------
			
			try
			{	
				
				sql = "select table_name from user_tables where table_name like 'ROOM%'";
				pstmt1 = con.prepareStatement(sql);
				rs = pstmt1.executeQuery();
				if(rs.next())
				{
					String oldtablename = rs.getString(1);
					System.out.println(oldtablename);
					sql = "rename ? to ?;";
					pstmt2 = con.prepareStatement(sql);
					pstmt2.setString(1, "room5");
					pstmt2.setString(2, "moon");
					pstmt2.execute();
					
					System.out.println(	pstmt2.executeUpdate());
				}
				
			
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(" 방만들기 오류(DB)" + e);
			}
			try {
				con.close();
			}catch(Exception e)
			{
			
			}	
		}catch (SQLException sqle)
			{
				sqle.printStackTrace();
			}
		finally
		{
			try
			{
				if(rs != null) rs.close();
				if(pstmt1 != null) pstmt1.close();
				if(pstmt2 != null) pstmt2.close();
				if(pstmt3 != null) pstmt3.close();
				if(pstmt4 != null) pstmt4.close();
				if(con != null) con.close();
			} catch (SQLException sqle) {}
		}
	}
	
}
