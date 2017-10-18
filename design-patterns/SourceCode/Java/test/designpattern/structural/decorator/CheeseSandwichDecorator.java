package test.designpattern.structural.decorator;

public class CheeseSandwichDecorator implements Sandwich{

	private BasicSandwich basicSandwich;
	
	public CheeseSandwichDecorator(BasicSandwich basicSandwich) {
		this.basicSandwich = basicSandwich; 
	}

	@Override
	public String getDescription() {
		return this.basicSandwich.getDescription().concat(" ").concat("Added Cheese");
	}

	@Override
	public double getPrice() {
		return this.basicSandwich.getPrice() + 2;
	}

}
