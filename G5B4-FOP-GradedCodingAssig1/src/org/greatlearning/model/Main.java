package org.greatlearning.model;

public class Main {

	public static void main(String[] arg) {

		// object declaration of subclass AdminDepartment
		AdminDepartment admin = new AdminDepartment(); 
		admin.print();

		// object declaration of subclass HrDepartment
		HrDepartment hr = new HrDepartment(); 
		hr.print();

		// object declaration of subclass TechDepartment
		TechDepartment tech = new TechDepartment(); 
		tech.print();

	}

}
