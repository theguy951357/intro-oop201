package edu.unca.csci201;

public class Book {

	String title;
	String author;
	int isbn;
	Bookmark bookmark;

	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return isbn;
	}

	public void putBookmarkAtPage(Bookmark bookmark, int i) {
		bookmark.setPageNumber(i);
		this.bookmark = bookmark;

	}

	public Bookmark getBookmark() {

		return bookmark;
	}

}
