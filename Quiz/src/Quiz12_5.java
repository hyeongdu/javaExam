public class Quiz12_5
{
	public static void main(String[] args)
	{
		int num[] = {210, 19, 72, 129, 34};
		
		//숫자가 4개면 총 4단계
		for( int i=0; i< num.length; i++) 
		{
			//내부 반복 비교 
			//숫자가 4개면 최대 3번비교 
			//i는 확정된 숫자만큼 비교 안하기
			for (int j=0; j< num.length-1-i; j++) //효율성을 위해 확정된 숫자만큼 빼준다.
			{
				if (num [j] > num[j+1]) 
				{
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1]=tmp;
				}
			}
		}
		for( int i=0; i< num.length; i++) 
		{
			System.out.print(num[i]+ " ");
		}
		
		//System.out.println();
	}
}
