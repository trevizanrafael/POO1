public class CanosNegException extends Exception {
    public void impErro() {
        System.out.println("\nA quantidade de canos deve ser DIGITOS e MAIOR que ZERO!\n");
    }

    public Espingardas corCanosNegException(Espingardas a) {
        try {
            a.setNumeroCanos(Integer.parseInt(Leitura.entDados("Quantidade de canos, TEM que ser MAIOR que ZERO:\n")));
        } catch (CanosNegException cne) {
            cne.impErro();
            a = cne.corCanosNegException(a);
        } catch (NumberFormatException nfe) {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
            a = corCanosNegException(a);
        }
        return a;
    }
}