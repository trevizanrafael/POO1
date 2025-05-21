/*
NOME: Rafael Moraes Trevizan
RA: 2648938
*/ 
public class Espingardas extends Armas{
    private int numeroCanos;
    private String tipoMunicao;

    public String descricao(){
        return "Espingarda: arma de alto impacto em curtas distâncias, capaz de causar grande dano com tiros de dispersão. Ineficiente a longa distância, mas devastadora em ambientes fechados.";
    }

    public Espingardas(){
        System.out.println("Construtor de espingardas");
        numeroCanos = 0;
        tipoMunicao = "";
    }

    public Espingardas(int numeroCanos, String tipoMunicao){
        System.out.println("Construtor de espingardas");
        this.numeroCanos = numeroCanos;
        this.tipoMunicao = tipoMunicao;
    }

    public void setNumeroCanos(int numeroCanos) throws CanosNegException{
        if(numeroCanos >= 0){
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
}