import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConvertExt
{
	public static void main(String[] args)
	{
		List<String> immutableList = Arrays.asList("홍길동", "전우치", "전우치", "손오공");
		ArrayList<String> mutableList = new ArrayList<>(immutableList);
		
		for(String s : mutableList) 
			System.out.print(s.toString()+ '\t');
		System.out.println();
		
		//중복 제거
		HashSet<String>set= new HashSet<>(mutableList);
		//다시 list로 변환
		mutableList = new ArrayList<>(set);
		
		for(String s : mutableList )
			System.out.print(s.toString()+ '\t');
		System.out.println();
	}
}
