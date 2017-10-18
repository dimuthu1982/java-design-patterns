package test.designpattern.strategy;

public class CalculateSalary {

	IBasicSalary iBasicSalary;
	
	IContractSalary iContractSalary;
	
	IInputBaseSalary iInputBaseSalary;
	
	public CalculateSalary(IBasicSalary iBasicSalary, IContractSalary iContractSalary, IInputBaseSalary iInputBaseSalary){
		this.iBasicSalary = iBasicSalary;
		this.iContractSalary = iContractSalary;
		this.iInputBaseSalary = iInputBaseSalary;
	}
	
	public double calculateSalary(){
		return iBasicSalary.calculate() + iContractSalary.calculateContractSalary() + iInputBaseSalary.calculateInputBase();
	}
}
