import java.util.Scanner;
public class Quiz13_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		int front = 0;
		int back = arr.length-1;
		
		for (int i=0; i< arr.length; i++) 
		{
			int  num = sc.nextInt();
			if(num % 2 ==1) 
			{
				arr[front] = num;
				front++;
			}
			else 
			{
				arr[back] = num;
				back--;
			}
		}
		
		for (int i=0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
	}

}
