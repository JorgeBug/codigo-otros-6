package com.generation;

//genera un arreglo de enteros aleatorios entre 20 y 400
public class Codigo6 {

	//Sele agregó el método main para poder ejecutar el programa
	public static void main(String[] args) { 
		
	    int[] n = new int[20]; //Se agregó el new

	    for (int i = 0; i < 20; i++) { // le faltaba un + para poder ingrementar correctamente el i
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//Le faltaba el out
	    }
	 
	    System.out.println("\n¿Qué números quiere resaltar? "); //Error de sintaxis, le faltaba la n en el println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine()); //Le faltaba un parentesis 
	    
	    int multiplo = (opcion == 1) ? 5 : 7; //Tenía invertido los operadores : ? y se le acomodo correctamente 

	    //se el cambio el foreach por el for para iterar sobre los elementos del arreglo n
	    for(int e : n) { // Aquí se le cambio a un int para que funcione con un arreglo de enteros.
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } //Le faltaba cerrar llaves
	       else {
	        System.out.print(e + " ");//se le cambio el in por un out debido a que se necesita imprimir una salida.
	      }
	    }

	}
	
	

}
