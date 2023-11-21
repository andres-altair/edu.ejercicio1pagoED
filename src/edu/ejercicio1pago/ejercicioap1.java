package edu.ejercicio1pago;

import java.util.Scanner;

class ejercicioap1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el primer pago");
		int i = scan.nextInt();
		System.out.println("Escribe la mensualidad");
		int mensualidad= scan.nextInt();
		long aux = 10;
		for (int a =1  ; a<=mensualidad; a++) 
		{
			int mes = 2*mensualidad*i;
			aux = a*mes;

			System.out.println(aux);
			
		}
	}

}
