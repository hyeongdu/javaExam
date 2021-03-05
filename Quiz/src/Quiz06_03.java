import java.util.Scanner;
public class Quiz06_03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();	
		int result = 1;
		
		while (num > 0)
		{
			result = result * num;
			if (num >1) 
			{
				System.out.print(num + "*");
			}
			else
			{
			    System.out.print(num + "=");
			}
			num--;
			
		}
		
		System.out.print(result);
		
		
		//for (int i=num; i>0; i--)
		//{
		//  result = result *i;
		//	System.out.printf(i+"*");
		//}
	}	 
}


