package org.emp;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the company name:");
		String compName = sc.nextLine();
		System.out.println("Employee company name is "+compName);
		
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Employee name is "+name);
		
		
		System.out.println("Enter the age:");
		byte age = sc.nextByte();
		System.out.println("Employee age is "+age);
		
		System.out.println("Enter the atm pin:");
		short atmPin = sc.nextShort();
		System.out.println("Employee atm pin is "+atmPin);
		
		System.out.println("Enter the pincode:");
		int pinCode = sc.nextInt();
		System.out.println("Employee pincode is "+pinCode);
		
		System.out.println("Enter the mob num:");
		long mobNum = sc.nextLong();
		System.out.println("Employee mob num is "+mobNum);
		
		System.out.println("Enter the weight:");
		float weight = sc.nextFloat();
		System.out.println("Employee weight is "+weight);
		
		System.out.println("Enter the salary:");
		double salary = sc.nextDouble();
		System.out.println("Employee salary is "+salary);
		
		System.out.println("Enter the marital status:");
		boolean maritalStatus = sc.nextBoolean();
		System.out.println("Employee marital status is "+maritalStatus);
	}
	

}
