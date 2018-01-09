package test.designpattern.behavioral.command;

public class CommandMain {

	public static void main(String[] args) {
		
		ICommandReceiver roboReceiver = new RoboCommandReceiver();
		
		RoboCommandInvoker commandInvoker = new RoboCommandInvoker(roboReceiver);
		
		RoboRemoteController roboRemoteController = new RoboRemoteController(commandInvoker);
		
		roboRemoteController.moveUp();

	}

}
