package com.herosnoriega.amazonviewer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMenu();
				
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
			System.out.println("3: Chapters");
			System.out.println("4. Books");
			System.out.println("5. Magazines");
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
				showChapters();
				break;
				
			case 4:
				showBooks();
				break;
				
			case 5:
				showMagazines();
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
	
}