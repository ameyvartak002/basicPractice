package Composition;

public class Window 
{
	private int number;
	private String type;
	private String position;
	private String state;
	
	public Window(int number, String type, String position, String state) {
		super();
		this.number = number;
		this.type = type;
		this.position = position;
		this.state = state;
	}

	public void windowState(String state)
	{
		state=getState().toLowerCase();
		if(state.equals("open"))
			System.out.println("Window opened.");
		else
			System.out.println("Window closed");
	}
	
	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getPosition() {
		return position;
	}
	
	public String getState() {
		return state;
	}
}
