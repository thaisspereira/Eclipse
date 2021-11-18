package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicionalExercicio2 {
	//Thais Pereira
	//04/10/21

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Digite o 1º número: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite o 2º número: ");
        num2 = leia.nextInt();
        
        System.out.println("Digite o 3º número: ");
        num3 = leia.nextInt();
        
        if(num1 < num2){
            if (num2 < num3){
                System.out.println("A ordem crescente : " + num1 + " " + num2 + " " + num3 + ".");
            }
                else if (num1 < num3) {
                System.out.println("A ordem crescente : " + num1 + " " + num3 + " " + num2 + ".");
                    
            }
                else {
                System.out.println("A ordem crescente : " + num1 + " " + num3 + " " + num2 + ".");
                }
        }
        
        else if(num2 < num3){
            if (num1 < num3){
                System.out.println("A ordem crescente : " + num2 + " " + num1 + " " + num3 + ".");
            }
                else{
                System.out.println("A ordem crescente : " + num2 + " " + num3 + " " + num1 + ".");
                    
            }
        }
        else {
            System.out.println("A ordem crescente : " + num3 + " " + num2 + " " + num1 + ".");
            }
        
    }



	}


