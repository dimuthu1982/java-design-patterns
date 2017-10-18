package test.designpattern.observer;


public class ObserverMain {

	
	public static void main(String[]args){
		IWhetherStation whetherStation = new WhetherStation();
		
		IObserver phoneObserver = new PhoneObserver(whetherStation);
		IObserver webObserver = new WebObserver(whetherStation);
		
		whetherStation.add(phoneObserver);
		whetherStation.add(webObserver);
		
		whetherStation.startMonitoring();
		System.out.println("Monitoring Terminated...");

	}
	
}
