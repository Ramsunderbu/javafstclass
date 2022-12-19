package org.emp;

public class ClientInfo extends CompanyInfo {
	
	public void clientId() {
		System.out.println("Client id id 1000");
		

	}
	public void clientName() {
    	System.out.println("Client Name is John");
    	
    
	}
    public static void main(String[] args) {
    	ClientInfo c=new ClientInfo();
    	c.clientId();
    	c.clientName();
	
}
}
