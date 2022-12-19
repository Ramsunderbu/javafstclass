package org.emp;

public class HdfcBank implements Indianbank,AxiBank {
	private void fixed() {
		System.out.println("Fixed:7%");

	}
	
	
	public static void main(String[] args) {
		HdfcBank h=new HdfcBank();
				h.savings();
		        h.deposit();
		        h.current();
		        h.fixed();
	}

	@Override
	public void deposit() {
		System.out.println("Deposit:6%");
		
	}
	@Override
	public void savings() {
		System.out.println("savings:8%");
		
	}

	@Override
	public void current() {
		System.out.println("Current:5%");
		
	}


}
