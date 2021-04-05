import java.util.Scanner;
public class Quiz07_01
{
	//세 개의 정수를 인자로 전달 받아서 그중 가장 큰 수를 반환하는 함수를 정의
	public static void doAvg(int num1, int num2, int num3) 
	{
		double avg = (num1+num2+num3)/3.0;
		System.out.printf("평균은 %.2f 입니다.", avg);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요.");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		doAvg(num1,num2,num3);
		
	}
}
