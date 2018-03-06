package com.herosnoriega.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publishing{
	

	private int id;
	
	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

		
}
