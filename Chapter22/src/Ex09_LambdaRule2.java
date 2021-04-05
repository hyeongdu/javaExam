interface Unit9
{
	int calc (int a, int b) ; //매개변수 둘, 반환형 int
}

public class Ex09_LambdaRule2
{
	public static void main(String[] args)
	{
		Unit9 unit;
		unit = (a, b) -> { return a + b; };
		//unit = a, b -> {return a + b; };  //앞쪽 소괄호 생략 안됨
		//unit = (a, b) -> return a + b; ;  //뒤쪽 중괄호 생략 안됨
		int num = unit.calc(10, 20);
			System.out.println(num);
			
		unit =  (a, b) -> a * b; //뒤쪽 중괄호 return생략 가능
		System.out.println(unit.calc(10,20));
	}
}
//매서드 몸체에 해당하는 내용이 return문이면
//그 문장이 하나라도 생략불가