/*
NOME: Rafael Moraes Trevizan 
RA: 2648938
*/

//HERANÇA, a classe filha Rifles herda os atributos e métodos da super-classe Armas
public class Pistolas extends Armas implements FabricadaPeloDono{
	//ENCAPSULAMENTO, atributos não podem ser acessados diretamente de fora da classe
	private int tempoTrocaCartucho;
	private boolean silenciador;
	
	// Método com POLIMORFISMO POR SOBRESCRIÇÃO
	//Além de possuir o conceito de herança, por herdar um método da super-classe
	public String descricao() {
			return "Pistola: arma leve, de fácil manuseio e ideal para combates a curta distância. Possui baixo recuo e alta mobilidade, mas sua precisão e alcance são limitados.";
	}

	public Pistolas(){
		System.out.println("Construtor de pistolas");
		this.tempoTrocaCartucho = 0;
		this.silenciador = false;
	}

    // Construtor com POLIMORFISMO POR SOBRECARGA
	public Pistolas(int tempoTrocaCartucho, boolean silenciador){
		System.out.println("Construtor Sobrecarga 1 de armas");
		this.tempoTrocaCartucho = tempoTrocaCartucho;
		this.silenciador = silenciador;
	}
	
	// ENCAPSULAMENTO com getters e setters
	public void setTempoTrocaCartucho(int tempoTrocaCartucho) throws TempoNegException{
		if(tempoTrocaCartucho >= 0){
			this.tempoTrocaCartucho = tempoTrocaCartucho;
		} else {
			throw new TempoNegException();
		}
	}

	public void setSilenciador(boolean silenciador){
		this.silenciador = silenciador;
	}

	public int getTempoTrocaCartucho(){
		return this.tempoTrocaCartucho;
	}

	public boolean getSilenciador(){
		return this.silenciador;
	}

	//Interface FabricadaPeloDono
    public boolean donoTambemFabricante() {
        return getPessoa() != null && getPessoa().getNome().equalsIgnoreCase(getFabricante());
    }
}
