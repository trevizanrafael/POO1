/*
NOME: Rafael Moraes Trevizan 
RA: 2648938
*/
public class Pistolas extends Armas{
	private int tempoTrocaCartucho;
	private boolean silenciador;
	
	public String descricao() {
			return "Pistola: arma leve, de fácil manuseio e ideal para combates a curta distância. Possui baixo recuo e alta mobilidade, mas sua precisão e alcance são limitados.";
	}

	public Pistolas(){
		System.out.println("Construtor de pistolas");
		this.tempoTrocaCartucho = 0;
		this.silenciador = false;
	}

	public Pistolas(int tempoTrocaCartucho, boolean silenciador){
		System.out.println("Construtor Sobrecarga 1 de armas");
		this.tempoTrocaCartucho = tempoTrocaCartucho;
		this.silenciador = silenciador;
	}
	
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
}
