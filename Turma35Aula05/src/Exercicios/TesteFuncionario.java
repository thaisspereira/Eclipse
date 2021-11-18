package Exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome("Thais");
		f.setCargo("Programadora");
		f.setNumeroInscricao(39568);
		f.setFolga("sabados");
		

		System.out.println("Nome da Funcionária: " + f.getNome());
		System.out.println("Cargo na Empresa: " + f.getCargo());
		System.out.println("Inscriçao da Funcionaria : " + f.getNumeroInscricao());
		System.out.println("Dias de Folga: " + f.getFolga());
	}

}
