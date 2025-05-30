public class ArmaNomePeqException extends Exception{
	public void impErro(){
		System.out.println("Digite nomes MAIORES que UM digito!\n");
	}
	
	public Armas corNomePeqException(Armas a){
		try{
            a.setNome(Leitura.entDados("Nome da espingarda, TEM que ser maior que UMA letra:\n"));
        }
		catch(ArmaNomePeqException anpe){
			anpe.impErro();
			a = anpe.corNomePeqException(a);
		}
		return a;
	}	
}