import java.util.Iterator;
import java.util.StringTokenizer;

class MyThread2	implements Runnable
{
	public void run()
	{
		int sum = 0;
		for (int i=0; i<10; i++)
		{
			sum = sum + i;
		}
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + sum);
	}
}


public class Exam01 
{
	
	
	
	public static void main(String[] args)
	
	{
		String stz = "";
		Exam01 ex = new Exam01();
		String s = "진형두 코로나를 조십합시다";
		StringTokenizer st = new StringTokenizer(s);
		String a = st.nextToken()	;
		while(st.hasMoreTokens())
		{
			stz += st.nextToken();
		}
		
		System.out.println(a + stz);
	}
	

}
