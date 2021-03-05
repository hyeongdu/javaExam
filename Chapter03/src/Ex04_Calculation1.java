public class Ex04_Calculation1
{
	public static void main(String[] args)
	{
		byte num11 = 1;
		byte num12 = 2; // 메모리의 문제
		byte result1 = num11 + num12; //CPU의 문제
		
		short num21 = 1;
		short num22 = 2;
		short result21 = num21 + num22; //형변환
		
		short result22 = (short)(num21 + num22); //강제 형변환
	}
}
