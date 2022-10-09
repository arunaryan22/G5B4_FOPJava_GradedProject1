package org.greatlearning.model;

//subclass TechDepartment will inherit super class SuperDepartment
public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete Coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

	public void print() {
		super.print();
		System.out.println(getTechStackInformation() + "\n" + super.isTodayAHoliday() + "\n");

	}
}
