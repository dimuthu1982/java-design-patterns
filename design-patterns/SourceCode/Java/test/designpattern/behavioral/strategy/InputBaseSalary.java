package test.designpattern.behavioral.strategy;

public class InputBaseSalary implements IInputBaseSalary{
	
	private int units;
	private double costPerUnit;
	
	public InputBaseSalary(){}
	
	public InputBaseSalary(int units, double costPerUnit){
		this.units = units;
		this.costPerUnit = costPerUnit;
	}
	
	public double calculateInputBase(){
		return units * costPerUnit;
	}
}
