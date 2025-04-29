public class Armas{
	
	private String nome;
	private int municao;
	private int ano_c;
	private String fabricante;
	private Endereco lugar;
	
	
	public Armas(){
		System.out.println("Construtor de armas");
		nome = "";
		municao = 0;
		ano_c = 0;
		fabricante = "";
		lugar = new Endereco();
	}

	public Armas(String nome, int municao, int ano_c, String fabricante, Endereco lugar){
		System.out.println("Construtor Sobrecarga 1 de armas");
		this.nome = "";
		this.municao = 0;
		this.ano_c = 0;
		this.fabricante = "";
		this.lugar = new Endereco();
	}


	public void impDados(){
		System.out.println("Metodo default");
	}


	public void impDados(int sob1){
		System.out.println("Metodo sobrecarregado 1");
		System.out.println(sob1*50);
	}


	public void impDados(String sob2){
		System.out.println("Metodo sobrecarregado 2");
	}

	
	public Endereco getLugar(){
		return lugar;
	}

	public void setLugar(Endereco lugar){
		this.lugar=lugar;
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
