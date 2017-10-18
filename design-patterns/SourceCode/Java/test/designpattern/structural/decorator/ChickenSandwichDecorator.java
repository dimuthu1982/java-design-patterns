package test.designpattern.structural.decorator;

public class ChickenSandwichDecorator implements Sandwich{

	private Sandwich basicSandwich;
	
	public ChickenSandwichDecorator(Sandwich basicSandwich) {
		this.basicSandwich = basicSandwich; 
	}

	@Override
	public String getDescription() {
		return this.basicSandwich.getDescription().concat(" ").concat("Added Chicken");
	}

	@Override
	public double getPrice() {
		return this.basicSandwich.getPrice() + 3.2;
	}

}
