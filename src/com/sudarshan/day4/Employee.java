package com.sudarshan.day4;

public class Employee {
	private static long generateEmployeeId = 150023;
	private final double specialAllowlance = 250.80;
	private final double hra = 1000.50;
	
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	
	public Employee() {
//		this.employeeId = generateEmployeeId++;
	}
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	
	public double calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary* specialAllowlance/100) + (basicSalary*hra/100);
		return salary;
	}
	
	
}
