public class CpfNegException extends Exception{
	public void impErro(){
		System.out.println("\nO CPF deve ser DIGITOS e MAIOR que ZERO!\n");
	}

	public Armas corCpfNegException(Armas p){
		try{
			p.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF da pessoa, TEM que ser MAIOR que ZERO:\n")));
		}
		catch(CpfNegException cne){
			cne.impErro();
			p = cne.corCpfNegException(p);
		}
		catch(NumberFormatException nfe){
			System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
			p = corCpfNegException(p);
		}
		return p;
	}
}