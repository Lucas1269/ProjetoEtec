
public class Principal {

	public static void main(String[] args) {
		// Criar um objeto = instanciar a classe
		Endereco endereco_1 = new Endereco("RuaUm,", "Assis", "SP"); //Par�metro Construtor
		Endereco endereco_2 = new Endereco(); //Par�metro Construtor
		
		System.out.println(endereco_1.getRua()); //Pegar Informa��o
		System.out.println(endereco_1.getCidade());
		System.out.println(endereco_1.getEstado());
		
		endereco_2.setRua("Rua Luiz");
		endereco_2.setCidade("Londrina");
		
		System.out.println(endereco_2.getRua());
		System.out.println(endereco_2.getCidade());
	}
}