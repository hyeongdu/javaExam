import java.util.Scanner;
public class Quiz02_04
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시고 엔터.");
		int num1 = sc.nextInt();		
		System.out.println("숫자를 입력하시고 엔터.");
		int num2 = sc.nextInt();
		
	    int big =(num1 > num2) ? num1 : num2;
		System.out.println(big);
		
	}

}
