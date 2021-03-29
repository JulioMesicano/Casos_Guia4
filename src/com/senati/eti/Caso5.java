package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] arrCodigo = {"A-123","A-456","A-789","A-777"};
		
		String[] arrNombre = {"Julio Mesicano","Enma Yanet","Celene Shantal","Julio Pedro"};
		
		int[] arrNota = {15,12,17,8};
		
		int[] arrContra = {123,456,789,999};
		
		System.out.println("Busqueda de datos");
		System.out.println("-----------------");
        System.out.print("Ingrese codigo.... :");
        String codigo = sc.nextLine();
        
        
        
        
        int p = -1;
        
        for (int x = 0 ; x < arrCodigo.length; x++) {
        	if(codigo.equals(arrCodigo[x])) {
        	   p =x;
        	   break;	
         
        		  				
        	}
        }
        
        
        
    
        
        
        if (p == -1) {
        	System.out.println("\n---------------------");
        	System.out.println("Codigo No registrado");
        	System.out.println("--------------------");
        	
        }
        
        else {
        	System.out.println("\n---------------------");
        	System.out.println("Codigo registrado");
        	System.out.println("--------------------");
        	System.out.println("Ingrese contra.....");
        	int contra = sc.nextInt();
        	
        	if (contra==arrContra[p]) {
        		
        	System.out.println("Codigo.......: " + arrCodigo[p]);
        	System.out.println("Alumno.......: " + arrNombre[p]);
        	System.out.println("Nota.......: " + arrNota[p]);
        	
        	System.out.println("Seleccione una de las opciones por favor.....:");
        	System.out.println("[1.Retiro]");
        	int op= sc .nextInt();
        	String operacion="";
        	float hecha=0;
        	
        	switch (op){
        		case 1 :
        		  System.out.println("cuanto desea retirar");
        		  int lee = sc.nextInt();
        	      operacion="Retiro";
        	      hecha=arrNota[p]-lee;
        	      break;
        	 
        	}
        	System.out.println(""+operacion);
        	System.out.println(""+hecha);
        	}
        	
            if (arrNota[p]>=13) 
             System.out.println("El estado es.... : Aprobado");
   
                   
            else  
             System.out.println("El estado es.... : Desaprobado");;	
             
        	
        	
        	
        }
        
        
	}

}
