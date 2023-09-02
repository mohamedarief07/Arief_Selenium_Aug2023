package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName--> from studentName class");

	}
	public void studentDept() {
		System.out.println("studentDept--> from studentDept class");

	}
	public void studentId() {
		System.out.println("studentId--> from studentId class");

	}

	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}
}
