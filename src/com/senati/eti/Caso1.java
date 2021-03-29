package com.senati.eti;

public class Caso1 {

	public static void main(String[] args) {
		String[] nombre = new String[4];
		
		nombre[0]="Julio Pedro";
		nombre[1]="Julio Mesicano";
		nombre[2]="Enma Yanet";
		nombre[3]="Celene Shantal";
		
		for (int i = 0; i < nombre.length; i++)
			System.out.println("Nombre" + (i+1)+":" + nombre[i]);
		

	}

}
