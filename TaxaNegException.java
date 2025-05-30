public class TaxaNegException extends Exception {
    public void impErro() {
        System.out.println("\nA taxa deve ser MAIOR que ZERO!\n");
    }

    public Rifles corTaxaNegException(Rifles a) {
        try {
            a.setTaxaDisparo(Integer.parseInt(Leitura.entDados("Taxa de disparo, TEM que ser MAIOR que ZERO:\n")));
        } catch (TaxaNegException tne) {
            tne.impErro();
            a = tne.corTaxaNegException(a);
        } catch (NumberFormatException nfe) {
            System.out.println("Entrada inválida! Por favor, insira um número válido.");
            a = corTaxaNegException(a);
        }
        return a;
    }
}