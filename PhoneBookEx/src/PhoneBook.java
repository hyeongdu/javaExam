
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PhoneBook
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
	
	Connection con = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	ResultSet rs = null;
	int updateCount ;
	static Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.println("[메뉴선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.println("선택 : ");
	}
	
	public void addNumber()
	{
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phone = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
	
		String sql = "insert into phoneBook values(?,?,?)";
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, name);
			pstmt1.setString(2, phone);
			pstmt1.setString(3, email);
			updateCount = pstmt1.executeUpdate();
			System.out.println("insertCount : " + updateCount );
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void selNumber()
	{
		System.out.println("이름 : ");
		String name = sc.nextLine();
		String sql = "select * from phoneBook where name in (?) ";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, name);
			rs = pstmt2.executeQuery();
		
			while(rs.next())
			{	if(rs.getString("name") !=null)
				{
					System.out.print("name : " +  rs.getString("name")) ;
					System.out.print(" , phone  : " + rs.getString("phonenumber"));
					if(rs.getString("email") != null)
							System.out.println(" , email  : " + rs.getString("email"));
					else
						System.out.println("    이메일이 없습니다. ");	
				}
			    else
			    	System.out.println(" 에러입니다.");
				
			
			}
			rs.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delNumber()
	{
		System.out.println("이름 : ");
		String name = sc.nextLine();
		String sql = "delete phoneBook   where name in (?)  ";
		try {
			pstmt3 = con.prepareStatement(sql);
			pstmt3.setString(1, name);
			pstmt3.executeUpdate();
			System.out.println("삭제되었습니다.");
		}catch(Exception e)
		{
			System.out.println("없는 이름입니다.");;
		}
		
	}
	
	public void connectDatabase()
	{
		try 
		{
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott",
				"tiger");
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
	public void doRun()
	{
		connectDatabase();
	
		int choice;
		while(true) 			
		{
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) 
			{
			case 1:
				addNumber();
				break;
			
			case 2:
				selNumber();
			
				break;
			case 3:
				delNumber();
			
				break;
				
			case 4:
		
				System.out.println("프로그램을 종료합니다.");
				disCon();
				return;	
			default :
				System.out.println("잘못 입력 하셨습니다.");
				break;	
			}
			
			
		}
	}
	public void disCon()
	{
		try {
			if(con != null) con.close();
			if(pstmt1 != null) pstmt1.close();
			if(pstmt2 != null) pstmt2.close();
			if(pstmt3 != null) pstmt3.close();
		}catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
	
    
    
	public static void main(String[] args)
	{
		
		PhoneBook pbk = new PhoneBook();
		pbk.doRun();
		
		
	}
	
	
	
}
