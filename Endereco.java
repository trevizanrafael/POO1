public class Endereco{
    private int numero;
    private String rua;
    
    public void setRua(String rua){
        this.rua=rua;
    }
    
    public void setRua(int numero){
        this.numero=numero;
    }
    
    public String getRua(){
        return rua;
    }
    
    public int getNumero(){
        return numero;
    }
}
