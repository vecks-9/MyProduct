package model;

import java.io.Serializable;

public class Book implements Serializable {
	private int id;
	private String title;
	private String author;
	private String impression;
	
	public Book() {
	}
	public Book(String title, String author, String impression) {
		this.title = title;
		this.author = author;
		this.impression = impression;
	}
	public Book(int id, String title, String author, String impression) {
		this.id			= id;
		this.title		= title;
		this.author		= author;
		this.impression	= impression;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setImpression(String impression) {
		this.impression = impression;
	}
	
	public int getId() {
		return id;
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
