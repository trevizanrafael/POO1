public class Cidade{
	private int codCid;
	private String nomeCid;
	private String ufCid;
	
	public Cidade(){
		System.out.println("Construtor de Cidades");
		
	}

	public void setCodCid(int codCid){
		if(codCid>0){
			this.codCid=codCid;
		} else {
			System.out.println("ERRO NO CADASTRO DE CEP");
		}
	}
	
	public void setNomeCid(String nomeCid){
		this.nomeCid=nomeCid;
	}
	
	public void setUfCid(String ufCid){
		this.ufCid=ufCid;
	}

	public int getCodCid(){
		return codCid;
	}
	
	public String getNomeCid(){
		return nomeCid;
	}
	
	public String getUfCid(){
		return ufCid;
	}
}