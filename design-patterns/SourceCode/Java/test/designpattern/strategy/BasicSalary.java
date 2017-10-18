package test.designpattern.strategy;

public class BasicSalary implements IBasicSalary {

	private double salary;
	
	public BasicSalary(){}
	
	public BasicSalary(double sal){
		this.salary = sal;
	}
	
	public double calculate() {
		
		return this.salary;
	}

}
