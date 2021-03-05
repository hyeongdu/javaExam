import java.util.Scanner;
public class Quiz02_05
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두개 숫자를 입력하시고 엔터.");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
	    int result = num1 * num2;
	    
		int abs = (result >0)? result : -1* result;
		if (result > 0) 
		{
		  System.out.println(result);
		}
		else 
		{
		  System.out.println(result * -1);
		}
	}
}
