package edu.ejercicio1pago;

import java.util.Scanner;

class ejercicioap1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el primer pago");
		long i = scan.nextLong();
		long aux = 10;
		for (int a =2  ; a<= 20; a++) 
		{
			 aux = a* aux *2;
			
			System.out.println(aux);
			
		}
	}

}
