public class Ex01_printf
{
	public static void main(String[] args)
	{
		String name = "Hong Gil Dong"; //글자들을 저장할 때 사용하는 표현
		int age = 20;
		double height = 175.5;
		
		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name,age,height);
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name,age,height);
		//2f 는 소수점 두자리까지 나타내기 위함
	}

}