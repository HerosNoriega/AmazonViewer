package com.herosnoriega.amazonviewer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit = 1;
		
		do {
			
			System.out.println("BINVENIDOS AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
			//reads response from user
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			switch (response) {
			case 0:
				System.out.println("Saliendo del Sistema");
				exit = 0;
				break;
			case 1:
				System.out.println("Visto Movies!");
				break;
			case 2:
				System.out.println("Visto Series!");
				break;
			case 3:
				System.out.println("Visto Books!");
				break;
			case 4:
				System.out.println("Visto Magazine!");
				break;
			default:
				System.out.println("Seleccion no valida.");
				break;
			}
			
		}while(exit != 0);
		
	}
}
