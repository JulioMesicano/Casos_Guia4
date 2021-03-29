package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[][] datos = { {"Joe Castillo","Rosa Flores", "Ricardo Tello"},
				             {"Callao","Puente Piedra", "Comas"} };
		
		
		//Impresion de valores por filas
		
		System.out.println("\n---------Impresion por filas----------");
		for (int f = 0; f < datos.length; f++) {
		    for (int c = 0; c < datos[0].length; c++)
		    	System.out.print(String.format("%-20s",datos[f][c] + "\t"));
		
		    System.out.println();
		}
		
		//Impresion de valores por columnas
		
		System.out.println("\n---------Impresion por Columnas----------");
		for (int c = 0; c < datos[0].length; c++) {
		    for (int f = 0; f < datos.length; f++)
			   System.out.print(String.format("%-20s",datos[f][c] + "\t"));
				
		System.out.println();
		
		}

	}

}
