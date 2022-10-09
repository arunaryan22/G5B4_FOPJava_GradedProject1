package org.greatlearning.model;

//subclass AdminDepartment will inherit super class SuperDepartment
class AdminDepartment extends SuperDepartment {

	public String departmentName() {

		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your document submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(isTodayAHoliday() + "\n");

	}
}
