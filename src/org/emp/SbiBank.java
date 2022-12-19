package org.emp;

// Child Class
public class SbiBank extends RbiBank {
	
	@Override
	public void savings() {
		System.out.println("Savings:4%");
	}
	public static void main(String[] args) {
		SbiBank s=new SbiBank();
		s.savings();
		s.deposit();
	}

}
