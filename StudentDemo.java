package com.classes.program;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.displayDetails();
		s.calculateTotal();
		s.calculateAverage();
		Student s1 = new Student("SSC", 1, 98, 95, 70);
		s1.displayDetails();
		int t = s1.calculateTotal();
		System.out.println("Total :" + t);
		double av = s1.calculateAverage();
		System.out.println("Average :" + av);
		
		Student s2=new Student(s1);
		s2.displayDetails();
	}

}
