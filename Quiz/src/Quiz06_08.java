public class Quiz06_08
{
	public static void main(String[] args)
	{
		int i = 2;
		
		for ( ; i<10; i=i+1)
		{
			for (int j=1; j<10; j=j+1) 
			{
				if(i % 2 == 1) 
				{
					break;
				}
				
				if (i >= j) 
				{ 
				int result = i * j;
				System.out.print(i + "*" + j + "=" + result + " ");
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
