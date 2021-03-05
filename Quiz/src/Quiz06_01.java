import java.util.Scanner;
public class Quiz06_01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요.");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		int result;
		
		int diff = (num1 > num2)? (num1 - num2) : (num2 -num1);
		System.out.println("두수의 차 :" + diff);
		
	}
}
