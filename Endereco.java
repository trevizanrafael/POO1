public class Endereco{
    private int numero;
    private String rua;
    private Cidade cidade = new Cidade();
    
    public Endereco(){
		System.out.println("Construtor de Endereco");		
	}

    public Cidade getCidade(){
        return cidade;
    }

    public void setCidade(Cidade cidade){
        this.cidade=cidade;
    }

    public void setRua(String rua){
        this.rua=rua;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public String getRua(){
        return rua;
    }
    
    public int getNumero(){
        return numero;
    }
}