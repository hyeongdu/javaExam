
//클래스 정의
class Npc
{
	String name;
	int hp;
	//메서드 -동작
	void say() 
	{
		System.out.println("안녕하세요.");
	}

}

public class NpcUse
{
	public static void main(String[] args) {
	//클래스를 이용해 객체 생성
	//-'NPC' 란 설계도(클래스)를 이용해 NPC 객체 만들기
	//클래스 타입 변수는 new를 통해 객체를 생성한다.
	//클래스 타입의 참조 변수는 스택에, 생성된 객테는 힙에 적재된다.
	Npc saram1 = new Npc();
	//필드 접근
	saram1.name = "경비";
	saram1.hp = 100;
	System.out.println(saram1.name + " : " + saram1.hp);
	//메서드 호출
	saram1.say();
	}
	//객체 만들기
	//현실 -->만들어진 자동차가 실제로 눈 앞에 보임
	//컴퓨터 --> 객체를 메모리에 적재
}
