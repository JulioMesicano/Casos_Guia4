package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][4];
		
		System.out.println("Lectura de numeros");
		System.out.println("-------------------");
		
		int num_mayor = 0;
		int num_menor= 0;
		float sumatoria  = 0;
		
		
		for (int f= 0; f < numero.length;f++) {
			System.out.println("\nDatos de la Fila : " + (f+1));
			System.out.println("---------------");
		   
			for(int c = 0 ; c < numero[0].length;c++) {
				System.out.print("Numero" + (c+1) + ":");
				numero[f][c]= sc.nextInt();
				
				if ( f == 0 && c == 0) {
					num_mayor = numero[0][0];
					num_menor = numero[0][0];
				}
				
				
				if (numero[f][c] > num_mayor) num_mayor = numero[f][c];
				
				if (numero[f][c]< num_menor) num_menor = numero[f][c]; 
				sumatoria+=numero[f][c];
				
			}
			
		}
        
		System.out.println("--------------------------");
		System.out.println("--------RESULTADOS--------");
		System.out.println("Numero mayor........."+num_mayor);
		System.out.println("Numero menor........."+num_menor);
		System.out.println("Sumatoria............"+sumatoria);
		System.out.println("Promedio............."+ sumatoria/12);
	}

}
