import java.util.Scanner;

class Mycalculator
{

	public static void showMenu()
	{
		System.out.println("===============================");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("5.거듭제곱");
		System.out.println("0.끝내기");
		System.out.println("===============================");

	}

	public static void main(String[] args)
    {
		Scanner sc = new Scanner (System.in);
     
     
		while(true) 
		{
	    	showMenu();
	        
			int nMenu = sc.nextInt();
			
			if(nMenu == 0)
		      {
		        System.out.println("계산기를 종료합니다.");
		        break;
		      }
		      if (nMenu > 5)
		     {
		       System.out.println("없는 메뉴 입니다.");
		       System.out.println("메뉴를 다시 선택하세요.");
		       continue;
		     }
		      if (nMenu == 1)
		    	  add();
		      if (nMenu == 2)
		    	  subtraction();
		      if (nMenu == 3)
		    	  multiply();
		      if (nMenu == 4)
		    	  division();
		      if (nMenu == 5)
		    	  power();
			
			
		}
    	
    	
     }
	

	public static void add()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("***더하기***");
		System.out.println("첫 번째 수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int num2 = sc.nextInt();
		int Result1 = num1 + num2;
		System.out.println("더하기 결과 : " + Result1);
	}

	public static void subtraction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***빼기***");
		System.out.println("첫 번째 수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int num2 = sc.nextInt();
		int Result2 = num1 - num2;
		System.out.println("빼기 결과 : " + Result2);
	}

	public static void multiply()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***곱하기***");
		System.out.println("첫 번째 수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int num2 = sc.nextInt();
		int Result3 = num1 * num2;
		System.out.println("곱하기 결과 : " + Result3);
	}

	public static void division()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***나누기***");
		System.out.println("첫 번째 수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int num2 = sc.nextInt();
		int Result4 = num1 / num2;
		int Result5 = num1 % num2;
		System.out.println("나누기 몫 : " + Result4);
		System.out.println("나누기 나머지 : " + Result5);
	}

	public static void power()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***거듭제곱***");
		System.out.println("밑수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("지수를 입력하세요.");
		int num2 = sc.nextInt();

		int Result = 1;
		int i = 0;
		for (i = 0; i < num2; i = i + 1)
		{
			Result = Result * num1;
			// System.out.println(nResult);
		}
		System.out.println(num1 + "의 " + num2 + "승은 " + Result);
	}

}
