package com.classes.program;

public class ConstructorChainingDemo {

	int id;
	String name;
	String email;
	
	public ConstructorChainingDemo() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorChainingDemo(int id, String name) {
		this();// To call The Default Constructor in the Same Class
		this.id = id;
		this.name = name;
		System.out.println("Two Parameters Constructor");
		
	}
	
	public ConstructorChainingDemo(int id, String name, String email) {
		this(0," ");// To call The  Two Parameters Constructor in the Same Class
		this.id = id;
		this.name = name;
		this.email = email;
		System.out.println("Three Parameters Constructor");
	}



	public static void main(String[] args) {
		ConstructorChainingDemo cd=new ConstructorChainingDemo(101,"SSC","satishmallavarapu@gmail.com");
		System.out.println(cd.name);

	}

}
