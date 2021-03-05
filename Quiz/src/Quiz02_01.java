import java.util.Scanner;
public class Quiz02_01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요.");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		//System.out.printf("%d 나누기 %d 의 몫은 %d 입니다.", num1, num1 % num2);
		//System.out.printf("%d 나누기 %d 의 나머지는 %d 입니다.", num1, num1 / num2);
		
		
		
		
	}

}
