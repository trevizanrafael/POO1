/*
NOME: Rafael Moraes Trevizan
RA: 2648938
 */
public class Pistolas extends Armas{
	private String empunhadura;
	private int tempoTrocaCartucho;
	private boolean silenciador;
	
	public Pistolas(){
		this.empunhadura = "";
		this.tempoTrocaCartucho = 0;
		this.silenciador = false;
	}

	public Pistolas(String empunhadura, int tempoTrocaCartucho, boolean silenciador){
		System.out.println("Construtor Sobrecarga 1 de armas");
		this.empunhadura = empunhadura;
		this.tempoTrocaCartucho = tempoTrocaCartucho;
		this.silenciador = silenciador;
	}

	public void setEmpunhadura(String empunhadura){
		this.empunhadura = empunhadura;
	}
	
	public void setTempoTrocaCartucho(int tempoTrocaCartucho){
		this.tempoTrocaCartucho = tempoTrocaCartucho;
	}

	public void setSilenciador(boolean silenciador){
		this.silenciador = silenciador;
	}


	public String getEmpunhadura(){
		return this.empunhadura;
	}

	public int getTempoTrocaCartucho(){
		return this.tempoTrocaCartucho;
	}

	public boolean getSilenciador(){
		return this.silenciador;
	}
}
