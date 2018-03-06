package com.herosnoriega.amazonviewer.model;

import java.util.Date;

public class Book extends Publishing{
	
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	public Book(String title, Date editionDate, String editorial, String[] authors, String isbn, boolean readed, int timeReaded) {
		super(title, editionDate, editorial, authors);
		this.isbn = isbn;
		this.readed = readed;
		this.timeReaded = timeReaded;
		
	}
	
	
	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	
	
	
	
}
