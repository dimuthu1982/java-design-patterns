package test.designpattern.behavioral.strategy;

public class ContractSalary implements IContractSalary{

	private double numberOfHours;
	
	private double ratePerHour;
	
	public ContractSalary(){}
	
	public ContractSalary(double numberOfHours, double ratePerHour){
		this.numberOfHours = numberOfHours;
		this.ratePerHour = ratePerHour;
	}
	
	public double calculateContractSalary() {
		return numberOfHours * ratePerHour;
	}

}
