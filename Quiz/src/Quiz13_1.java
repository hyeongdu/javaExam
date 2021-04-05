import java.util.Scanner;

public class Quiz13_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [5];
		
		for(int i=0; i<5; i++) 
		{
			arr[i]= sc.nextInt();
		}	
	}
	
	public static void getMax(int[] arr) 
	{
		int nMax = arr[0];
		for (int i =0; i<arr.length; i++) 
		{
			if (nMax < arr[i]) 
			{
				nMax= arr[i];
			}
		}
		System.out.println(nMax);
	}

	public static void getMin(int[] arr) 
	{
		int nMin = arr[0];
		for (int i =0; i<arr.length; i++) 
		{
			if (nMin > arr[i]) 
			{
				nMin= arr[i];
			}
		}
		System.out.println(nMin);
	}
}
