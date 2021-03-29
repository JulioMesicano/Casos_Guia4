package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int numeros_pares = 0 , numeros_impares = 0;
		float suma = 0;
		
        Integer[] numero = new Integer[5];
		
		System.out.println("Ingrese numeros");
		System.out.println("----------------");
		
		// Leer los datos para el arreglo
        for ( int x = 0 ; x < numero.length; x++) {
        	System.out.print("Numero" + (x+1)+ ":");
        	numero[x] = sc.nextInt();
        	
        	if (numero [x] % 2 ==0) {
        		numeros_pares++;}
        	
        	else {
               numeros_impares++;}
        	
        	suma+=numero [x];	
    	 
      }
        System.out.println("\n--------------R E S U L T A D O S---------------------");
		System.out.println("En los datos ingresados hay : "+numeros_pares + " pares");
		System.out.println("En los datos ingresados hay : "+numeros_impares + " impares");
		System.out.println("El promedio de todos los numeros ingresados es "+suma/5);

	}

}
