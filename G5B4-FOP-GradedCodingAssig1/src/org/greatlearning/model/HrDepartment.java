package org.greatlearning.model;

//subclass HrDepartment will inherit super class SuperDepartment
public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

	public void print() {
		super.print();
		System.out.println(doActivity() + "\n" + super.isTodayAHoliday() + "\n");

	}
}
