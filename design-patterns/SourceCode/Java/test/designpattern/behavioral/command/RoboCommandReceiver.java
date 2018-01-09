package test.designpattern.behavioral.command;

public class RoboCommandReceiver implements ICommandReceiver {

	@Override
	public void moveNorth() {
		System.out.println("Moving North...");
		
	}

	@Override
	public void moveSouth() {
		System.out.println("Moving South...");
		
	}

	@Override
	public void moveWest() {
		System.out.println("Moving West...");
		
	}

	@Override
	public void moveEast() {
		System.out.println("Moving East...");
		
	}

}
