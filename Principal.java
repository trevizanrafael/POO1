/*
NOME: Rafael Moraes Trevizan 
RA: 2648938
 */
public class Principal{
	public static void main(String args[]){
		Pistolas p1 = new Pistolas();
        Rifles r1 = new Rifles();
        Espingardas e1 = new Espingardas();

        boolean ver = true;
        boolean verLeitura = true;
        while(ver){
        
        String escolhaString;
        int escolhaInt = 0;
        //Cada try catch é para tratatamento de exceção, sendo nativo ou nao
        do{
            System.out.println("======  MENU ARSENAL  ======\n1. Cadastrar Espingarda\n2. Cadastrar Pistola\n3. Cadastrar Rifle\n4. Mostrar dados Espingarda\n5. Mostrar dados Pistola\n6. Mostrar dados Rifle\n7. Sair");
            do{
                escolhaString = Leitura.entDados("Sua escolha:\n");
                verLeitura = true;
                try{
                    escolhaInt = Integer.parseInt(escolhaString);
                } catch(NumberFormatException e){
                    System.out.println("\nDigite apenas numerais.\n");
                    verLeitura = false;
                }
            } while(!verLeitura);
            
            switch (escolhaInt) {
                case 1:
                    try{
                        e1.setNome(Leitura.entDados("Nome da Espingarda:"));
                    }
                    catch(ArmaNomePeqException anpe){
                        anpe.impErro();
                        e1 = (Espingardas) anpe.corNomePeqException(e1);
                    }
                    
                    try{
                        e1.getPessoa().setNome(Leitura.entDados("Nome do Dono:"));//Reflexividade objeto.getPessoa().setNome
                    }
                    catch(PessoaNomePeqException pnpe){
                        pnpe.impErro();
                        e1 = (Espingardas) pnpe.corNomePeqException(e1);
                    }
                    
                    try{
                        e1.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF do dono:")));//Reflexividade objeto.getPessoa().setCpf
                    }
                    catch(CpfNegException cne){
                        cne.impErro();
                        e1 = (Espingardas) cne.corCpfNegException(e1);
                    }
                    catch(NumberFormatException nfe){
                        CpfNegException cneAux = new CpfNegException();
                        cneAux.impErro();
                        e1 = (Espingardas) cneAux.corCpfNegException(e1);
                    }
                    
                    e1.setFabricante(Leitura.entDados("Nome do Fabricante:"));
                    
                    try{
                        e1.setNumeroCanos(Integer.parseInt(Leitura.entDados("Numero de canos da espingarda:")));
                    }
                    catch(CanosNegException ecne){
                        ecne.impErro();
                        e1 = (Espingardas) ecne.corCanosNegException(e1);
                    }
                    catch(NumberFormatException nfe){
                        CanosNegException ecneAux = new CanosNegException();
                        ecneAux.impErro();
                        e1 = (Espingardas) ecneAux.corCanosNegException(e1);
                    }
                    
                    e1.setTipoMunicao(Leitura.entDados("Tipo de municao da espingarda:"));
                    break;
                case 2:
                    try{
                        p1.setNome(Leitura.entDados("Nome da Pistola:"));
                    }
                    catch(ArmaNomePeqException anpe){
                        anpe.impErro();
                        p1 = (Pistolas) anpe.corNomePeqException(p1);
                    }
                    
                    try{
                        p1.getPessoa().setNome(Leitura.entDados("Nome do Dono:"));//Reflexividade objeto.getPessoa().setNome
                    }
                    catch(PessoaNomePeqException pnpe){
                        pnpe.impErro();
                        p1 = (Pistolas) pnpe.corNomePeqException(p1);
                    }
                    
                    try{
                        p1.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF do dono:")));//Reflexividade objeto.getPessoa().setCpf
                    }
                    catch(CpfNegException cne){
                        cne.impErro();
                        p1 = (Pistolas) cne.corCpfNegException(p1);
                    }
                    catch(NumberFormatException nfe){
                        CpfNegException cneAux = new CpfNegException();
                        cneAux.impErro();
                        p1 = (Pistolas) cneAux.corCpfNegException(p1);
                    }
                    
                    p1.setFabricante(Leitura.entDados("Nome do Fabricante:"));
                    
                    p1.setSilenciador(Boolean.parseBoolean(Leitura.entDados("A pistola tem silenciador? (true/false):")));

                    try{
                        p1.setTempoTrocaCartucho(Integer.parseInt(Leitura.entDados("Tempo de troca de cartucho da pistola:")));
                    }
                    catch(TempoNegException tne){
                        tne.impErro();
                        p1 = (Pistolas) tne.corTempoNegException(p1);
                    }
                    catch(NumberFormatException nfe){
                        TempoNegException tneAux = new TempoNegException();
                        tneAux.impErro();
                        p1 = (Pistolas) tneAux.corTempoNegException(p1);
                    }

                    break;
                case 3:
                    try{
                        r1.setNome(Leitura.entDados("Nome do Rifle:"));
                    }
                    catch(ArmaNomePeqException anpe){
                        anpe.impErro();
                        r1 = (Rifles) anpe.corNomePeqException(p1);
                    }
                    
                    try{
                        r1.getPessoa().setNome(Leitura.entDados("Nome do Dono:"));//Reflexividade objeto.getPessoa().setNome
                    }
                    catch(PessoaNomePeqException pnpe){
                        pnpe.impErro();
                        r1 = (Rifles) pnpe.corNomePeqException(r1);
                    }
                    
                    try{
                        r1.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF do dono:")));//Reflexividade objeto.getPessoa().setCpf
                    }
                    catch(CpfNegException cne){
                        cne.impErro();
                        r1 = (Rifles) cne.corCpfNegException(r1);
                    }
                    catch(NumberFormatException nfe){
                        CpfNegException cneAux = new CpfNegException();
                        cneAux.impErro();
                        r1 = (Rifles) cneAux.corCpfNegException(r1);
                    }
                    
                    r1.setFabricante(Leitura.entDados("Nome do Fabricante:"));

                    try{
                        r1.setAlcanceMaximo(Integer.parseInt(Leitura.entDados("Alcance maximo do rifle:")));
                    }
                    catch(AlcanceNegException ane){
                        ane.impErro();
                        r1 = (Rifles) ane.corAlcanceNegException(r1);
                    }
                    catch(NumberFormatException nfe){
                        AlcanceNegException aneAux = new AlcanceNegException();
                        aneAux.impErro();
                        r1 = (Rifles) aneAux.corAlcanceNegException(r1);
                    }

                    try{
                        r1.setTaxaDisparo(Integer.parseInt(Leitura.entDados("Taxa de disparo do rifle:")));
                    }
                    catch(TaxaNegException tne){
                        tne.impErro();
                        r1 = (Rifles) tne.corTaxaNegException(r1);
                    }
                    catch(NumberFormatException nfe){
                        TaxaNegException tneAux = new TaxaNegException();
                        tneAux.impErro();
                        r1 = (Rifles) tneAux.corTaxaNegException(r1);
                    }
                    break;
                case 4:
                    System.out.println("\n======  DADOS DA ESPINGARDA  ======\n");
                    System.out.println("Nome: " + e1.getNome());
                    System.out.println("Dono: " + e1.getPessoa().getNome());
                    System.out.println("CPF do dono: " + e1.getPessoa().getCpf());
                    System.out.println("Fabricante: " + e1.getFabricante());
                    System.out.println("Dono e Fabricante: " + (e1.donoTambemFabricante() ? "Sim" : "Nao"));
                    System.out.println("Numero de canos: " + e1.getNumeroCanos());
                    System.out.println("Tipo de municao: " + e1.getTipoMunicao());
                    System.out.println("\n=====================================\n");
                    break;
                case 5:
                    System.out.println("\n======  DADOS DA PISTOLA  ======\n");
                    System.out.println("Nome: " + p1.getNome());
                    System.out.println("Dono: " + p1.getPessoa().getNome());
                    System.out.println("CPF do dono: " + p1.getPessoa().getCpf());
                    System.out.println("Fabricante: " + p1.getFabricante());
                    System.out.println("Dono e Fabricante: " + (p1.donoTambemFabricante() ? "Sim" : "Nao"));
                    System.out.println("Tem silenciador: " + (p1.getSilenciador() ? "Sim" : "Nao"));
                    System.out.println("Tempo de troca de cartucho: " + p1.getTempoTrocaCartucho() + " segundos");
                    System.out.println("\n=====================================\n");
                    break;
                case 6:
                    System.out.println("\n======  DADOS DO RIFLE  ======\n");
                    System.out.println("Nome: " + r1.getNome());
                    System.out.println("Dono: " + r1.getPessoa().getNome());
                    System.out.println("CPF do dono: " + r1.getPessoa().getCpf());
                    System.out.println("Fabricante: " + r1.getFabricante());
                    System.out.println("Dono e Fabricante: " + (r1.donoTambemFabricante() ? "Sim" : "Nao"));
                    System.out.println("Alcance maximo: " + r1.getAlcanceMaximo() + " metros");
                    System.out.println("Taxa de disparo: " + r1.getTaxaDisparo() + " tiros por minuto");
                    System.out.println("\n=====================================\n");
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    ver = false;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }while(ver);
	}    
}
}
