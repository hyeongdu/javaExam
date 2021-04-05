import java.util.Scanner;
public class Ex06_ExceptionThrow
{
	public static void myMethod1(int n) 
	{
		myMethod2(n, 0);
	}
	
	public static void myMethod2(int n1, int n2) 
	{
		int r = n1/ n2;  //예외 발생지점
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		myMethod1(3);
		System.out.println("ExceptionThrow!!!!");	
		
	}
}
