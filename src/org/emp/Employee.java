package org.emp;

public class Employee {
	
	public void empId() {
		System.out.println("Employee id:");

	}
	public void empId(String name) {
		System.out.println("Employee name is "+name);

	}
	public void empId(long mobNum, String email,int pinCode ) {
		System.out.println("Employee mob num is "+mobNum);
		System.out.println("Employee email id is "+email);
		System.out.println("Employee pincode is "+pinCode);

	}
	public void empId(String email, long mobNum) {
		System.out.println("Employee alternative mob num is "+mobNum);
		System.out.println("Employee alternative email id is "+email);

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empId("Ramsunder");
		e.empId(9600723020l, "ramsunderbu@gmail.com", 621704);
		e.empId("ramkir1992@gmail.com", 8778710361l );
		
	}

}
