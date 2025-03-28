public class CalculadoraSimples {
    public static void main(String args[]) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        char op = args[1].charAt(0);
        switch (op){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case 'x':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}