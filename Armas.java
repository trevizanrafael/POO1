public class Armas{
	String nome = "";
	int municao = 0;
	int ano_c = 0;
	String fabricante = "";
	
	
	public int getMunicao(){
		return municao;
	}
	public int getAno_c(){
		return ano_c;
	}
	public String getNome(){
		return nome;
	}
	public String getFabricante(){
		return fabricante;
	}
	
	public void setMunicao(int municao){
		this.municao=municao;
	}
	public void setAno_c(int ano_c){
		this.ano_c=ano_c;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setFabricante(String fabricante){
		this.fabricante=fabricante;
	}
	
}
