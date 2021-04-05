import java.util.Scanner;
public class Ex05_Exception
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			int num1 = sc.nextInt();
			int num2 = 10 / num1;
			System.out.println(num2);
			}
		catch(Exception e) 
		{
			//System.out.println (e.getMessage());
			//e.printStackTrace();  //어떤 에러가 났는지 자세히 알기위함
			System.out.println("예외발생");
		}
		
		System.out.println("Good bye~~!");
		
	}

}