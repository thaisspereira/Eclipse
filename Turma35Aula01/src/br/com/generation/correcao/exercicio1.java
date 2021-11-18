package br.com.generation.correcao;
import java.util.Scanner; 


public class exercicio1 {
	
	//Thais Pereira 
	// 01/01/21
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
	int dias, meses, anos, resultado;
	Scanner leia1 = new Scanner(System.in);
	System.out.println("Digite o dia que você nasceu:");
	dias = leia1.nextInt();
	
	System.out.println("Digite o mes que você nasceu:");
	meses = leia1.nextInt();
			
	System.out.println("Digite o ano que você nasceu:");
	anos = leia1.nextInt(); 
	
	resultado = dias + (meses *30 )+ ((2021 - anos)* 365);
	
	System.out.println("URUUUL Olha a quantidade de dias vividos:" + resultado);
	leia1.close();
	
	
		
		
	}

}
