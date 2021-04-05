import java.util.Random;

public class QuizRandom
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		while(true) 
		{
			int num1 = rand.nextInt(9)+1;
			int num2 = rand.nextInt(10);
			int num3 = rand.nextInt(10);
			
			if (num1 == num2 || num1 == num3 || num2 == num3)
			   continue;
			
			int num = num1 *100 +num2 *10 + num3;
			System.out.println(num);
			break;
//			int num1 = num /100;
//			int numT = num % 100; //int numT1 = num - num1 * 100;
//			int num2 = numT / 10;
//			int num3 = numT % 10;
		}
		
	}
	
}
