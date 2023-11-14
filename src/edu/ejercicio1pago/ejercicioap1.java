package edu.ejercicio1pago;

import java.util.Scanner;

class ejercicioap1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el primer pago");
		long i = scan.nextLong();
		long aux = 1;
		for (int fila = 20; fila<= 1; fila++) 
		{
			 aux= 1 ;
			for (int columnas = 1; columnas<=fila;columnas++)
			{
			    aux = aux*i*2 ;
			}
			System.out.println(aux);
			
		}
	}

}
