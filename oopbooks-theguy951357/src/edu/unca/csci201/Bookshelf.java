package edu.unca.csci201;

import java.util.Scanner;

public class Bookshelf {

	public static void main(String[] args) {

		// Create a bestseller book
		Book book1 = new Book("IT", "Stephen King", 1501182099);

		// Create a textbook
		Book book2 = new Book("Java Foundations", "John Lewis, Peter Depasquale, Joseph Chase", 134285433);

		System.out.println("Right now you have two books in your library: ");

		System.out.println(book1.getTitle() + " by " + book1.getAuthor() + " - " + book1.getISBN());
		System.out.println(book2.getTitle() + " by " + book2.getAuthor() + " - " + book2.getISBN());

		System.out.print("Please enter a new book's title to buy: ");
		Scanner scan = new Scanner(System.in);

		String title = scan.nextLine();

		System.out.print("Who is this book by? ");
		String author = scan.nextLine();

		System.out.print("What is it's ISBN? ");
		int isbn = scan.nextInt();

		Book book3 = new Book(title, author, isbn);

		System.out.println("This book has been placed on your bookshelf.");

		System.out.println("Now let's begin reading.");

		Bookmark firstBookmark = new Bookmark();

		book1.putBookmarkAtPage(firstBookmark, 1);

		System.out.println(
				"You are reading: " + book1.getTitle() + " and are on page: " + book1.getBookmark().getPageNumber());

		book3.putBookmarkAtPage(firstBookmark, 225);

		System.out.println("Now you are reading: " + book3.getTitle() + " and are on page: "
				+ book3.getBookmark().getPageNumber());

		System.out.println("That was fast!");

	}

}
