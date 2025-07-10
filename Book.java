package com.classes.program;



public class Book {
	
	
	String title;
	String author;
	boolean isAvailable;
	public Book(String t,String a) {
		this.title=t;
		this.author=a;
		this.isAvailable=true;
	}
	
	public void borrowBook() {
		if(isAvailable) {
			isAvailable=false;
		}
		else {
			System.out.println("Book is Already Borrowed");
		}
	}
	
	
	public void returnBook() {
		if(isAvailable==false) {
			isAvailable=true;
		}
		
		else {
			System.out.println("Book is Not Borrowed");
		}
	}
	
	
	public void displayInfo() {
		System.out.println("Name :"+title);
		System.out.println("Authorn Name :"+author);
		System.out.println("Available :"+isAvailable);
		
	}
	

	}


