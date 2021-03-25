

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
	
	public static void showMenu() {
		System.out.println("[메뉴선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.println("선택 : ");
	}
	
	
    
    
	public static void main(String[] args){
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		int updateCount ;
		int choice;
		try 
		{
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
		
			while(true) 			
			{
				showMenu();
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.println("이름 : ");
					String name = sc.nextLine();
					System.out.println("전화번호 : ");
					String phone = sc.nextLine();
					System.out.println("이메일 : ");
					String email = sc.nextLine();
		    	
					sb.append("insert into test2 values( '" + name);
					sb.append("'  , ' " + phone);
					sb.append("' ,  ' " + email + "' )");
				
					pstmt1 = con.prepareStatement(sb.toString());
					updateCount = pstmt1.executeUpdate();
					System.out.println("insertCount : " + updateCount );
					break;
				
				case 2:
					sb.setLength(0);
					System.out.println("이름 : ");
					name = sc.nextLine();
					sb.append("select * from test2 where name in ('" + name);
					sb.append("')");
					pstmt1 = con.prepareStatement(sb.toString());
					rs = pstmt1.executeQuery();
					while(rs.next())
					{
						System.out.print("name : " +  rs.getString("name")) ;
						System.out.print(" , phone  : " + rs.getString("phone"));
						if(rs.getString("email") != null)
						System.out.println(" , email  : " + rs.getString("email"));
						if(rs.getString("email") == null || (rs.getString("email") != ""))
						System.out.println("이메일이 없습니다. ");
					}
				
					break;
				case 3:
					sb.setLength(0);
					System.out.println("이름 : ");
					name = sc.nextLine();
					sb.append("delete test2    ");
					sb.append(" where name in ( '" + name );
					sb.append("' ) " );
					pstmt1 = con.prepareStatement(sb.toString());
					pstmt1.executeUpdate();
				
					break;
					
				case 4:
			
					System.out.println("프로그램을 종료합니다.");
					return;	
				default :
					System.out.println("잘못 입력 하셨습니다.");
					break;	
				}
				
				
			}	
			
		}catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
		
	}
	
	
	
}



