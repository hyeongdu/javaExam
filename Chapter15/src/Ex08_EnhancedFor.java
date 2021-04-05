public class Ex08_EnhancedFor
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};  //향상된 for문
		
		//배열 요소 전체 출력
		for(int e: arr) 
		{
			System.out.println(e + " ");
		}
		System.out.println(); //줄바꿈 목적으로
		
		int sum = 0;
		
		//배열 요소의 전체 합 출력
		for(int e: arr) 
		{
			sum = sum+e;
		}
		System.out.println("sum : "+ sum);
	}

}
