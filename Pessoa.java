public class Pessoa{

	private int cpf = 0;
	private String nome = "";
	
//=====================================++
// THROWS (com "s"): "AVISO"-> "POSSO" lançar um objt do tipo...
// THROW &sem "s"): "ORDEM" -> "LANCE" o objt tal


	public void setCpf(int cpf) throws CpfNegException{
		if(cpf >= 0){
			this.cpf = cpf;
		}
		else{
			throw new CpfNegException();
		}
	}

//=====================================
	public Pessoa(){
		cpf = 0;
		nome = "";
	}
//=====================================	
	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome) throws NomeGrdException, NomePeqException{
		if(nome.length() <= 2){
			throw new NomePeqException();
		}
		if(nome.length() <= 10){
			this.nome = nome;
		}
		else{
			throw new NomeGrdException();
		}
	}


}