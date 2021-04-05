abstract class 건물  //한글 공백 만들지 않기
{
	String 창;
	
	abstract void 문열기();
	abstract void 문닫기();
	void 건설() 
	{
		
	}
	void 파괴() 
	{
		
	}
}

interface 투명화
{
	void 투명화10초();
}

class 상점 extends 건물 
{
	String 진열장;
	
	void 문열기() {}
	void 문닫기() {}
}

class 신전 extends 건물 implements 투명화
{
	String 제단;
	
	void 문열기() {}
	void 문닫기() {}
	public void 투명화10초() {}
}

class 왕궁 extends 건물 implements 투명화
{
	String 대전;
	
	void 문열기() {}
	void 문닫기() {}
	public void 투명화10초() {}
}

public class MyGameWorld
{
	public static void doDestroy(건물 obj) 
	{
		obj.파괴();
	}
	public static void main(String[] args)
	{
		왕궁 build1 = new 왕궁();
		신전 build2 = new 신전();
		상점 build3 = new 상점();
		
		doDestroy(build1);
		
	}
}
