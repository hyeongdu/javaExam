import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Convert
{
	public static void main(String[] args)
	{
		// 매개변수로 전달된 객체들을 저장한 컬렉션 객테의 생성 및 반환
		// 이렇게 생성된 리스트 인스턴스는 Immutable(수정불가) 객체임
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "전우치");
		//list.add("멀린");  // 실행하면 에러남
		list = new ArrayList<>(list); // mutable 객체로 변환
		list.add("해리포터");  //에러안남
		
		//ArrayList <E> 객체의 순환
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
			System.out.println();
			
			//ArrayList <E>를 LinkedList<E> 로 변환
			list = new LinkedList<>(list);
			
			//inkedList<E>객체의 순환
			for(String s : list)
				System.out.print(s + '\t');
			System.out.println();
		
	}
}