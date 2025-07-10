package com.classes.program;

import java.util.Scanner;

public class LibrarySystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book b1=new Book("Wings of Fire","AP J Kalam");
		Book b2=new Book("The untold Story","MSD");
		b1.displayInfo();
		b2.displayInfo();
		b1.borrowBook();
		b1.returnBook();
		b1.returnBook();
		b1.displayInfo();
		sc.close();
	}

}
