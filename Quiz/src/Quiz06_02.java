import java.util.Scanner;
public class Quiz06_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int num1 =sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int num2 =sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int num3 =sc.nextInt();
		
		double result = (num1 + num2 + num3) / 3.0;
		
		if (result >= 90) 
		{
			System.out.printf("평균 점수는 %.1f A학점입니다.", result);
		}
		else if (result >= 80) 
		{
			System.out.printf("평균 점수는 %.1f B학점입니다", result);
		}
		else if (result >= 70) 
		{
			System.out.printf("평균 점수는 %.1f C학점입니다", result);
		}
	    else if (result >= 50) 
		{
			System.out.printf("평균 점수는 %.1f D학점입니다", result);
		}
	    else if (result < 50) 
		{
			System.out.printf("평균 점수는 %.1f F학점입니다", result);
		}
    }
}		
