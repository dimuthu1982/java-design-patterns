package test.designpattern.behavioral.observer;

public class WebObserver implements IObserver{

	private IWhetherStation sation;

	public WebObserver(IWhetherStation sation){
		this.sation = sation;
	}

	@Override
	public void update() {
		System.out.println("Update Received to WebObserver : " + sation.getTemprature());

	}

}
