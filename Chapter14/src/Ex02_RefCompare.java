public class Ex02_RefCompare
{
	public static void main(String[] args)
	{
		String str1 = new String("자바 프로그래밍");
		String str2 = new String("자바 프로그래밍");
		String str3 = "자바 프로그래밍";
		String str4 = "자바 프로그래밍";
		
		if(str1 == str2)
			System.out.println("srt1과 str2 는 동일 객체 참조");
		else
			System.out.println("srt1과 str2 는 다른 객체 참조");
		
		if(str3 == str4)
			System.out.println("srt3과 str4 는 동일 객체 참조");
		else
			System.out.println("srt3과 str4 는 다른 객체 참조");
	}

}
