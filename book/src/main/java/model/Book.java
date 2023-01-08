package model;

public class Book {
	private String title;
	private String author;
	private String impression;

	public Book() {
	}
	public Book(String title, String author, String impression) {
		this.title = title;
		this.impression = impression;
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setPass(String author) {
		this.author = author;
	}
	public void setImpression(String impression) {
		this.impression = impression;
	}

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getImpression() {
		return impression;
	}
}
