package br.com.generation.exercioPolimorfismo;

public class Cachorro implements Animal {
	
	@Override
	public void nomeA() {
		
		System.out.println("O nome dele Luke");
		
	}
	@Override
	public void idadeA() {
		
		System.out.println("Ele tem 6 anos");
	}
	@Override
	public void somA() {
		
		System.out.println("Ele faz au au ");
	}
	@Override
	public void correA() { 
		System.out.println("Corre pela estrada a fora ");
		
	}
	@Override
	public void subirArvore() { 
		

}

}
