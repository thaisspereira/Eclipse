package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio7 {
	
	//Thais Pereira 
	// 01/10/21

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, f, e, x, y;

		System.out.println("Valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Valor de b: ");
		b = leia.nextInt();
		
		System.out.println( "Valor de c: ");
		c = leia.nextInt();
		
		System.out.println("Valor de d: ");
		d = leia.nextInt();
		
		System.out.println("Valor de e: ");
		e = leia.nextInt();
		
		System.out.println("Valor de f: ");
		f = leia.nextInt();
		
	y = ((a*f) - (c*d))/((a*e) - (b*d));
		x = ((c*e) - (b*f))/((a*e) - (b*d));
		
		
		System.out.println("O valor de X é " + x);
		System.out.println("O valor de Y é " + y);
		
		leia.close();
	}

}

