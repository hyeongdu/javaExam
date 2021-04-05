import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollect2
{
	public static void myFunc(List<Integer> list3) 
	{
		
	}
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		int n = 1;
		
		List<Integer> list2  = list;
		list2 = new ArrayList<>();
		
		int n2;
		n2 = 1;
		
		myFunc(list2);
	}
	
	//
}
