import java.sql. *;
import java.util.Scanner;
public class PhoneBookEx
{
	Scanner sc = new Scanner(System.in);
	Connection con;
	PreparedStatement pstmt1;
	PreparedStatement pstmt2;
	PreparedStatement pstmt3;
	static 
	{
		try 
		{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		}catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
	
		
		PhoneBookEx pbEx = new PhoneBookEx();
		pbEx.connectDatabase();
		pbEx.doRun();
				

	}
	
	public void doRun() 
	{
		while(true)
		{
			showMenu();
	
			int num = sc.nextInt();
			switch(num)
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
				System.out.println("종료되었습니다.");
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			
						
			}
		}
	}
	public void showMenu()
	{
		System.out.println("[메뉴 선택]");
		System.out.println("1. 전호번호 입력");
		System.out.println("2. 전화번호 조회");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 종료");
		System.out.println("선택 : ");
	}
	
	public void addNumber()
	{
		System.out.print("이름: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("이메일: ");
		String email = sc.nextLine();
		
		
		String sql = "insert into abc values (?,?,?)";
			try 
			{
				pstmt1 = con.prepareStatement(sql);
				pstmt1.setString(1, name);
				pstmt1.setString(2, phoneNumber);
				pstmt1.setString(3, email);
				pstmt1.executeUpdate();
				System.out.println("추가되었습니다");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}	
	
	
	public void selNumber()
	{
		System.out.print("조회 할 이름 : ");
		String name = sc.nextLine();
		String sql = "select * from phonebook where name = ? ";
		
		try
		{
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, name);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next())
			{
				System.out.println("name : " + rs.getString(1));
				System.out.println("phoneNumber : " + rs.getString(2));
				if(rs.getString(3) != null)
				System.out.println("email : " + rs.getString(3));
				else
					System.out.println("값이 없습니다. ");
				rs.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("알 수 없는 오류 입니다.");
			
		}
	}
	
	
	public void delNumber()
	{
		System.out.print("삭제 할 이름 : ");
		String name = sc.nextLine();
		
		String sql = "delete phonebook where name = ?";
		try 
		{
			pstmt3 = con.prepareStatement(sql);
			pstmt3.setString(1, name);
			pstmt1.executeUpdate();
			System.out.println("삭제되었습니다.");
		}catch(Exception e)
		{
			System.out.println("알 수 없는 오류 입니다.");
		}
		
	}
	
	public void connectDatabase()
	{
		try {
			Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe",
			"scott", "tiger");
			}catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}
}