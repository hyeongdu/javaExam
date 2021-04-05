import java.util.Random;
import java.util.Scanner;
public class HighLow
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("나는 지금 0부터 100사이의 값 중에 하나를 생각하겠습니다.");
		System.out.println("당신은 그 숫자를 6회 안에 맞추시면 됩니다...");
		System.out.println("몇이라고 생각합니까?");
		
		int num = sc.nextInt();
		Random rand = new Random();
		int count = 6;
		while (true)
		{
			count--;
			
			if (rand > num) 
			{
				System.out.println(num + "은 제가 생각한 숫자보다 큽니다.");
				
			}
			else
			{
				System.out.println(num + "은 제가 생각한 숫자보다 작습니다.");
			}
			
			//정답을 못맞췄을 경우
			if 
			{
				
			}
			//정답인 경우
			if 
			{
				System.out.println(num  + " 는 정답입니다. 축하합니다.");
				System.out.println("다시 하시겠습니까?");
				
			}
			
			//예외 처리, 문자가 들어온 경우 
			try
			{
				
			}
			catch
			finally
		}
		
		
	}
}
