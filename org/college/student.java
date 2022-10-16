package week3day1.org.student;

import week3day1.org.department.department;

public class student extends department {
	
	//  multilevel inheritance
		public void studentName() {
			System.out.println("Student class --->> Name of the Student: Hema");
		}
		
		public void studentDepartment() {
			System.out.println("Student class --->> Department: CSE");
		}
		
		public void studentId() {
			System.out.println("Student class ---> Student Id : 2440408");
		}
		
		public static void main(String[] args) {
			//Department dept = new Department();
			student student = new student ();
			
			student.studentName();
			student.studentDepartment();
			student.studentId();
			
			//Multilevel Inheritance
			System.out.println("Find below details:");
			student.deptName();
			student.collegeName();
			student.collegeCode();
			student.collegeRank();
			
		}

	
	

}
