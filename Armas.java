/*
NOME: Rafael Moraes Trevizan
RA: 2648938
 */
public abstract class Armas{ 
	private Pessoa pessoa;
	private String nome;
	private int ano_c;
	private String fabricante;
	
	public abstract String descricao();

	public Armas(){
		System.out.println("Construtor de armas");
		nome = "";
		ano_c = 0;
		fabricante = "";
		pessoa = new Pessoa();
	}

	public Armas(String nome,  int ano_c, String fabricante, Pessoa pessoa){
		System.out.println("Construtor Sobrecarga 1 de armas");
		this.nome = nome;
		this.ano_c = ano_c;
		this.fabricante = fabricante;
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa(){
		return pessoa;
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
	
	public void setAno_c(int ano_c) throws AnoNegException{
		if(ano_c >= 0){
			this.ano_c=ano_c;
		} else {
			throw new AnoNegException();
		}
	}
	
	public void setNome(String nome) throws ArmaNomePeqException{
		if(nome.length() > 1){
			this.nome=nome;
		} else {
			throw new ArmaNomePeqException();
		}
	}
	
	public void setFabricante(String fabricante){
		this.fabricante=fabricante;
	}
}
