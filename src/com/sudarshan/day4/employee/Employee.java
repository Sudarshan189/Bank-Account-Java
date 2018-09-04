package com.sudarshan.day4.employee;

public abstract class Employee {
	/*
	 * Employee Id, Employee name, HRA, PF, PT, Basic Salary, Gross Salary, medical,
	 * net salary
	 */
	private long employeeId;
	private String employeeName;
	private double hra;
	private double pf;
	private double basicSalary;
	private double grossSalary;
	private double netSalary;

	private static final double PT = 200;
	private static final double MEDICAL = 500;

	public Employee() {
		super();
	}

	public Employee(long employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public double calculateNetSalary(double basicSalary) {
		this.basicSalary = basicSalary;
		hra = 0.5 * this.basicSalary;
		pf = 0.12 * this.basicSalary;
		grossSalary = hra + this.basicSalary + MEDICAL;
		netSalary = grossSalary - (pf + PT);
		return netSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", netSalary=" + netSalary
				+ "]";
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public static double getPt() {
		return PT;
	}

	public static double getMedical() {
		return MEDICAL;
	}

}
