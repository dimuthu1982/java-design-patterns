package test.designpattern.observer;

public class PhoneObserver implements IObserver{

	private IWhetherStation sation;
	
	public PhoneObserver(IWhetherStation sation){
		this.sation = sation;
	}
	
	@Override
	public void update() {
		System.out.println("Update Received to PhoneObserver : " + sation.getTemprature());
		
	}

}
