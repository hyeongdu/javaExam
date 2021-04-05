import java.util.Scanner;
public class Quiz06_09
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시고 엔터를 누르세요.");
		int num = sc.nextInt();
		
		int result = 1;
		for (int i=9; i >0; i--) 
		{	
			{
				result = (i * num);
				System.out.print( num + "*" + i + "=" + result +" ");	
			}
			
		}
		
		
		
		
	}
}
