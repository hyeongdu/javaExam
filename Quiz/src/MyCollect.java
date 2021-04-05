import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollect
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		arr[4]= 5;
		
		int[] arr2 = {1,2,3,4,5};  //배열의 초기화 
		
		List<Integer> list = new ArrayList<>();
		list.add(1);   //index 0
		list.add(2);
		list.add(3);   //index 2
		list.remove(2);
		
		for (int i =0; i<list.size(); i++) 
		{
			int n = list.get(i);
		}
		for (Integer e : list) 
		{
			int n = e;
		}
		for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) 
		{
			int n = itr.next();
		}
			
		
	}
}
