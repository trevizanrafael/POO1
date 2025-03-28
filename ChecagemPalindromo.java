public class ChecagemPalindromo {
    public static void main(String args[]){
        int tamanho = args[0].length();  
        int i;
        String s = args[0];
        for(i=1;i<tamanho+1;i++){
            if(s.charAt(i-1)!=s.charAt(tamanho-i)){
                System.out.println("Nao e palindromo");
                break;
            }
        if(i==tamanho){
            System.out.println("E palindromo");
        }
        }   
    }
}