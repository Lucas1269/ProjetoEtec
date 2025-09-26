
public class Discente extends Pessoa{
	//Atributos
	private int nota1At;
	private int nota2At;
	private int nota3At;
	private int nota4At;

	public Discente(){
		
	}
	
/*
	public Discente(int nota1Par, int nota2Par, int nota3Par, int nota4Par,Endereco enderecoPar) {
		super(nomeAt, idadeAt, enderecoAt);
		this.nota1At = nota1Par;
		this.nota2At = nota2Par;
		this.nota3At = nota3Par;
		this.nota4At = nota4Par;
	}
*/
	
	//setters:
	public void setNota1(int notaPar) {
		this.nota1At = notaPar;
	}
	public void setNota2(int notaPar) {
		this.nota2At = notaPar;
	}
	public void setNota3(int notaPar) {
		this.nota3At = notaPar;
	}
	public void setNota4(int notaPar) {
		this.nota4At = notaPar;
	}
	
	//getters
	public int getNota1() {
		return nota1At;
	}
	public int getNota2() {
		return nota2At;
	}
	public int getNota3() {
		return nota3At;
	}
	public int getNota4() {
		return nota4At;
	}
	
}