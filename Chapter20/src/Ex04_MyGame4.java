class Npc4
{
	public String toString() 
	{
		return "This is a Npc3.";
	}
}

class Tank4
{
	public String toString() 
	{
		return "This is a Tank3.";
	}
}

class Camp4
{
	private Object unit;
	
	public void set(Object unit) 
	{
		this.unit = unit;
	}
	public Object get() 
	{
		return unit;
	}
}

public class Ex04_MyGame4
{
	public static void main(String[] args)
	{   //게임 종족 생성
		Camp4 human =  new Camp4();
		Camp4 machine =  new Camp4();
		
		//게임 종족에 유닛을 생성해 담기
		//자식 객체를 부모 타입의 변수에 대입
		human.set("난 공룡");
		machine.set("난 우주인");
		
		System.out.println(human.get());
		System.out.println(machine.get());
	}
}