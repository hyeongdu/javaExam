
public class Ex07_while
{

	public static void main(String[] args)
	{
		//2의 배수 출력
		
		int num = 0;
		int count = 0;
		
		while((num++) < 100)
		{
			//if (((num % 5 !=0) || ((num % 7) !=0))
			//continue 5와 7의 배수 아니면 나머지 건너 띄고 위로 이동
			
		    if ((num % 5) != 0)   // && 으로 활용 가능
				continue;
			if ((num % 7) != 0)
				continue;
			
			count++;                    //5와 7의 배수인 경우에만 실행
			System.out.println(num);    //5와 7의 배수인 경우에만 실행
		}
		System.out.println("count : " + count);
		
	}
}
