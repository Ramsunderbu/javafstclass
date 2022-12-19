package org.emp;

public class EmployeeDetails {
	
	public void empInfo() {
		System.out.println("Emlpoyee info:");
	}
	public void empInfo(int id) {
		System.out.println("Emlpoyee id is "+id);
	}
	
	public void empInfo(String name) {
		System.out.println("Emlpoyee name is "+name);
	}
	
	public void empInfo(String email,long mobNum) {
		System.out.println("Emlpoyee email is "+email);
		System.out.println("Emlpoyee mob num is "+mobNum);
	}
	
	public void empInfo(long mobNum,String email) {
		System.out.println("Emlpoyee alternate email is "+email);
		System.out.println("Emlpoyee alternate mob num is "+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		e.empInfo();
		e.empInfo(100);
		e.empInfo("Ram sunder");
		e.empInfo("ramsunderbu@gmail.com", 9600723020l);
		e.empInfo(8778710361l, "ramvijay.sunder3@gmail.com");
	}

}
