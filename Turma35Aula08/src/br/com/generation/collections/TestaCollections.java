package br.com.generation.collections;

import java.util.ArrayList;

public class TestaCollections {

	public static void main(String[] args) {
		String aula1 = "Bloco I  - Java Puro ";
		String aula2 = "Bloco II - Javacom SpringBoot";
		String aula3 = "Bloco III - FrontEnd - Tudo e Misturado";
		String aula4 = "Bloco IV  - Java Mobile";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		/*String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		/*System.out.println(aulas);
		System.out.println(aulas.size());
		
		aulas.remove(1);
      System.out.println(aulas);
      System.out.println(aulas.size());
      
      //For Each --> Laço de repetgição "Por cada", laço mais moderninho...
      for (String i : aulas) {
    	  System.out.println(i);
      }*/
		// For --> comum 
		for(int  i =0; i< aulas.size();i++) {
			System.out.println((i+1)+ "º Aulas"  +  aulas.get(i));
		}

		
		
		
	}

}
