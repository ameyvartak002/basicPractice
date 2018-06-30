package Composition;

public class Door 
{
	private int size;
	private String lock;
	private String position;
	private String state;
	
	public Door(int size, String lock, String position, String state) 
	{
		this.size = size;
		this.lock = lock;
		this.position = position;
		this.state = state;
	}

	public void doorState(String state)
	{
		state=getState().toLowerCase();
		if(state.equals("open"))
			System.out.println("Door opened.");
		else
			System.out.println("Door closed");
	}
	
	public int getSize() {
		return size;
	}

	public String getLock() {
		return lock;
	}

	public String getPosition() {
		return position;
	}
	
	public String getState() {
		return state;
	}
}
