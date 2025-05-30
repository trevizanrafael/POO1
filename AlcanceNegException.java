public class AlcanceNegException extends Exception {
    public void impErro() {
        System.out.println("\nO alcance deve ser MAIOR que ZERO!\n");
    }

    public Rifles corAlcanceNegException(Rifles a) {
        try {
            a.setAlcanceMaximo(Integer.parseInt(Leitura.entDados("Alcance, TEM que ser MAIOR que ZERO:\n")));
        } catch (AlcanceNegException ane) {
            ane.impErro();
            a = ane.corAlcanceNegException(a);
        } catch (NumberFormatException nfe) {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
            a = corAlcanceNegException(a);
        }
        return a;
    }
}