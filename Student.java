package com.classes.program;

public class Student {
	
	String name;
	int rollNumber;
	int[] marks=new int[3];
	
	
	public Student() {
		name="Unknown";
		rollNumber=0;
		
	}
	
	public Student(String n,int roll,int m1,int m2,int m3) {
		this.name=n;
		this.rollNumber=roll;
		this.marks[0]=m1;
		this.marks[1]=m2;
		this.marks[2]=m3;
		
		
	}
	
	public Student(Student obj) {
		name=obj.name;
		rollNumber=obj.rollNumber;
		marks[0]=obj.marks[0];
		marks[1]=obj.marks[1];
		marks[2]=obj.marks[2];
	}
	
	public void displayDetails() {
		System.out.println("Name :"+name);
		System.out.println("Roll :"+rollNumber);
		System.out.println("Subject 1: "+marks[0]+" Subject 2: "+marks[1]+" Subject 3 : "+marks[2]);
		
	}
	
	public int calculateTotal() {
		return marks[0]+marks[1]+marks[2];
	}
	
	public double calculateAverage() {
		return (marks[0]+marks[1]+marks[2])/3;
	}



}
