/*
NOME: Rafael Moraes Trevizan
RA: 2648938 
 */
public class Pessoa{
	private int cpf;
	private String nome;

	public Pessoa(){
		System.out.println("Construtor de pessoas");
		cpf = 0;
		nome = "";
	}
	
	public Pessoa(int cpf, String nome){
		this.cpf   = cpf;
		this.nome  = nome;
	}

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}
	

	public void setCpf(int cpf) throws CpfNegException{
		if(cpf >= 0){
			this.cpf = cpf;
		} else {
			throw new CpfNegException();
		}
	}

	public void setNome(String nome) throws PessoaNomePeqException{
		if(nome.length() > 1){
			this.nome = nome;
		} else {
			throw new PessoaNomePeqException();
		}
	}
}