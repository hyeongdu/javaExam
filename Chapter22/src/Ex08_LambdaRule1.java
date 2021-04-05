interface Unit8
{
	void move(String s); //매개변수 하나 , 반환형 void
}

public class Ex08_LambdaRule1
{

	public static void main(String[] args)
	{
		Unit8 unit;
		
		unit = (String s) -> {System.out.println(s); };
		unit.move("Lamda : 줄입 없는 표현 : 앞예제 동일");
		
		unit = (String s) -> System.out.println(s);
		unit.move("Lamda : 중괄호 생략");
		
		unit = (s) -> System.out.println(s);
		unit.move("Lamda : 매개변수형 생략");
		
		unit = s -> System.out.println(s); 
		unit.move("Lamda : 매개변수 소괄호 생략");
	}
}
//매서드 몸체가 둘 이상의 문장으로 이뤄져 있거나,
//매개변수의 수가 둘 이상인 경우에는
//각각 중괄호, 소괄호의 생략이 불가능 합니다.