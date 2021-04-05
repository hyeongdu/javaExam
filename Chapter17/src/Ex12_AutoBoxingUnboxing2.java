
public class Ex12_AutoBoxingUnboxing2
{

	public static void main(String[] args)
	{
		Integer num = 10;
		
		num++;                    //Iteger.valueOf(num.valueOf() +1);
		// <-- 오토 박싱과 오토 언박싱 동시 진행.
		System.out.println(num);
		
		num += 3;                 //Iteger.valueOf(num.valueOf() +3);
		System.out.println(num);
		
		int r =num +  5;              // 오토 언박싱 진행.
		Integer rObj = num - 5;       // 오토 언박싱 진행 + 박싱 진행
		
		System.out.println(r);
		System.out.println(rObj);
 		
		
	}

}
