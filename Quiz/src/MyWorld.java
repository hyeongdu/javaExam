class 인간
{
	String 이름;
	int 나이;
	
	void 공격() 
	{
		System.out.println("아프게 공격");
	}
}
class 탱크 
{
	int 공격력;
	void 포탄발사(int power) 
	{
		System.out.println(power+"만큼 포탄발사");
	}
}
public class MyWorld
{

	public static void main(String[] args)
	{
		인간 human1= new 인간();  //핵심은 new 
		human1.이름 = "홍길동";   //핵심 human.
		human1.나이 = 21;
		
		System.out.println(human1.이름);
		System.out.println(human1.나이);
		
		human1.공격();
		
		탱크 tank = new 탱크();
		tank.공격력= 10;
		tank.포탄발사(50);
	}

}
