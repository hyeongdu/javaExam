
public class MyTest
{
	
	public String loginMenu(String name, String password)
	{
		if(name.equals("1")&&password.equals("2"))
		{
			return " 나야나" ;
					
		}
		else
			return " 응 아니야";
	}
	public static void main(String[] args)
	{
		
		MyTest ms = new MyTest();
		System.out.println(ms.loginMenu("1","1"));
	}

}

//스태틱 없이 쓰는 법 
