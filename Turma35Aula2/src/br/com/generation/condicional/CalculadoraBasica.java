package br.com.generation.condicional;
import java.util.Scanner;

public class CalculadoraBasica {
	

	          public static void main(String[] args) {
				
					        
		        try (Scanner ler = new Scanner(System.in)) {
					double numero1, numero2, resultado = 0.0;
					char operacao;

					System.out.println("Digite o primeiro n�mero: ");
					numero1 = ler.nextDouble();
					
					System.out.println("Digite a opera��o: ");
					operacao = ler.next().charAt(0);
					
					System.out.println("Digite o segundo n�mero: ");
					numero2 = ler.nextDouble();
					
					if(operacao == '+') {
					    resultado = numero1 + numero2;
					}
	    
					
					
					else if (operacao == '-') {
						resultado = numero1 - numero2;
						
					}
					 
					 else if (operacao == '*') {
						 resultado = numero1 * numero2;
					 }
					 
					 
					 else if (operacao == '/') {
						 resultado = numero1 / numero2;
						
					 }
					
					
					 else {
						 System.out.println("Dado invalido! " + resultado);
					 }
				}
		        
		       
	          
		        

		


