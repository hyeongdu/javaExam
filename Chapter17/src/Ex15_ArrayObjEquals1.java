import java.util.Arrays;

class INum1 
{
	private int num;
	
	public INum1(int num) 
	{
		this.num = num;
	}
}
public class Ex15_ArrayObjEquals1
{
	public static void main(String[] args)
	{
		INum1[] arr1 = new INum1[2];
		INum1[] arr2 = new INum1[2];
		
		arr1[0] =new INum1(1);
		arr2[0] =new INum1(1);
		
		arr1[0] =new INum1(2);
		arr2[0] =new INum1(2);
		System.out.println(Arrays.equals(arr1, arr2));
		
	}

}
