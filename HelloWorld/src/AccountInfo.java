
public class AccountInfo {
	
	String name;
	String account;
	String money;

	public AccountInfo(String name, String account, String money)
	{
		this.name = name;
		this.account = account;
		this.money = money;
	}
	public AccountInfo(String name, String account)
	{
		this.name = name;
		this.account = account;
		
	}
	public void GetAccountInfo()
	{
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : "+ account);
		System.out.println("입금 : " + money);
	}
	
}
