public class TstArms{
	public static void main(String args[]){
		Armas a1;
		Armas a2;
		
		a1 = new Armas();
		a2 = new Armas();

		a1.setNome("Ak-47");
		a2.setNome("M4-A1");
		
		a1.setFabricante("Russia");
		a2.setFabricante("EUA");
		
		a1.setAno_c(1947);
		a2.setAno_c(1983);
		
		a1.setMunicao(30);
		a2.setMunicao(50);
		

		String nome1 = a1.getNome();
		String fabricante1 = a1.getFabricante();
		int municao1 = a1.getMunicao();
		int ano1 = a1.getAno_c();

		String nome2 = a2.getNome();
		String fabricante2 = a2.getFabricante();
		int municao2 = a2.getMunicao();
		int ano2 = a2.getAno_c();



		System.out.println(nome1+" "+fabricante1+" "+municao1+" "+ano1);
		System.out.println(nome2+" "+fabricante2+" "+municao2+" "+ano2);
		
	}
	
	
	
}
