public class Ex01_MemoryInStack
{
	public static void main(String[] args)  //toggle breakpoint 설정 후 디버깅
	{
		int num1 = 10;
		int num2 = 20;
		int num3 = adder(num1, num2);
		System.out.println("-----------------");		
	}
	
	public static int adder(int n1, int n2) 
	{
		int result = n1 + n2;
		return result;
	}
	//debug As에서 자바 어플리케이션

}
