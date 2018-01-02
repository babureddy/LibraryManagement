package com.utilities.library;

public class Test {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"Book 1","Author 1","Description1");
		Book book2 = new Book(2,"Book 2","Author 2","Description2");
		Book book3 = new Book(3,"Book 3","Author 3","Description3");
		Book book4 = new Book(4,"Book 4","Author 4","Description4");
		Book book5 = new Book(5,"Book 5","Author 5","Description5");

		User user1 = new User(1,"Babu","Reddy");
		User user2 = new User(2,"Bab","Redy");
		
		LibraryManagement libraryManagement = new LibraryManagement();
		
		if (!libraryManagement.isBookAvailable(1))  libraryManagement.userBook(1,1);
		System.out.println(libraryManagement.toString());
		
	}

}
