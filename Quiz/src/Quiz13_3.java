import java.util.Scanner;
public class Quiz13_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		
		for (int i=0; i < arr.length; i++) 
		{
			arr[i]= sc.nextInt();
		}
		//홀수 
		boolean bStart = true;
		for (int i=0; i< arr.length; i++) 
		{
			if(arr[i] % 2 ==1) 
			{
				System.out.print(arr[i] + " ");
				bStart = false;
			}
			else 
			{
				System.out.print("," + arr[i]);
			}
		}
		
	}
}
