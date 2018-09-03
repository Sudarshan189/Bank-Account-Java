package com.sudarshan.day4.employee;

public class SalesManager extends Employee {
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public SalesManager() {
		super();
	}

	public SalesManager(long employeeId, String employeeName) {
		super(employeeId, employeeName);
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		double salary = super.calculateNetSalary(basicSalary);

		petrolAllowance = 0.08 * super.getBasicSalary();
		foodAllowance = 0.13 * super.getBasicSalary();
		otherAllowance = 0.03 * super.getBasicSalary();

		super.setNetSalary(salary + petrolAllowance + foodAllowance + otherAllowance);
		return super.getNetSalary();
	}

}
