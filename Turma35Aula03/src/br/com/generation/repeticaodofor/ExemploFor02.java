package br.com.generation.repeticaodofor;

import java.util.Scanner;

public class ExemploFor02 {
//Thais Pereira
	// 05/10/21
	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = ent.nextInt();
	            
	            if(num % 2 == 0){
	            	
	                contPar++;

	            }
	          
	            else if (num % 2 == 1){
	            contImpar++;
	           
	        }
	        
	       
	    }
	     	System.out.println("Foram digitados " + contPar + " números pares \n");    
	        System.out.println("E " + contImpar + " números ímpares");
	       
	     	
	}	

	        
	
}