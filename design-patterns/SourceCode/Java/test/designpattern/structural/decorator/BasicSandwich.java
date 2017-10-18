package test.designpattern.structural.decorator;

public class BasicSandwich implements Sandwich{

	@Override
	public String getDescription() {
		return "White bread Sandwich";
	}

	@Override
	public double getPrice() {
		return 1.30;
	}

}
