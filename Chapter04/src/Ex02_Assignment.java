public class Ex02_Assignment
{

	public static void main(String[] args)
	{
		short num = 10;
		num += 77L;   //사람의 강제 형 변환 필요하지 않음
		System.out.println(num);
		
		//num = 10; 인트값 넣어주면 87 나옴, 아래는 77 + 87 임
		num = (short)(num + 77L); //형 변환 필요 a +=b; a = a+b;
		System.out.println(num);
	}
}