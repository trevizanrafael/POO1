public class Armas{
	
	private String nome = "";
	
	private int municao = 0;
	
	private int ano_c = 0;
	
	private String fabricante = "";
	


	
	
	
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
		if(municao>0){
		
			this.municao=municao;
	
		} else {
			System.out.println("ERRO NO CADASTRO DE MUNICAO");
		}
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
