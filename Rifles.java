/*
NOME: Rafael Moraes Trevizan 
RA: 2648938
*/

//HERANÇA, a classe filha Rifles herda os atributos e métodos da super-classe Armas
public class Rifles extends Armas{
  //ENCAPSULAMENTO, atributos não podem ser acessados diretamente de fora da classe
  private double alcanceMaximo;
  private int taxaDisparo;

  // Método com POLIMORFISMO POR SOBRESCRIÇÃO
  //Além de possuir o conceito de herança, por herdar um método da super-classe
  public String descricao(){
    return "Rifle: arma de médio a longo alcance, com boa precisão e alto poder de fogo. É versátil e eficiente em diferentes situações, porém seu recuo e tempo de recarga podem ser maiores.";
  }

  public Rifles(){
    System.out.println("Construtor de rifles");
    this.alcanceMaximo = 0;
    this.taxaDisparo = 0;
  }


  // Construtor com POLIMORFISMO POR SOBRECARGA
  public Rifles(double alcanceMaximo, int taxaDisparo){
    this.alcanceMaximo = alcanceMaximo;
    this.taxaDisparo = taxaDisparo;
  }


  // ENCAPSULAMENTO garantido com getters e setters
  public void setAlcanceMaximo(double alcanceMaximo) throws AlcanceNegException{
    if(alcanceMaximo >= 0){
      this.alcanceMaximo = alcanceMaximo;
    } else {
      throw new AlcanceNegException();
    }
  }
  public void setTaxaDisparo(int taxaDisparo) throws TaxaNegException{
    if(taxaDisparo >= 0){
      this.taxaDisparo = taxaDisparo;
    } else {
      throw new TaxaNegException();
    }
  }
  

  public double getAlcanceMaximo(){
    return this.alcanceMaximo;
  }
  public int getTaxaDisparo(){
    return this.taxaDisparo;
  }
}
