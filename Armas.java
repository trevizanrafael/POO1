/*
NOME: Rafael Moraes Trevizan
RA: 2648938
 */
public abstract class Armas{
	private Pessoa pessoa;
	private String nome;
	private int municao;
	private int ano_c;
	private String fabricante;
	
	
	public Armas(){
		System.out.println("Construtor de armas");
		nome = "";
		municao = 0;
		ano_c = 0;
		fabricante = "";
		pessoa = new Pessoa();
	}

	public Armas(String nome, int municao, int ano_c, String fabricante){
		System.out.println("Construtor Sobrecarga 1 de armas");
		this.nome = "";
		this.municao = 0;
		this.ano_c = 0;
		this.fabricante = "";
	}

	public Pessoa getPessoa(){
		return pessoa;
	}

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
	
	public void setPessoa(Pessoa pessoa){
		this.pessoa = pessoa;
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
