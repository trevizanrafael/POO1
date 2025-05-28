import java.util.ArrayList;
import java.util.List;
//
public class TstCollect{

	private static Leitura l = new Leitura();
	private static Pessoa p1 = new Pessoa();
	
	private static List<Pessoa> bdPes = new ArrayList<Pessoa>();
	

	public static void main(String arg[]){
		int escolha;
		do{
			escolha = Integer.parseInt(l.entDados("\n1 - Adicionar Pessoa\n2 - Remover Pessoa por Indice\n3 - Consultar Pessoa por CPF\n4 - Editar Nome de Pessoa por CPF\n0 - Sair\n\nEscolha: \n"));
			switch (escolha){
				case 1:
					adicionarPessoa(p1);
					break;
				case 2:
					removerPessoaporIndice();
					break;
				case 3:
					consultarPessoaporCpf();
					break;
				case 4:	
					editarNomePessoa(p1);
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
					break;
			}
		} while(escolha != 0);
	}

	public static void adicionarPessoa(Pessoa p) {
		p = new Pessoa();
    	p.setCpf(Integer.parseInt(l.entDados("\nCPF...: ")));
    	p.setNome(l.entDados("NOME..:"));
		bdPes.add(p);
	}

	public static void removerPessoaporIndice(){
	    int i = Integer.parseInt(l.entDados("\nIndice a ser apagado...: "));
	    bdPes.remove(i);
	}
	
	public static void consultarPessoaporCpf(){
	    int cpf = Integer.parseInt(l.entDados("\nCPF a ser consultado...: "));
	    for(int i = 0; i < bdPes.size() ; i++){
	        if(cpf == bdPes.get(i).getCpf()){
	            System.out.println(
				"CPF...: " + bdPes.get(i).getCpf()
				+" - "+
				"NOME..: " + bdPes.get(i).getNome()
				+ " - "+
				"INDICE..: " + i
			);
	        }
	    }
	}
	
	public static void editarNomePessoa(Pessoa p){
	    int cpf = Integer.parseInt(l.entDados("\nCPF a ser editado...: "));
	    for(int i = 0; i < bdPes.size(); i++){
	        if(cpf == bdPes.get(i).getCpf()){
	            p = bdPes.get(i);
	            p.setNome(l.entDados("Novo nome:  "));
	        }
	    }
	}
}