package test.designpattern.behavioral.observer;

public interface IWhetherStation extends IObservable {

	public int getTemprature();

	public void startMonitoring();
}
