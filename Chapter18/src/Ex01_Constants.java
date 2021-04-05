interface Human1
{
	int MAM = 1;       //파이널 상수라서 대문자
	int WOMAN =2;
}
interface Machine1
{
	int TANK =1;
	int AIRPLANE =2;
}

public class Ex01_Constants
{
	public static void main(String[] args)
	{
		createUnit(Machine1.TANK);
		
		createUnit(Human1.MAM);
	}
	public static void createUnit(int kind) { 
		switch(kind) {
		case Machine1.TANK:
			System.out.println("탱크를 만듭니다.");
		case Machine1.AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
	}
}
