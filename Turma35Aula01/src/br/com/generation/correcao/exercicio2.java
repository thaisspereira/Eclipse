package br.com.generation.correcao;

import java.util.Scanner;

public class exercicio2 {
	//Thais pereira 
	// 01/10/21
 public static void main(String[] args) {
	 
		Scanner leia = new Scanner(System.in);

	 System.out.println("Escreva o numero de dias totais: ");
	 int dias = leia.nextInt();
	 
	 int ano = dias / 365;
	int mes = (dias % 365) / 30;
	int dia = (dias % 365 ) %30;
	
	System.out.println("Sua data de nascimento é:  "+ dia + "/" + mes + "/"+  (2021 - ano) );
	
	System.out.println();
	
	 leia.close();



			
	
}
}
