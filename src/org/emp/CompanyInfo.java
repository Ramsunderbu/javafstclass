package org.emp;

public class CompanyInfo {
	
	public void compId() {
		System.out.println("Company id is 1234");
		

	}
    public void compName() {
	   System.out.println("Company Name is TCS");
	

}
    public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.compId();
		c.compName();
	}
}
