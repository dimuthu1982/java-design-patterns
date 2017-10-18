package test.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WhetherStation implements IWhetherStation{

	private List<IObserver> observerHolders = new ArrayList<IObserver>();
	
	private int temprature;
	
	public void add(IObserver observer) {
		observerHolders.add(observer);
		
	}

	public void remove(IObserver observer) {
		observerHolders.remove(observer);
		
	}

	public void notifyChange() {
		System.out.println("Notifying All");
		for (IObserver observer : observerHolders) {
			observer.update();
		}
		
	}

	public int getTemprature() {
		
		return temprature;
	}

	@Override
	public void startMonitoring() {

		Random r = new Random();	
		try {
			for (int i = 0; i < 10; i++) {

				Thread.sleep(r.nextInt(3000 + i));
				temprature = r.nextInt(500 + i);
				System.out.println("Whether Changed : " + temprature);
				notifyChange();

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
