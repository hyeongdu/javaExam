
public class Ex05_DoubleError2
{

	public static void main(String[] args)
	{
		double dnum = 0;
		
		for (int i=0; i<1000; i=i+1) 
		{
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		
		
	}
}
