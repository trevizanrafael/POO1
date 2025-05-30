public class PessoaNomePeqException extends Exception{
	public void impErro(){
		System.out.println("Digite nomes MAIORES que UM digito!\n");
	}

	public Armas corNomePeqException(Armas p){
		try{
			p.getPessoa().setNome(Leitura.entDados("Nome da pessoa, TEM que ser maior que UMA letra:\n"));
		}
		catch(PessoaNomePeqException pnpe){
			pnpe.impErro();
			p = pnpe.corNomePeqException(p);
		}
		return p;
	}
}