/*
NOME: Rafael Moraes Trevizan
RA: 2648938
 */
public class Espingardas extends Armas{
    private int numeroCanos;
    private String tipoMunicao;

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

    public void setNumeroCanos(int numeroCanos){
        this.numeroCanos = numeroCanos;
    }

    public void setTipoMunicao(int tipoMunicao){
        this.tipoMunicao = tipoMunicao;
    }

    public int getNumeroCanos(){
        return this.numeroCanos;
    }

    public String getTipoMunicao(){
        return this.tipoMunicao;
    }
}