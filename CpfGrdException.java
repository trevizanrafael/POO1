public class CpfGrdException extends Exception{
	
	Leitura l = Leitura.geraLeitura();
	
		public void impErroCpfGrd(){
			System.out.println("CPF deve ter menos de 10 numeros!");
		}
		
	public Pessoa corPesCpfGrd(Pessoa pes){
		
		try{
			pes.setCpf(Integer.parseInt(l.entDados("\nGRANDE- NOVO CPF: ")));
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
			pes = corPesCpfGrd(pes);
		}
		return pes;
		
	}
}