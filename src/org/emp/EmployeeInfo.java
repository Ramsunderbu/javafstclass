package org.emp;

public class EmployeeInfo extends ClientInfo {
	
	public void empId() {
		
		System.out.println("Employee id is 1948");

	}
	public void empName() {
		
		System.out.println("Employee name is Ram");
		
	}
	public static void main(String[] args) {
		EmployeeInfo e=new EmployeeInfo();
		e.empId();
		e.empName();
		e.compId();
		e.compName();
		e.clientId();
		e.clientName();
	}

}
