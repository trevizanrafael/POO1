public class AnoNegException extends Exception{
	public void impErro(){
		System.out.println("\nO ano deve ser MAIOR ou IGUAL a ZERO!\n");
	}

	public Armas corAnoNegException(Armas a){
		try{
			a.setAno_c(Integer.parseInt(Leitura.entDados("Ano de fabricação, TEM que ser MAIOR ou IGUAL a ZERO:\n")));
		}
		catch(AnoNegException ane){
			ane.impErro();
			a = ane.corAnoNegException(a);
		}
		catch(NumberFormatException nfe){
			System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
			a = corAnoNegException(a);
		}
		return a;
	}
}