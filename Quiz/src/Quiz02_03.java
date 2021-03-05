import java.util.Scanner;
public class Quiz02_03
{

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시고 엔터.");
		int num1 = sc.nextInt();		
		System.out.println("숫자를 입력하시고 엔터.");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " 나누기 " + num2  + " 의 몫은 " + (num1/num2) + " 입니다."); 
		System.out.println(num1 + " 나누기 " + num2  + " 의 나머지는 " + (num1%num2) + " 입니다.");
	}
	

}
