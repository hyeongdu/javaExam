
public class Ex02_TypeChange1
{

	public static void main(String[] args)
	{
		int num1 = 1;
		byte num2 = 1;  //0000 0001
		byte num3 = 127;
		//byte num4 = 128; //날리면 형변환x > 1 0000 0000
		short num5 = 1; //0000 0000 날려도 >0000 0001
		
		//num2 = num5;
		num2 = (byte)num5;
		//int num7 = 
		
	}

}
