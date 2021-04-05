import java.util.Scanner;

public class MindReader
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 크면 h를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 작으면 l를 입력하세요.");
		System.out.println("제(컴)가 숫자를 맞췄다면 y를 입력해 주세요.");
		System.out.println("당신이 선택한 숫자는 50 입니까?");
		
		int num = 0;
		int result= 0;
		int count = 0;
		char h, l, y;
		
		while (true)  //while, if ,for
		{
			if (num> 50) 
			{	
				System.out.println("당신이 선택한 숫자는 입니까?");
			}
			else if (num <50)
			for ( num=0; num > 50; num++) 
			{
				
			}
			
			
			
			
			
			count++;
		}
		
		
	}
}
