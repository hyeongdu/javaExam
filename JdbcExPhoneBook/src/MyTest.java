
public class MyTest
{
	
	 int num =0;
	
	public  void addTwoNum(int n1, int n2)
	{
		System.out.println(n1 + n2);
	}
	public static void main(String[] args)
	{
		MyTest mt = new MyTest();
		mt.addTwoNum(1, 2);
		System.out.println(mt.num);
	}

}

//스태틱 없이 쓰는 법 
