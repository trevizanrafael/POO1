public class TstTratExc{

	public static void main(String arg[]){
		
		Leitura l = Leitura.geraLeitura();
	
		Pessoa p1 = new Pessoa();
		try{
			p1.setCpf(Integer.parseInt(l.entDados("\nCPF...: ")));
			p1.setNome(l.entDados("\nNOME..: "));			
			System.out.println("\nCPF...: " + p1.getCpf());
			System.out.println("NOME..: "   + p1.getNome());			
		}
		
		catch(CpfNegException cne){
			System.out.println("\nEntrou no catch da CpfNegException");
		}
		
		catch(NumberFormatException nfe){
			System.out.println("\nO valor informado deve ser um número");
		}
		
		catch(NomeGrdException |  NomePeqException ERRO){
			String nomeException = ERRO.getClass().getName();
			
			System.out.println("A Exception gerada foi:\n-> "+nomeException+" <-");
		}
		
		finally{
			System.out.println("\nFINALLY: acessou!");			
		}
		
	

	
	}
	
}

// try --> tentar executar o que está no meu bloco
// catch --> pegue o objt de exceção lançado no try
// finally --> lançando ou não um objeto de exceção execute-me	