interface Unit4
{
	void move();
}

class HumanCamp4
{
	private int speed = 10;
	
	public Unit4 getMarine()
	{
//		class Marine3 implements Unit3
//		{
//			//외부 클래스의 자원(speed) 사용 가능
//			public void move() 
//			{
//				System.out.printf("인간형 유닛이 %d속도로 이동합니다. \n", speed);
//			}	
//		}
//		return new Marine4();
		//이름이 없으므로 부모 클래스나 인터 페이스의 이름사용
		return new Unit4() 
		{
			public void move() 
			{
				System.out.printf("인간형 유닛이 %d속도로 이동합니다. \n", speed);
			}
		};  //하나의 실행문이므로 세미콜론으로 끝납니다.
	}
}

public class Ex04_AnonymousInner2
{
	public static void main(String[] args)
	{
		HumanCamp4 hc = new HumanCamp4();
		Unit4 unit =hc.getMarine();
		unit.move();	
	}
}
