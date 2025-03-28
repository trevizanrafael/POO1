import java.util.Random;

public class JogoDeAdivinhar{
    public static void main(String args[]){
        Random aleatorio = new Random();
        int i = aleatorio.nextInt(4);
        int chute = Integer.parseInt(args[0]);
        if(chute==i){
            System.out.println("Eeeeexato!");
        } else {
            System.out.println("Eeeeerrado!");
        }
    }
}