package Classes;

public class Bank 
{
	private int accNo;
	private double balance;
	private String name;
	private String email;
	private int phone;
		
	public void setData(int accNo, double balance, String name, String email, int phone)
	{
		this.accNo=accNo;
		this.balance=balance;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	public int getAccNo()
	{
		return this.accNo;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public int getPhone()
	{
		return this.phone;
	}
	
	public double depositFunds(double balance)
	{
		this.balance=this.balance+balance;
		return this.balance;
	}
	public double withdrawFunds(double balance)
	{
		if(getBalance()<balance)
		{
			System.out.println("Insufficient Funds!");
			return this.balance;
		}
		else
		{
			this.balance=getBalance()-balance;
			return this.balance;
		}
	}
}

