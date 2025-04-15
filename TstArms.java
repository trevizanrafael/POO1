public class TstArms{
	public static void main(String args[]){
		Armas a1;
		Armas a2;
		/*Leitura l = new Leitura();
		String valor = l.entDados("Valor 1:");
		System.out.println(valor);*/
		//Assim que faz leitura pelo teclado


		Leitura l = new Leitura();

		a1 = new Armas();
		a2 = new Armas();

		a1.setNome("Ak-47");
		String nome2 = l.entDados("Nome da arma 2:");
		a2.setNome(nome2);	

		
		a1.setFabricante("Russia");
		String fab2 = l.entDados("Nome do fabricante da arma 2:");
		a2.setFabricante(fab2);
		
		a1.setAno_c(1947);
		String ano2 = l.entDados("Ano de criacao da arma 2:");
		a2.setAno_c(Integer.parseInt(ano2));
		
		a1.setMunicao(30);
		String mun2 = l.entDados("Numero de balas da arma 2:");
		a2.setMunicao(Integer.parseInt(mun2));
		

		a1.getLugar().setNumero(123);
		a1.getLugar().setRua("Privet Privet");

		a2.getLugar().setNumero(321);
		a2.getLugar().setRua("Washington Street");

		String nome1 = a1.getNome();
		String fabricante1 = a1.getFabricante();
		int municao1 = a1.getMunicao();
		int ano1 = a1.getAno_c();
		String rua1 = a1.getLugar().getRua();
		int num1 = a1.getLugar().getNumero();

		//String nome2 = a2.getNome();
		String fabricante2 = a2.getFabricante();
		int municao2 = a2.getMunicao();
		//int ano2 = a2.getAno_c();
        	String rua2 = a2.getLugar().getRua();
		int num2 = a2.getLugar().getNumero();



		System.out.println(nome1+" "+fabricante1+" "+municao1+" "+ano1+"\n"+rua1+" "+num1);
		System.out.println(nome2+" "+fabricante2+" "+municao2+" "+ano2+"\n"+rua2+" "+num2);
	}
}
