package Composition;

public class Main 
{
	public static void main(String args[]) {
		
		Door d = new Door(4, "Auto", "Right", "Open");
		Window w = new Window(2, "Slide", "Left", "Closed");
		Others o = new Others(1,1,1,3);
		
		Room r = new Room(d,w,o);
		//r.getDoor().doorState(r.getDoor().getState());
		//r.getWindow().windowState(r.getWindow().getState());
		r.roomState();
	}
}
