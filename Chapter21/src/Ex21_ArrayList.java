import java.util.ArrayList;
import java.util.List;

public class Ex21_ArrayList
{
	public static void main(String[] args)
	{
		List<String>list1 = new ArrayList<>(); //list에 string저장, LInkedlist 와 교환가능
		
		list1.add("홍길동");
		list1.add("전우치");
		list1.add("손오공");
		System.out.println(list1.size());  //몇개 있는지 알수 있음
		for(int i =0; i<list1.size(); i++) 
		{
			String str = list1.get(i);
			System.out.println(str);
			if (str.equals("전우치")) 
			{
				list1.remove(i);  //업데이트는 안됨 필요시 지우고 다시 넣기
			}
		}
		
		
	}
}
