import java.util.Scanner;

interface MyTest1
{
	void myCalc(int num);
}

public class LamdaTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //컨트롤 시프트 o (알파벳)
		
		MyTest1 my = (num) -> {System.out.println(num + 1); };
		
		my.myCalc(10);
		
	}

}
