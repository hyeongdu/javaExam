import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException 
	{
		
		Runnable task = () -> {
			int rdTime1 = rd.nextInt(3000) + 1000;
			int rdTime2 = rd.nextInt(3000) + 1000;
			try 
			{
				System.out.println("가위바위보를 시작  하겠습니다");
				Thread.sleep(1000);
				System.out.println("미리 작성해주세요 ");
				Thread.sleep(rdTime1);
				System.out.print("가위 ~");
				Thread.sleep(rdTime2);
				System.out.print("바위 ~~~");
				Thread.sleep(rdTime1);	
				System.out.print("보!");
			}
			catch (Exception e) {}
		};
		
		int result = rd.nextInt(3);
		Thread t = new Thread(task);
		t.start();
		
		List <String>ls = new ArrayList<>();
		ls.add("가위");
		ls.add("바위");
		ls.add("보");
	
		String mYthing = sc.nextLine();
		
		if(mYthing == "")
			System.out.println("입력하지 않았습니다");
		System.out.println("나 : " + mYthing);
		System.out.println("컴퓨터 : " + ls.get(result));
		
		
		
		
	}

}
