import java.util.Scanner;
public class Quiz07_03
{
	// 개의 정수를 인자로 전달 받아서 그중 가장 작은 수를 반환하는 함수를 정의
	public static void MinNum(int num1, int num2, int num3) 
	{
		if (num1 < num2) 
		{
			if (num1 < num3)
				System.out.println(num1);
			else 
			    System.out.println(num3);
		}
		else 
		{
			if (num2 < num3)
				System.out.println(num2);
			else
				System.out.println(num3);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요.");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		MinNum(num1,num2,num3);
	}

}
