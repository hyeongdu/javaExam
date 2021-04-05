import java.util.Scanner;
public class ThreadRunable
{
	
	public static void main(String[] args)
	{
		System.out.println("숫자를 입력해 주세요,");
		Scanner s= new Scanner(System.in);
		String s_num = s.nextLine();
		int n_num = Integer.parseInt(s_num);
		
		
		
		Runnable task = () -> { 
			try
			{ 
				int i =0;
				while(i<n_num)
				{
					Thread.sleep(1000);
					i = i+1;
					System.out.println("Thread : " + i);
				}
			}catch(Exception e)
			{
				System.out.println("예외 : " + e);
			}
		};
		
		try {
			Thread t = new Thread(task);
			t.start();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("이름을 입력해 주세요.");
		String s_name = s.nextLine()	;
		System.out.println(s_name);
		
	}
}


