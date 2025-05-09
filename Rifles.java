/*
NOME: Rafael Moraes Trevizan
RA: 2648938
 */
public class Rifles extends Armas{
  private double alcanceMaximo;
  private boolean possuiMira;
  private String tipoRifle;
  private int taxaDisparo;

  public String descricao(){
      return "Rifle: arma de médio a longo alcance, com boa precisão e alto poder de fogo. É versátil e eficiente em diferentes situações, porém seu recuo e tempo de recarga podem ser maiores.";
  }

  public Rifles(){
    this.alcanceMaximo = 0;
    this.possuiMira = false;
    this.tipoRifle = "";
    this.taxaDisparo = 0;
  }

  public Rifles(double alcanceMaximo, boolean possuiMira, String tipoRifle, int taxaDisparo){
    this.alcanceMaximo = alcanceMaximo;
    this.possuiMira = possuiMira;
    this.tipoRifle = tipoRifle;
    this.taxaDisparo = taxaDisparo;
  }

  public void setAlcanceMaximo(double alcanceMaximo){
    this.alcanceMaximo = alcanceMaximo;
  }
  public void setPossuiMira(boolean possuiMira){
    this.possuiMira = possuiMira;
  }
  public void setTipoRifle(String tipoRifle){
    this.tipoRifle = tipoRifle;
  }
  public void setTaxaDisparo(int taxaDisparo){
    this.taxaDisparo = taxaDisparo;
  }
  

  public double getAlcanceMaximo(){
    return this.alcanceMaximo;
  }
  public boolean getPossuiMira(){
    return this.possuiMira;
  }
  public String getTipoRifle(){
    return this.tipoRifle;
  }
  public int getTaxaDisparo(){
    return this.taxaDisparo;
  }
}
