import java.io.IOException;

public class TstTratExc{

    public static void main(String arg[]){	
		
		Leitura l = Leitura.geraLeitura();
		Pessoa p1 = new Pessoa();


			try{			
				p1.setCpf(Integer.parseInt(l.entDados("\nCPF...: ")));
				p1.setNome(l.entDados("\nNOME..: "));			
			}
		
			catch(CpfNegException cne){
				cne.impErroCpfNeg();
				p1 = cne.corPesCpfNeg(p1);
				p1.setNome(l.entDados("\nNOME..: "));	
			}
		
			catch(CpfGrdException cge){
				cge.impErroCpfGrd();
				p1 = cge.corPesCpfGrd(p1);
				p1.setNome(l.entDados("\nNOME..: "));
			}
		
			catch(NumberFormatException nfe){
				System.out.println("\nO valor informado deve ser um numero");
			}

		
			finally{
				System.out.println("\nCPF...: " + p1.getCpf());
				System.out.println("NOME..: "   + p1.getNome());						
			}
			

	}

}
