public class TstArms{
	public static void main(String args[]){
		//Criacao dos objetos
        Armas a1;
        Leitura l;

        //Inicializacao dos objetos
		a1 = new Armas();
        l =  new Leitura();

        //Entrada do nome do objeto
		String nome = l.entDados("Nome da arma:");
		a1.setNome(nome);	

		
		//Entrada do nome do fabricante
		String fabricante = l.entDados("Nome do fabricante da arma:");
		a1.setFabricante(fabricante);
		
		//Entrada do ano de criacao da arma
        boolean ver;
        do{    
            ver = true;
            String ano = l.entDados("Ano de criacao da arma:");
            try{
                a1.setAno_c(Integer.parseInt(ano));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

		//Entrada do numero de balas
        do{    
            ver = true;
            String municao = l.entDados("Numero de balas da arma:");
            try{
                a1.setMunicao(Integer.parseInt(municao));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);


        String rua = l.entDados("Rua da casa da arma:");  
		a1.getLugar().setRua(rua);



        do{
            String numero = l.entDados("Numero da casa da arma:");
            ver = true;
            try{
                a1.getLugar().setNumero(Integer.parseInt(numero));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);


        



		String nome1 = a1.getNome();
		String fabricante1 = a1.getFabricante();
		int municao1 = a1.getMunicao();
		int ano1 = a1.getAno_c();
		String rua1 = a1.getLugar().getRua();
		int num1 = a1.getLugar().getNumero();

		



		System.out.println(nome1+" "+fabricante1+" "+municao1+" "+ano1+"\n"+rua1+" "+num1);
	}
}
