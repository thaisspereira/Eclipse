package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicionalExemplo01 {

	 public static void main(String[] args) {
	        
	        Scanner ler = new Scanner(System.in);
	        
	        double nota1, nota2, media;
	        
	        System.out.println("digite a 1? Nota: ");
	        nota1 = ler.nextDouble();
	        
	        System.out.println("digite a 2? Nota: ");
	        nota2 = ler.nextDouble();
	        
	        media = (nota1 + nota2)/2;
	        
	        //La?os Condicionais 
	        if (media >= 9.0) {
	            System.out.println("Aprovado com m?rito..." + "\nM?dia:" + media);
	        }
	        
	        else if(media >= 6.0 && media < 9.0) {
	            System.out.println("Aprovado" + "\nM?dia:" + media);
	        }    
	        
	        else if(media >= 3.0 && media < 6.0) {
	            System.out.println("Recupera??o" + "\nM?dia:" + media);
	        }
	        else {
	            System.out.println("Reprovado." + "\nM?dia:" + media);
	        }
	    }

	}