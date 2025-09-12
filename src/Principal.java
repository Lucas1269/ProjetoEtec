
public class Principal {

	public static void main(String[] args) {
		// Objeto = Instância da Classe
		
		Pessoa Victor = new Pessoa();
		
		Pessoa Luiz = new Pessoa("Luiz", 15);
		
		Pessoa Rafael = new Pessoa();
		Luiz.setNome("Luiz");
		Rafael.setNome("Rafael");
		Rafael.setIdade(16);
		
		System.out.println(Victor.getNome()); // sysout + ctrl + space
		System.out.println(Luiz.getNome());
		System.out.println(Luiz.getNome());
		System.out.println(Luiz.getIdade());
		System.out.println(Victor.getIdade());
		System.out.println(Victor.getIdade());
		
		//input = rafael.getNome();
		
	}

}
