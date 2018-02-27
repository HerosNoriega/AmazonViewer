package com.herosnoriega.amazonviewer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit = 1;
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("BINVENIDOS AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
			int seleccionDeContenido = sc.nextInt();
			
			
		seleccion:
			switch (seleccionDeContenido) {
			case 1:
				System.out.println("Visto Movies!");
				break seleccion;
			case 2:
				System.out.println("Visto Series!");
				break seleccion;
			case 3:
				System.out.println("Visto Books!");
				break seleccion;
			case 4:
				System.out.println("Visto Magazine!");
				break seleccion;
			case 0:
				System.out.println("Saliendo del Sistema");
				exit = 0;
				break seleccion;
			default:
				System.out.println("Seleccion no valida.");
				break seleccion;
			}
			sc.close();
			
		}while(exit != 0);
		
	}
}
