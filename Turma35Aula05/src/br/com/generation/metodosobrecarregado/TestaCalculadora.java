package br.com.generation.metodosobrecarregado;

public class TestaCalculadora {

	
	public static void main(String[] args) {
		
	}
		public int soma(int numero1, int numero2) {
			return numero1 + numero2;
			
			MinhaCalculadora calcRetorno = new MinhaCalculadora();
			
			//somando dois inteiros 
			System.out.println("Somando dois numeros: " + calcRetorno.soma(25, 63));
	

}
}
