package com.sudarshan.day4.employee;


public class President extends Employee {

	private static final double KM_COST = 8;
	private double kilometerTravelled;
	private double tourAllowance;
	private static final double TELEPHONE_ALLOWANCE = 2000;

	public President() {
		super();
	}

	public President(long employeeId, String employeeName, double kilometertravelled) {
		super(employeeId, employeeName);
		this.kilometerTravelled = kilometertravelled;
	}

	@Override
	public double calculateNetSalary(double basicSalary) {
		double salary = super.calculateNetSalary(basicSalary);
		tourAllowance = KM_COST * kilometerTravelled;

		super.setNetSalary(salary + tourAllowance + TELEPHONE_ALLOWANCE);
		return super.getNetSalary();
	}

}
