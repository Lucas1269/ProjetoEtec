
public class Pessoa {
	//abaixo da classe atributo
	private String nomeAt;
	private int idadeAt;
	private Endereco  enderecoAt;

//Construtor	
public Pessoa() {
	
}

public Pessoa(String nomePar, int idadePar, Endereco ende) {
	this.nomeAt = nomePar;
	this.idadeAt = idadePar;
	this.enderecoAt = ende;
}
//Getters
public String getNome() { 
	return nomeAt.toUpperCase(); // toUpperCase() MÈtodo
}
public int getIdade() {
	return idadeAt;
}
public Endereco getEndereco() {
	return enderecoAt;
}
// Setters
public void setNome(String nomePar) {
	this.nomeAt = nomePar.toUpperCase(); // TudoMai√∫scula
}
public void setIdade(int idadePar) {
	this.idadeAt = idadePar;
}
public void setEndereco (Endereco enderecoPar) {
	this.enderecoAt = enderecoPar;
}
}