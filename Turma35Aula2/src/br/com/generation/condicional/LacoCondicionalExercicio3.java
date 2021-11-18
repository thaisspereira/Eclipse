package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicionalExercicio3 {
	//Thais Pereira
	// 04/10/21 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade,infantil,juvenil,adulto;
		String categoria;
		
		System.out.println("Por favor, digite sua idade:");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <=14);{
			System.out.println("Você esta na categoria Infantil!" );
		}	
		else if (idade >= 15 && idade <=17);{
				System.out.println("Voce esta na categoria Juvenil");
		
		 }
		else  if (idade >= 18 && idade <=25);{
		System.out.println("Você esta na categoria Adulta ");
		
		}
     ler.close();
		}
	}

				
		
	
		
		
		
	

