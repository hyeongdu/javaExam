interface Unit10
{
	String move(); // 매개변수 없음, 반환형 String
}

public class Ex10_LambdaRule3
{
	public static void main(String[] args)
	{
		Unit10 unit = ()-> {
			return "인간형 유닛 이동";   //중괄호 제거하려면 리턴도 지워줘야함
		}; 
		System.out.println(unit.move());
	}
}
