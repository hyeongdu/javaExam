

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook 
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
	
	
	static Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement pstmt1 ;
	PreparedStatement pstmt2 ;
	PreparedStatement pstmt3 ;
	
    
	public static void main(String[] args)
	{
		MyPhoneBook mpb = new MyPhoneBook();
		mpb.doRun();
			
			
		
	}
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
		String phoneNumber = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
	
		String sql = "insert into PhoneBook values(?,?,?,)";
		
		try
		{
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, name);
			pstmt1.setString(2, phoneNumber);
			pstmt1.setString(3, email);
			int updateCount = pstmt1.executeUpdate();
			System.out.println("추가되었습니다.");
		}catch(Exception e)
		{
			System.out.println("입력 에러입니다.");
		}
		
	}
	public void selNumber()
	{
		System.out.println("조회할 이름 : ");
		String name = sc.nextLine();
		String sql = "select * from PhoneBook where name = ?";
		try 
		{
		
			pstmt2 = con.prepareStatement(sql);
			pstmt1.setString(1, name);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) 
			{
				System.out.print("name : " + rs.getString(1));
				System.out.println("phoneNumber : " + rs.getByte(2));
				if(rs.getString(3)!=null)
				{
					System.out.println("email : " + rs.getByte(3));
				}
				else
				{
					System.out.println("해당값이 없습니다. ");
				}
			}
			rs.close();
		} catch (Exception e)
		{
			System.out.println("알 수 없는 에러");
		}
	}
		
	public void delNumber()
	{
		System.out.println("삭제할 이름 : ");
		String name = sc.nextLine();
		
		String sql = "delete from PhoneBook where name = ?";
		try 
		{
			pstmt3 = con.prepareStatement(sql);
			pstmt3.setString(1, name);
			int updateCount = pstmt3.executeUpdate();
			System.out.println("삭제되었습니다");
		}catch(Exception e)
		{
			System.out.println("삭제 에러입니다. ");
		}
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
	public void doRun()
	{
		connectDatabase();
		int choice;
		while(true) 			
		{
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
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
				return;	
			default :
				System.out.println("잘못 입력 하셨습니다.");
				break;	
			}
			
			
		}
	}
	
}



