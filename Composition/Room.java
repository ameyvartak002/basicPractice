package Composition;

public class Room 
{
	private Door door;
	private Window window;
	private Others others;
	
	public Room(Door door, Window window, Others others) {
		super();
		this.door = door;
		this.window = window;
		this.others = others;
	}
	
	public void roomState() {
		getOthers().display();
		this.door.doorState("open");
		this.window.windowState("close");
	}

	private Others getOthers() {
		return others;
	}
}
