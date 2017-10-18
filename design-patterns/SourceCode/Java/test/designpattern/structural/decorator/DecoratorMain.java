package test.designpattern.structural.decorator;

public class DecoratorMain {

	public static void main(String[] args) {

		BasicSandwich basicSandwich = new BasicSandwich();
		System.out.println("Basic Sandwich: " + basicSandwich.getDescription() + " Price: " + basicSandwich.getPrice());
		
		CheeseSandwichDecorator cheeseSandwichDecorator = new CheeseSandwichDecorator(basicSandwich);
		System.out.println("Cheese Sandwich: " + cheeseSandwichDecorator.getDescription() + " Price: " + cheeseSandwichDecorator.getPrice());
		
		ChickenSandwichDecorator chickenSandwichDecorator = new ChickenSandwichDecorator(basicSandwich);
		System.out.println("Chicken Sandwich: " + chickenSandwichDecorator.getDescription() + " Price: " + chickenSandwichDecorator.getPrice());
		
		ChickenSandwichDecorator chickenSandwichWithCheeseDecorator = new ChickenSandwichDecorator(chickenSandwichDecorator);
		System.out.println("Chicken, Cheese Sandwich: " + chickenSandwichWithCheeseDecorator.getDescription() + " Price: " + chickenSandwichWithCheeseDecorator.getPrice());
	}

}
