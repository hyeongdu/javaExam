
public class Ex03_Varargs
{
	public static void hellpEverybody(String... vargs) 
	{
		for (String s : vargs)
			System.out.print(s + '\t');
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		hellpEverybody("홍길동");
		hellpEverybody("홍길동", "전우치");
		hellpEverybody("홍길동", "전우치", "손오공");
	}
}