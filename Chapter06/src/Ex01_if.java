public class Ex01_if
{
	public static void main(String[] args)
	{
		int num = 100;
		
		if (num > 50) 
		{
			System.out.println("num 변수의 값이 50 보다 큽니다.");			
		}
		//한즐만 실행하면 중괄호를 생략가능
		if (num > 50)
			System.out.println("num 변수의 값이 50 보다 큽니다.");
		
		//같은 줄에 작성 가능. 실행 문장의 끝은 세미콜론 (;)으로 구분.
		if (num > 50) System.out.println("num 변수의 값이 50 보다 큽니다.");
		
		//의도치 않은 결과
		if (num < 50)
			System.out.println(num); // num변수의 답이 궁금해 출력, 원래눈 출력되면 안됨
			System.out.println("num 변수의 값이 50 보다 작습니다.");
	}
}
