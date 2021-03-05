
public class Quiz06_04
{

	public static void main(String[] args)
	{
		int num = 1;
		int result = 0;
		
		int nMax = 1000;
		do
		{
			if (num !=nMax) 
			{
				System.out.print(num +"+");
			}
			else 
			{
				System.out.print(num +"=");
			} 
			result = result + num;
			num++;
			
		}while(num <= nMax);
		
		
		System.out.println("1~1000까지 더한 결과 : " + result + "입니다. ");
		
	}

}
