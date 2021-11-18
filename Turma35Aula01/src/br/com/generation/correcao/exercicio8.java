package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio8 {
	//Thais Pereira 
	// 01/10/21

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFab, custoCon;
		

		System.out.println("valor de fábrica: ");
		custoFab = leia.nextInt();
		
		custoCon = custoFab + (custoFab*0.28) + (custoFab*0.45);
		
		System.out.println("O custo do carro ao consumidor é " + custoCon);

		leia.close();
	}

}

