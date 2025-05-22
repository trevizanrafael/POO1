public class CpfNegException extends Exception{
	
		Leitura l = Leitura.geraLeitura();
	
		public void impErroCpfNeg(){
			System.out.println("CPF deve ser positivo!");
		}
		
		public Pessoa corPesCpfNeg(Pessoa pes){
			
			try{
				pes.setCpf(Integer.parseInt(l.entDados("\nNEGATIVO- NOVO CPF: ")));
			}
		
			catch(CpfNegException cne){
				cne.impErroCpfNeg();
				pes = cne.corPesCpfNeg(pes);
			}
		
			catch(CpfGrdException cge){
				cge.impErroCpfGrd();
				pes = cge.corPesCpfGrd(pes);
			}
		
			catch(NumberFormatException nfe){
				System.out.println("\nO valor informado deve ser um numero");
				pes = corPesCpfNeg(pes);
			}
			return pes;
			
		}
}