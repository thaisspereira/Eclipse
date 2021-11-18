package br.com.generation.exercioPolimorfismo;

public class Cavalo implements Animal{
	
	@Override
	public void nomeA() {
		
		System.out.println("O nome dele é Horse");
		
	}
	@Override
	public void idadeA() {
		
		System.out.println("Ele tem 12 anos");
	}
	@Override
	public void somA() {
		
		System.out.println("Ele faz hii riii ");
	}
	@Override
	public void correA() { 
		System.out.println("Corre que é uma cilada Bino!");
		
	}
	@Override
	public void subirArvore() { 
		

}
}
