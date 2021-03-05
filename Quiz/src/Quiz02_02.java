import java.util.Scanner;
public class Quiz02_02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시고 엔터.");
		int num1 = sc.nextInt();
		//int result = num1 * num1;
		
		int num2 = 3;
		int result =1;
		for (int i=0; i<num2; i=i+1)
		{
		 result = result * num1;
		}
		System.out.println(result);
		
	}

}
