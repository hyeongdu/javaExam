import java.util.Scanner;

public class Quiz06_10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("합산 할 숫자 5개를 입력세요.");
		
		int num = 0;
		int result = 0;
		int sum = 0;
		
		while (result < 5 )
		{
			num = sc.nextInt();
			if (num > 0) 
			{
			   sum += result;
			   num++;
			}
			else 
			{
				System.out.println("1이상의 숫자를 재입력 하세요.");
				
			}
			System.out.printf("입력하신 숫자의 합은 %d 입니다.", + sum);
		}
		
		
	}// while (true) 출제자의 의도 입력된게 5개면 끝

}
