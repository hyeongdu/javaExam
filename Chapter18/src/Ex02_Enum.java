enum Human2{MAN, WOMAN} //파이널 상수라서 대문자

enum Machine2{TANK, AIRPLANE}

public class Ex02_Enum
{
	public static void main(String[] args)
	{
		createUnit(Machine2.TANK);
		
		//createUnit (Human2.Man); 잘못된 상수 사용: 에러
		//참고:C처럼 숫자로 비교하면 에러난다.
		//if (Human2.Man==0) {}
	}
	
	public static void createUnit(Machine2 kind) { 
		switch(kind) {
		case TANK:
			System.out.println("탱크를 만듭니다.");
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
	}
}
//컴파일 및 실행과정에서 발견되지 않는 오류