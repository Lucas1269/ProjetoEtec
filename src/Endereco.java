public class Endereco{
	private String ruaAt;
	private String cidadeAt;
	private String estadoAt;


public Endereco(String ruaPar, String cidadePar, String estadoPar){

this.ruaAt = ruaPar;
this.cidadeAt = cidadePar;
this.estadoAt = estadoPar;

}

//Construtor Vazio
public Endereco(){
	
}

//Getters e Setters:
public void setRua(String ruaPar){
this.ruaAt = ruaPar;
}
public void setCidade(String ruaPar){
this.ruaAt = ruaPar;
}
public String getRua(){
return ruaAt;
}
public String getCidade(){
return cidadeAt;
}
public String getEstado(){
return estadoAt;
}
}