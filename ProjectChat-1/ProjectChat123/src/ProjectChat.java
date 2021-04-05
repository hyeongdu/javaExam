import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Map;

public class ProjectChat
{
	Map<String, PrintWriter> room1;
	
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
		catch(StackOverflowError e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public ProjectChat(Map<String, PrintWriter> room1)
	{
		this.room1 = room1;
	}
	
	Connection con = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	PreparedStatement pstmt4 = null;
	PreparedStatement pstmt5 = null;
	PreparedStatement pstmt6 = null;
	PreparedStatement pstmt7 = null;
	PreparedStatement pstmt8 = null;
	PreparedStatement pstmt9 = null;
	ResultSet rs = null;
	int updateCount ;
	String sql = null;
	PjchatServer pjs = new PjchatServer();
	
	
	
	public String loginMenu(String name, String password)
	{
		connectDatabase();
		sql = "select * from chatinfo where name = ? and password = ? ";
		String result = null;
		String check = "black";		
		try
		{
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, name);
			pstmt1.setString(2, password);
			rs = pstmt1.executeQuery();
			
				if(rs.next())
				{
					sql = "select * from chatinfo where name = ? and blackinfo = ? ";
					
						pstmt7 = con.prepareStatement(sql);
						pstmt7.setString(1, name);
						pstmt7.setString(2, check);
						rs = pstmt7.executeQuery();
					
					
					if(rs.next())
						result = "블랙으로 접속할 수 없습니다.  ";
					else
					result =  "로그인";
				}
				else
				{
					
					result = "아이디 또는 비밀번호를 확인해주세요";
				}			
				
				rs.close();
				con.close();
				
		}catch(Exception e) {
			System.out.println("로그인 오류" + e);
		}
		return result;
	}
	
	public String joinchat(String name, String password)
	{
		connectDatabase();
		String result = null;
			sql = "insert into chatinfo values(?,?)";
			
			try {
				pstmt2 = con.prepareStatement(sql);
				pstmt2.setString(1, name);
				pstmt2.setString(2, password);
				pstmt2.executeUpdate();
				result = "회원가입 완료";
				
			}catch(SQLIntegrityConstraintViolationException e)
			{
				result = "중복된 아이디입니다";

			}catch(Exception e)
			{
				e.printStackTrace();
				result = "회원가입 오류." + e;
			}
		try {
			con.close();
		}catch(Exception e)
		{
		
		}
		
		return result;
	}
	
	public String addroom(String name, String roomname, String password)
	{
		connectDatabase();
		String result = null;
		sql = "insert into roomlist (name,password,super,roominfo) values (?,?,?,?)";
		try
		{
			pstmt3=con.prepareStatement(sql);
			pstmt3.setString(1, roomname);
			pstmt3.setString(2, password);
			pstmt3.setString(3, name);
			pstmt3.setString(4, "비밀방");
			pstmt3.executeUpdate();
			result = "방개설";
			if(result.equals("방개설"))
			{
				sql = "update chatinfo set roomname = ?, roomjob = ? where name = ? ";
				pstmt3=con.prepareStatement(sql);
				pstmt3.setString(1, roomname);
				pstmt3.setString(2, "방장");
				pstmt3.setString(2, name);
				pstmt3.executeUpdate();
			}
		}catch(SQLIntegrityConstraintViolationException e)
		{
			result = "중복된 방 입니다";

		}catch(Exception e)
		{
			System.out.println(" 방만들기 오류(DB)" + e);
		}
		try {
			con.close();
		}catch(Exception e)
		{
		
		}
		return result;
		
		
	}
	public void sendAllchat(String msg, String name)
	{
		connectDatabase();
//		ArrayList<String> arr = new ArrayList<>();
		sql = "select name,roomname from chatinfo  "
				+ " where roomname = (select roomname from chatinfo where name = ?) ";
		
		try
		{
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, name);
			rs = pstmt1.executeQuery();
			while(rs.next())
			{
				PrintWriter room_out = (PrintWriter)room1.get(rs.getString("name"));
				
				room_out.println(name + ">" + msg);
//				arr.add(rs.getString("name"));
			}
		}catch(Exception e)
		{
			System.out.println("array 오류" + e);
		}
		
	}
	public String enterroom(String name,String roomname, String password)
	{
		connectDatabase();
		String result = "";
		sql = "select * from roomlist where name = ? and password = ?";
		try
		{
			pstmt4=con.prepareStatement(sql);
			pstmt4.setString(1, roomname);
			pstmt4.setString(2, password);
			rs = pstmt4.executeQuery();
			if(rs.next())
			{
				
				result =  "방입장";
				if(result.equals("방입장"))
				{
					sql = "update chatinfo set roomname = ?, roomjob = ? where name = ? ";
					pstmt3=con.prepareStatement(sql);
					pstmt3.setString(1, roomname);
					pstmt3.setString(2, "일반");
					pstmt3.setString(3, name);
					pstmt3.executeUpdate();
				}
			}
			else
			{
				
				result = "없는 방입니다.";
			}
			rs.close();
			con.close();
		}catch(Exception e)
		{
			System.out.println(" 방들어가기 오류(DB)" + e);
		}
		
		return result;
		
		
	}
	public String npcDb(String npcPassword, String name)
	{
		connectDatabase();
		String result = "";
		sql = "select * from chatinfo where npcPassword = ? and name = ?";
		try
		{
			pstmt5=con.prepareStatement(sql);
			pstmt5.setString(1, npcPassword);
			pstmt5.setString(2, name);
			rs = pstmt5.executeQuery();
			if(rs.next())
			{
				
				result =  "관리자 확인";
	
			}
			else
			{
				
				result = "관리자 권한이 없습니다.";
			}
			rs.close();
			con.close();
		}catch(Exception e)
		{
			System.out.println(" 관리자 오류(DB)" + e);
		} 
		return result;
	}
	public void welcome(String name)
	{
		connectDatabase();
			sql = "update chatinfo set roomname = ? where name = ?";
			try 
			{
				pstmt8 = con.prepareStatement(sql);
				pstmt8.setString(1, "대기방");
				pstmt8.setString(2, name);
				pstmt8.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println("대기방 선정" + e);
			}
			
			
			
	}
	public String addblacklist(String name)
	{
		connectDatabase();
		String result = null;
			sql = "update chatinfo set blackinfo = ? where name = ?";
			
			try {
				pstmt6 = con.prepareStatement(sql);
				pstmt6.setString(1, "black");
				pstmt6.setString(2, name);
				pstmt6.executeUpdate();
				result = "블랙 추가";
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				result = "서버 문제 입니다." + e;
			}
		try {
			con.close();
		}catch(Exception e)
		{
			System.out.println("블랙 추가 오류 " + e);
		}
		
		return result;
	}
	public String delblacklist(String name)
	{
		connectDatabase();
		String result = null;
			sql = "update chatinfo set blackinfo = ? where name = ?";
			
			try {
				pstmt6 = con.prepareStatement(sql);
				pstmt6.setString(1, "");
				pstmt6.setString(2, name);
				pstmt6.executeUpdate();
				result = "블랙 제거";
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				result = "서버 문제 입니다." + e;
			}
		try {
			con.close();
		}catch(Exception e)
		{
			System.out.println("블랙 추가 오류 " + e);
		}
		
		return result;
	}
	public boolean npccheck(String name)
	{
		boolean result = false;
		connectDatabase();
		sql = "select * from chatinfo where npcpassword = ? and name = ? ";
		try
		{
			pstmt7 = con.prepareStatement(sql);
			pstmt7.setString(1, "12345");
			pstmt7.setString(2, name);
			rs = pstmt7.executeQuery();
			if(rs.next())
			{
				result =  true;
				
			}
			else
			{
				result =  false;
			}
		}catch(Exception e)
		{
			System.out.println("npc확인 오류" + e);
		}
		return result ;
		
	}
	public void exitDb(String name)
	{
		connectDatabase();
		sql = "update chatinfo set roomname = ? , roomjob = ? where name = ?";
		try 
		{
			pstmt6 = con.prepareStatement(sql);
			pstmt6.setString(1, "대기방");
			pstmt6.setString(2, "");
			pstmt6.setString(3, name);
			pstmt6.executeUpdate();
		}catch(Exception e )
		{
			System.out.println("방 나가기 오류 " + e);
		}
	}
	public void end(String name)
	{
		sql = "update chatinfo set roomname =?  where name = ? ";
		try 
		{
			pstmt9 = con.prepareStatement(sql);
			pstmt9.setString(1, "로그아웃");
			pstmt9.setString(2, name);
			pstmt9.executeUpdate();
		}catch(Exception e)
		{
			System.out.println("로그아웃 오류" + e);
		}
		
	}	
	public void listcheck(String name)
	{
		
	}
	public void connectDatabase()
	{
		try {
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott",
				"tiger");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
