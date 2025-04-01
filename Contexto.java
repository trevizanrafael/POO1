public class Contexto{
    
	static int a=10,b=5;

	public static void main (String args[]){


                System.out.println("Soma:\n"+soma()+"\nSubtracao:\n"+subtracao()+"\nMultiplicacao:\n"+multiplicacao

()+"\nDivisao:\n"+divisao());


	}

        public static int soma(){
            return a+b;
        }

        public static int subtracao(){
            return a-b;
        }

        public static int multiplicacao(){
            return a*b;
        }

        public static int divisao(){
            return a/b;
        }


} 
