package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio6 {
	
	//Thais Pereira
	// 01/10/21
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, distancia;

		System.out.println("Digite o valor de x no ponto 1: ");
		x1 = leia.nextInt();
		
		System.out.println("Digite o valor de y no ponto 1: ");
		y1 = leia.nextInt();
		
		System.out.println("Digite o valor de x no ponto 2: ");
		x2 = leia.nextInt();
		
		System.out.println("Digite o valor de y no ponto 2: ");
		y2 = leia.nextInt();
		
		distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("A distância entre o ponto 1 e 2 é de " + distancia);
		
		leia.close();
	}

}


