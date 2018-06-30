package Composition;

public class Others 
{
	private int tv;
	private int fan;
	private int bed;
	private int chairs;
	
	public Others(int tv, int fan, int bed, int chairs) 
	{
		super();
		this.tv = tv;
		this.fan = fan;
		this.bed = bed;
		this.chairs = chairs;
	}

	public void display()
	{
		System.out.println("Room has " + tv + " TV, " + fan + " Fan, " + bed + " Bed, " + chairs + " Chairs");
	}
	
	public int getTv() {
		return tv;
	}

	public int getFan() {
		return fan;
	}

	public int getBed() {
		return bed;
	}

	public int getChairs() {
		return chairs;
	}
	
	
}
