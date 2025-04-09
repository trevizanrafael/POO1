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
		
		System.out.println(a1.nome+" "+a1.fabricante+" "+a1.ano_c+" "+a1.municao);
		System.out.println(a2.nome+" "+a2.fabricante+" "+a2.ano_c+" "+a2.municao);
		
	}
	
	
	
}
