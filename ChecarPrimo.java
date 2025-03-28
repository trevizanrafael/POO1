public class ChecarPrimo{
    public static void main(String args[]){
        int primo = Integer.parseInt(args[0]);
        int i;
        boolean v=false;
        for(i=primo/2;i>1;i-=2){
            if(primo%i!=0){
                v = true;
                break;
            }
            v = false;
        }
        if(v){
            System.out.println("E primo");
        } else{
            System.out.println("Nao e primo");}
    }
}