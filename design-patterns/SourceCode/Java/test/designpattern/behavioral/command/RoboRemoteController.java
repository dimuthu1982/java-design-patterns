package test.designpattern.behavioral.command;

public class RoboRemoteController implements IRemoteController{

	private RoboCommandInvoker roboInvoker;
	
	public RoboRemoteController(RoboCommandInvoker roboInvoker) {
		this.roboInvoker = roboInvoker;
	}

	@Override
	public void moveUp() {
		roboInvoker.moveUp();
		
	}

	@Override
	public void moveDown() {
		roboInvoker.moveDown();
		
	}

	@Override
	public void moveLeft() {
		roboInvoker.moveLeft();
		
	}

	@Override
	public void moveRight() {
		roboInvoker.moveRight();
		
	}

}
