package org.test.tcs;

public class EmployeeDetails {
	private void empId() {
		System.out.println("Employee id is 1948");

	}
    private void empName() {
		System.out.println("Employee name is Ram");

	}
    public static void main(String[] args) {
    	
		EmployeeDetails e=new EmployeeDetails();
		
		e.empId();
		e.empName();
	}
}
