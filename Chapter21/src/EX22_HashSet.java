import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX22_HashSet
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>(); //해시코드가 같고 이퀄스도 같으면 중복처리한다.
		set.add("홍길동");
		set.add("전우치");
		set.add("손오공");
		set.add("홍길동");
		
		System.out.println(set.size());
		
		for (String s : set) 
		{
			System.out.println(s);
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) 
		{
			String str = itr.next();
			System.out.println(str);
		}
		
		for (Iterator<String> itr2 = set.iterator(); itr2.hasNext();) 
		{
			String str = itr2.next();
			System.out.println(str);
		}
		
	}
}
