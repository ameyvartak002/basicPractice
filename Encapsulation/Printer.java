package Encapsulation;

public class Printer {
	private int tonerLevel = 100;
	private int pages;
	private String type;
	
	public Printer(int tonerLevel, int pages, String type) {
		super();
		if(tonerLevel >= 0 && tonerLevel <= 100)
		{
			this.tonerLevel = tonerLevel;
		}
		this.pages = pages;
		this.type = type;
	}
	
	public void printPage(int page)
	{
		String printer = this.type.toLowerCase();
		if(printer.equals("single") && (page <= this.pages) && (page <= this.tonerLevel)) 
		{
			this.pages -= page;
			this.tonerLevel -= page;
		}
		else if(printer.equals("duplex") && page <= this.pages && page <= this.tonerLevel) 
		{
			this.pages -= ((page / 2) + (page % 2));
			this.tonerLevel -= page;
		}
		else
		{
			System.out.println("Insuffcient resources!");
		}
		System.out.println("Pages remaining : " + this.pages + "\nToner level at : " + this.tonerLevel);
	}
}
