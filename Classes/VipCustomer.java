package Classes;

public class VipCustomer 
{
	private String name;
	private double creditLimit;
	private String email;
	public VipCustomer() 
	{
		this("DefaultName",0000,"DefaultEmailID");
	}
	public VipCustomer(String name, double creditLimit, String email) 
	{
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
		System.out.println(name+" \n"+creditLimit+" \n"+email);
	}
	public VipCustomer(String name, String email) 
	{
		this(name,0000,email);
	}
}
