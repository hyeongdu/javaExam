public class Ex05_for
{

	public static void main(String[] args)
	{
		for (int i=2; i<10; i++)
		{
			System.out.print((2 * i) + " ");
		}
		System.out.println();
		
		//한줄만 실행하면 중괄호를 생략 가능
		
		for (int i=2; i<10; i++)
			System.out.print((3 * i) + " ");
		System.out.println();
		
		//같은 줗에 작성가능. 실행 문장의 끝은 세미콜론(;)을 구분
		//보통 이렇게 만들지 않음. 책 만들때 자기 없을시 사용
		for (int i=2; i<10; i++) System.out.print((4 * i) + " ");
		System.out.println();
		
		//의도치 않은 결과
		for (int i=2; i<10; i++)
			//System.out.println((5 * i) + " "); 변수의 값이 궁긍해 출력
			System.out.print((5 * i) + " "); 
		System.out.println();
		
	}
}
