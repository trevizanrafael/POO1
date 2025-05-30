/*
NOME: Rafael Moraes Trevizan
RA: 2648938
*/ 

//HERANÇA, a classe filha Rifles herda os atributos e métodos da super-classe Armas
public class Espingardas extends Armas implements FabricadaPeloDono{
    //ENCAPSULAMENTO, atributos não podem ser acessados diretamente de fora da classe
    private int numeroCanos;
    private String tipoMunicao;

    // Método com POLIMORFISMO POR SOBRESCRIÇÃO
    //Além de possuir o conceito de herança, por herdar um método da super-classe
    public String descricao(){
        return "Espingarda: arma de alto impacto em curtas distâncias, capaz de causar grande dano com tiros de dispersão. Ineficiente a longa distância, mas devastadora em ambientes fechados.";
    }

    public Espingardas(){
        System.out.println("Construtor de espingardas");
        numeroCanos = 0;
        tipoMunicao = "";
    }

    // Construtor com POLIMORFISMO POR SOBRECARGA
    public Espingardas(int numeroCanos, String tipoMunicao){
        System.out.println("Construtor de espingardas");
        this.numeroCanos = numeroCanos;
        this.tipoMunicao = tipoMunicao;
    }

    // ENCAPSULAMENTO com getters e setters
    public void setNumeroCanos(int numeroCanos) throws CanosNegException{
        if(numeroCanos > 0){
            this.numeroCanos = numeroCanos;
        } else {
            throw new CanosNegException();
        }
    }

    public void setTipoMunicao(String tipoMunicao){
        this.tipoMunicao = tipoMunicao;
    }

    public int getNumeroCanos(){
        return this.numeroCanos;
    }

    public String getTipoMunicao(){
        return this.tipoMunicao;
    }

    //Interface FabricadaPeloDono
    public boolean donoTambemFabricante() {
        return getPessoa() != null && getPessoa().getNome().equalsIgnoreCase(getFabricante());
    }
}