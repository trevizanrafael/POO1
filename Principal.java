/*
NOME: Rafael Moraes Trevizan
RA: 2648938
 */
public class Principal{
	public static void main(String args[]){
		boolean ver;
        Pistolas p1 = new Pistolas();
        
        String nomep1 = Leitura.entDados("Qual o nome da pistola?");
        p1.setNome(nomep1);
        
        do{
            String municaop1 = Leitura.entDados("Numero de balas da pistola:");
            ver = true;
            try{
                p1.setMunicao(Integer.parseInt(municaop1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        do{
            String anop1 = Leitura.entDados("Ano que a pistola foi criada:");
            ver = true;
            try{
                p1.setAno_c(Integer.parseInt(anop1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);
        
        String fabp1 = Leitura.entDados("Fabricante da pistola:");
        p1.setFabricante(fabp1);

        //

        String empp1 = Leitura.entDados("Tipo de empunhadora da pistola:");
        p1.setEmpunhadura(empp1);

        do{
            String trocap1 = Leitura.entDados("Tempo de troca de cartucho da pistola:");
            ver = true;
            try{
                p1.setTempoTrocaCartucho(Integer.parseInt(trocap1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);
        
        String silp1 = Leitura.entDados("A pistola tem silenciador? TRUE para sim, e FALSE para nao.");
        p1.setSilenciador(Boolean.parseBoolean(silp1));

        String prop1 = Leitura.entDados("Qual o nome do proprietário:");
        p1.getPessoa().setNome(prop1);

        do{
            String cpfp1 = Leitura.entDados("CPF do proprietário:");
            ver = true;
            try{
                p1.getPessoa().setCpf(Integer.parseInt(cpfp1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        System.out.println("\n\n");
        System.out.println("\n=== INFORMAÇÕES DA PISTOLA ===");
        System.out.println("Nome da Pistola: " + p1.getNome());
        System.out.println("Número de balas: " + p1.getMunicao());
        System.out.println("Ano de criação: " + p1.getAno_c());
        System.out.println("Fabricante: " + p1.getFabricante());
        System.out.println("Tipo de empunhadura: " + p1.getEmpunhadura());
        System.out.println("Tempo de troca do cartucho: " + p1.getTempoTrocaCartucho() + " segundos");
        System.out.println("Possui silenciador: " + (p1.getSilenciador()));
        System.out.println("Proprietário: " + p1.getPessoa().getNome());
        System.out.println("Possui silenciador: " + (p1.getPessoa().getCpf()));
        System.out.print(("\n\n\n\n\n"));


        Rifles r1 = new Rifles();
        
        String nomer1 = Leitura.entDados("Qual o nome do rifle?");
        r1.setNome(nomer1);
        
        do{
            String municaor1 = Leitura.entDados("Numero de balas do rifle:");
            ver = true;
            try{
                r1.setMunicao(Integer.parseInt(municaor1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        do{
            String anor1 = Leitura.entDados("Ano que o rifle foi criado:");
            ver = true;
            try{
                r1.setAno_c(Integer.parseInt(anor1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);
        
        String fabr1 = Leitura.entDados("Fabricante do rifle:");
        r1.setFabricante(fabr1);

        //

        do{
            String alcr1 = Leitura.entDados("Numero do alcance do rifle:");
            ver = true;
            try{
                r1.setAlcanceMaximo(Double.parseDouble(alcr1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String mirar1 = Leitura.entDados("O rifle possui mira? TRUE para sim e FALSE para nao");
        r1.setPossuiMira(Boolean.parseBoolean(mirar1));

        String tipor1 = Leitura.entDados("Qual o tipo do rifle:");
        r1.setTipoRifle(tipor1);

        do{
            String taxar1 = Leitura.entDados("Numero da taxa de disparo do rifle:");
            ver = true;
            try{
                r1.setTaxaDisparo(Integer.parseInt(taxar1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String pror1 = Leitura.entDados("Qual o nome do proprietário:");
        r1.getPessoa().setNome(pror1);

        do{
            String cpfr1 = Leitura.entDados("CPF do proprietário:");
            ver = true;
            try{
                r1.getPessoa().setCpf(Integer.parseInt(cpfr1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        System.out.print("\n\n\n");
        System.out.println("\n=== INFORMAÇÕES DO RIFLE ===");
        System.out.println("Nome: " + r1.getNome());
        System.out.println("Número de balas: " + r1.getMunicao());
        System.out.println("Ano de criação: " + r1.getAno_c());
        System.out.println("Fabricante: " + r1.getFabricante());
        System.out.println("Alcance máximo: " + r1.getAlcanceMaximo() + " metros");
        System.out.println("Possui mira: " + r1.getPossuiMira());
        System.out.println("Tipo de rifle: " + r1.getTipoRifle());
        System.out.println("Taxa de disparo: " + r1.getTaxaDisparo() + " tiros/minuto");
        System.out.println("Proprietário: " + r1.getPessoa().getNome());
        System.out.println("Possui silenciador: " + (r1.getPessoa().getCpf()));
        System.out.println("\n\n\n\n");


        Espingardas e1 = new Espingardas();
        
        String nomee1 = Leitura.entDados("Qual o nome da espingarda?");
        e1.setNome(nomee1);
        
        do{
            String municaoe1 = Leitura.entDados("Numero de balas da espingarda:");
            ver = true;
            try{
                e1.setMunicao(Integer.parseInt(municaoe1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);
        
        do{
            String anoe1 = Leitura.entDados("Ano que a espingarda foi criada:");
            ver = true;
            try{
                e1.setAno_c(Integer.parseInt(anoe1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);
        
        String fabe1 = Leitura.entDados("Fabricante da espingarda:");
        e1.setFabricante(fabe1);

        String proe1 = Leitura.entDados("Qual o nome do proprietário:");
        e1.getPessoa().setNome(proe1);

        do{
            String cpfe1 = Leitura.entDados("CPF do proprietário:");
            ver = true;
            try{
                e1.getPessoa().setCpf(Integer.parseInt(cpfe1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        do{
            String canoe1 = Leitura.entDados("Numero de canos de p1:");
            ver = true;
            try{
                e1.setNumeroCanos(Integer.parseInt(canoe1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String tipoe1 = Leitura.entDados("Qual o tipo da espingarda?:");
        e1.getPessoa().setNome(tipoe1);


        System.out.print("\n\n\n");
        System.out.println("\n=== INFORMAÇÕES DA ESPINGARDA ===");
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Número de balas: " + e1.getMunicao());
        System.out.println("Ano de criação: " + e1.getAno_c());
        System.out.println("Fabricante: " + e1.getFabricante());
        System.out.println("Tipo de Munição: " + e1.getTipoMunicao());
        System.out.println("Numero de canos: " + e1.getNumeroCanos() + " canos");
        System.out.println("Proprietário: " + e1.getPessoa().getNome());
        System.out.println("Possui silenciador: " + (e1.getPessoa().getCpf()));
        System.out.println("\n\n\n\n");
	}
}
