package com.herosnoriega.amazonviewer;
import java.util.Date;
import java.util.Scanner;

import com.herosnoriega.amazonviewer.model.Chapter;
import com.herosnoriega.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie("Coco", "Animation", "Lee Unkrich", 120, (short)2017);
		System.out.println(movie);
		
		Chapter chapter = new Chapter("Rambo", "Action", "Steve", 120, (short)2015, 1);
		System.out.println(chapter);
		
		//showMenu();
				
	}
	
	public static void showMenu() {	

		int exit = 1;	
		do {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("BINVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			System.out.println("");
			
			//reads response from user
			
			int response = Integer.valueOf(scanner.nextLine());
			
			switch(response) {
			case 0:
				exit = 0;
				System.out.println("");
				System.out.println("Saliendo del Sistema!");
				System.out.println("");
				break;
			
			case 1:
				showMovies();
				break;
			
			case 2:
				showSeries();
				break;
			
			case 3:
				showBooks();
				break;
				
			case 4:
				showMagazines();
				break;
				
			case 5:
				makeReport();
				break;
			case 6:
				//Date date = new Date();
				makeReport(new Date());
				break;
				
			default:
				System.out.println("");
				System.out.println(":: Selecciona una opcion! ::");
				System.out.println("");
				break;
			}
			
			
		}while(exit != 0);
	}

	public static void showMovies() {
		System.out.println();
		System.out.println(":: MOVIES ::");
		System.out.println();
	}
	
	public static void showSeries() {
		System.out.println();
		System.out.println(":: SERIES ::");
		System.out.println();
	}
	
	public static void showChapters() {
		System.out.println();
		System.out.println(":: CHAPTERS ::");
		System.out.println();
	}
	
	public static void showBooks() {
		System.out.println();
		System.out.println(":: BOOKS ::");
		System.out.println();
	}
	
	public static void showMagazines() {
		System.out.println();
		System.out.println(":: MAGAZINES ::");
		System.out.println();
	}
	
	
	public static void makeReport() {
		
	}
	
	//sobrecarga de metodo anterior makeReport con argumento date obligatorio
	public static void makeReport(Date date) {
		
	}
	
}