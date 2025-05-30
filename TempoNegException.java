public class TempoNegException extends Exception{
	public void impErro(){
		System.out.println("\nO tempo deve ser MAIOR ou IGUAL a ZERO!\n");
	}

	public Pistolas corTempoNegException(Pistolas a){
		try{
			a.setTempoTrocaCartucho(Integer.parseInt(Leitura.entDados("Tempo de troca de cartucho, TEM que ser MAIOR ou IGUAL a ZERO:\n")));
		}
		catch(TempoNegException tne){
			tne.impErro();
			a = tne.corTempoNegException(a);
		}
		catch(NumberFormatException nfe){
			System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
			a = corTempoNegException(a);
		}
		return a;
	}
}