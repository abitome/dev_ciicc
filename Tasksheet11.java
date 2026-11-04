package test;

import java.util.ArrayList;
import java.util.List;

class Book {
	String title;
	String author;
	int yearPublished;
	double price;

	Book(String title, String author, int yearPublished, double price) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.price = price;
	}
}



public class Task11 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>(List.of(new Book("Java Programming", "John Smith", 2021, 39.99)
				,new Book("Python Basics", "Jane Doe", 2020, 29.99)
				,new Book("C++ Essentials", "Michael Johnson", 20019, 49.99)));

		int i = 0;
		for(Book book : books){
			System.out.println("Book " + ++i + ":");
			System.out.println("Title: \"" + book.title + "\"");
			System.out.println("Author: \"" + book.author + "\"");
			System.out.println("Year: \"" + book.yearPublished);
			System.out.println("Price: \"" + book.price);
			System.out.println();
		}
	}
}
