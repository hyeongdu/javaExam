import java.util.Scanner;
public class Quiz06_06
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		
		int sum=0;
		double average = 0.0;
		
		for (int i=0; i<count; i++) 
		{
			System.out.println("입력");
			int num =sc.nextInt();
			
			sum = sum + num;
		}
		average = (double)sum/count;
		
		System.out.println(sum);
		System.out.printf("%.1f",average);
		
	}

}
