package edu.ejercicio1pago;

import java.util.Scanner;

class ejercicioap1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el primer pago");
		int i = scan.nextInt();
		String aux;
		for (int fila = i; fila<= 1; fila++) 
		{
			aux ="";
			for (int columnas = i; columnas<=fila;columnas++)
			{
			    aux = aux + " " + columnas;
			}
			System.out.println(aux);
			
		}
	}

}
