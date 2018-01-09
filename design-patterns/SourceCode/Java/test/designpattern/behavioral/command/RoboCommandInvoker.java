package test.designpattern.behavioral.command;

public class RoboCommandInvoker implements IRemoteController{

	private ICommandReceiver roboReceiver;
	
	public RoboCommandInvoker(ICommandReceiver roboReceiver) {
		this.roboReceiver = roboReceiver;
	}

	@Override
	public void moveUp() {
		roboReceiver.moveNorth();
	}

	@Override
	public void moveDown() {
		roboReceiver.moveSouth();
	}

	@Override
	public void moveLeft() {
		roboReceiver.moveWest();
	}

	@Override
	public void moveRight() {
		roboReceiver.moveEast();
	}

}
