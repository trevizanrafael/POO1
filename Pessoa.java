public class Pessoa{
	int cpf = 0;
	String nome = "";


	public static void main (String args[]){
		Pessoa p1 = new Pessoa();
		p1.entDados(23,"Zezo");
		p1.saidaDados();

		Pessoa p2=new Pessoa();
		p2.entDados(82,"Adalberto");
		p2.saidaDados();
		
	}

	public void entDados(int a, String b){
		cpf = a;
		nome = b;
	}

	public void saidaDados(){
	System.out.println("CPF:... "+cpf);
	System.out.println("Nome:... "+nome);	
	}
}
