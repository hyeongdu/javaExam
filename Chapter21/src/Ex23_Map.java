import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex23_Map
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>(); //키값에의해 어디 있는지 위치확인가능 
		map.put("홍길동", "010-1234-1111");
		map.put("홍길동", "010-1234-2222");
		map.put("홍길동", "010-1234-3333");
		
		String str1 = map.get("홍길동1");
		map.remove("홍길동2");
		
		Set<String> ks = map.keySet();
		for (String s : ks) 
		{
			String str2 = map.get(s);
			System.out.println(str2);
		}
		map.put("홍길동2", "010-1234-2222"); //지운값 새로 추가
		map.put("홍길동3", "010-1234-3333"); // 키값 같으면 덮어씀
		
		
	}
}
