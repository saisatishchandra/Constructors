package com.classes.program;

public class Constructors {
		
	String name;
	int age;
	
	
	//Default Constructor
	
	public Constructors() {
		System.out.println("Default Constructor");
	}
	
	
	//Parameterized Constructor
	
	public Constructors(int a,String n) {
		this.name=n;
		this.age=a;
		System.out.println("Parametarised Constructor");
	
	}
	
	
	// Copy Constructor
	
	public Constructors(Constructors obj) {
		name=obj.name;
		age=obj.age;
		System.out.println("Copy Constructor");
	
	}
	

	
	
	public static void main(String[] args) {
		Constructors c=new Constructors();
		Constructors c1=new Constructors(23,"Akshay");
		Constructors c2=new Constructors(c1);
		c.name="SSC";
		c.age=21;
		
		System.out.println(c.name+" - "+c.age);
		System.out.println(c1.name+" - "+c1.age);
		System.out.println(c2.name+" - "+c2.age);

	}

}
