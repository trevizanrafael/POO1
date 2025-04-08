
public class TstPes{
  public static void main (String args[]){
  		Pessoa p1 = new Pessoa();
  		p1.setCpf(12);
  		p1.setNome("rafael");		
  
  
  		Pessoa p2=new Pessoa();
  		p2.setCpf(13);
  		p2.setNome("nicolly");	
  
  
  		System.out.println("Endereco de p1:... "+p1);
  		System.out.println("Endereco de p2:... "+p2);
  
  
  		System.out.println("Nome de p1:... "+p1.nome);
  		System.out.println("CPF de p1:... "+p1.cpf);
  		System.out.println("Nome de p2:... "+p2.nome);
  		System.out.println("CPF de p2:... "+p2.cpf);
  
  
  		System.gc();
  		
  	}
}
