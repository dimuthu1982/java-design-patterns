package test.designpattern.observer;

public interface IWhetherStation extends IObservable {

	public int getTemprature();

	public void startMonitoring();
}
