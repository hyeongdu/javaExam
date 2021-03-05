import java.util.Scanner;
public class Quiz06_05
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		int result = 0;
		
		while(true)
		{
			int num = sc.nextInt();
			
			if ( num ==0)
			{
				break;
			}
			
			result = result + num;
			
			
		}
		
		System.out.println(result);
		
       
		
	}
}
