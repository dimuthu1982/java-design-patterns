package test.designpattern.strategy;

public class StrategyMain {

	public static void main(String[] args) {

		System.out.println("Salary Calculation of Permenent Employee");
		BasicSalary basicSal = new BasicSalary(50000);
		ContractSalary contractSalary = new ContractSalary();
		InputBaseSalary inputBaseSalary = new InputBaseSalary();

		CalculateSalary salary = new CalculateSalary(basicSal,contractSalary,inputBaseSalary);
		System.out.println("Salary: " + salary.calculateSalary());

		System.out.println("\nSalary Calculation of Contract Employee");
		basicSal = new BasicSalary();
		contractSalary = new ContractSalary(22, 70);
		inputBaseSalary = new InputBaseSalary();

		salary = new CalculateSalary(basicSal,contractSalary,inputBaseSalary);
		System.out.println("Salary: " + salary.calculateSalary());
		
		System.out.println("\nSalary Calculation of Input Base Employee");
		basicSal = new BasicSalary();
		contractSalary = new ContractSalary();
		inputBaseSalary = new InputBaseSalary(300, 20);

		salary = new CalculateSalary(basicSal,contractSalary,inputBaseSalary);
		System.out.println("Salary: " + salary.calculateSalary());
		
		System.out.println("\nSalary Calculation of Permenent employeee with Overtime");
		basicSal = new BasicSalary(50000);
		contractSalary = new ContractSalary(12, 50);
		inputBaseSalary = new InputBaseSalary();

		salary = new CalculateSalary(basicSal,contractSalary,inputBaseSalary);
		System.out.println("Salary: " + salary.calculateSalary());

	}

}
