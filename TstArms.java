public class TstArms{
	public static void main(String args[]){
		/*
        
        //Criacao dos objetos
        Armas a1;

        //Inicializacao dos objetos
		a1 = new Armas();

        //Entrada do nome do objeto
		String nome = Leitura.entDados("Nome da arma:");
		a1.setNome(nome);	

		
		//Entrada do nome do fabricante
		String fabricante = Leitura.entDados("Nome do fabricante da arma:");
		a1.setFabricante(fabricante);
		
		//Entrada do ano de criacao da arma
        boolean ver;
        do{    
            ver = true;
            String ano = Leitura.entDados("Ano de criacao da arma:");
            try{
                a1.setAno_c(Integer.parseInt(ano));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

		//Entrada do numero de balas
        do{    
            ver = true;
            String municao = Leitura.entDados("Numero de balas da arma:");
            try{
                a1.setMunicao(Integer.parseInt(municao));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        do{
            String codCid = Leitura.entDados("CEP da cidade que esta a arma:");
            ver = true;
            try{
                a1.getLugar().getCidade().setCodCid(Integer.parseInt(codCid));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String nomeCid = Leitura.entDados("Cidade que esta a arma:");
        a1.getLugar().getCidade().setNomeCid(nomeCid);

        String nomeUF = Leitura.entDados("Estado que esta a arma:");
        a1.getLugar().getCidade().setUfCid(nomeUF);



        String rua = Leitura.entDados("Rua da casa da arma:");  
		a1.getLugar().setRua(rua);

        do{
            String numero = Leitura.entDados("Numero da casa da arma:");
            ver = true;
            try{
                a1.getLugar().setNumero(Integer.parseInt(numero));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String nome1 = a1.getNome();
		String fabricante1 = a1.getFabricante();
		int municao1 = a1.getMunicao();
		int ano1 = a1.getAno_c();
		String rua1 = a1.getLugar().getRua();
		int num1 = a1.getLugar().getNumero();
        int cep = a1.getLugar().getCidade().getCodCid();
        String nomcid = a1.getLugar().getCidade().getNomeCid();
        String estcid = a1.getLugar().getCidade().getUfCid();

		



		System.out.println(nome1+" "+fabricante1+" "+municao1+" "+ano1+"\n"+rua1+" "+num1+"\n"+cep+" "+nomcid+" "+estcid);

        */
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

        String cidadep1 = Leitura.entDados("Qual o nome da cidade que esta a pistola:");
        p1.getLugar().getCidade().setNomeCid(cidadep1);

        do{
            String codCidp1 = Leitura.entDados("CEP da cidade da pistola:");
            ver = true;
            try{
                p1.getLugar().getCidade().setCodCid(Integer.parseInt(codCidp1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String ufp1 = Leitura.entDados("Qual o estado da pistola");
        p1.getLugar().getCidade().setUfCid(ufp1);

        String ruap1 = Leitura.entDados("Rua da pistola:");
        p1.getLugar().setRua(ruap1);

        do{
            String numCasap1 = Leitura.entDados("Numero da casa da pistola:");
            ver = true;
            try{
                p1.getLugar().setNumero(Integer.parseInt(numCasap1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

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


        System.out.println("\n\n");
        System.out.println("\n=== INFORMAÇÕES DA PISTOLA ===");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Número de balas: " + p1.getMunicao());
        System.out.println("Ano de criação: " + p1.getAno_c());
        System.out.println("Fabricante: " + p1.getFabricante());
        System.out.println("Cidade: " + p1.getLugar().getCidade().getNomeCid());
        System.out.println("CEP da cidade: " + p1.getLugar().getCidade().getCodCid());
        System.out.println("Estado: " + p1.getLugar().getCidade().getUfCid());
        System.out.println("Rua: " + p1.getLugar().getRua());
        System.out.println("Número da casa: " + p1.getLugar().getNumero());
        System.out.println("Tipo de empunhadura: " + p1.getEmpunhadura());
        System.out.println("Tempo de troca do cartucho: " + p1.getTempoTrocaCartucho() + " segundos");
        System.out.println("Possui silenciador: " + (p1.getSilenciador()));
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

        String cidader1 = Leitura.entDados("Qual o nome da cidade que esta o rifle:");
        r1.getLugar().getCidade().setNomeCid(cidader1);

        do{
            String codCidr1 = Leitura.entDados("CEP da cidade do rifle:");
            ver = true;
            try{
                r1.getLugar().getCidade().setCodCid(Integer.parseInt(codCidr1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        String ufr1 = Leitura.entDados("Qual o estado do rifle");
        r1.getLugar().getCidade().setUfCid(ufr1);

        String ruar1 = Leitura.entDados("Rua do rifle:");
        r1.getLugar().setRua(ruar1);

        do{
            String numCasar1 = Leitura.entDados("Numero da casa do rifle:");
            ver = true;
            try{
                r1.getLugar().setNumero(Integer.parseInt(numCasar1));
            } catch(NumberFormatException e){
                System.out.println("Digite apenas numerais.");
                ver = false;
            }
        } while(!ver);

        //private double alcanceMaximo;
        //private boolean possuiMira;
        //private String tipoRifle;
        //private int taxaDisparo;

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

        System.out.print("\n\n\n");
        System.out.println("\n=== INFORMAÇÕES DO RIFLE ===");
        System.out.println("Nome: " + r1.getNome());
        System.out.println("Número de balas: " + r1.getMunicao());
        System.out.println("Ano de criação: " + r1.getAno_c());
        System.out.println("Fabricante: " + r1.getFabricante());
        System.out.println("Cidade: " + r1.getLugar().getCidade().getNomeCid());
        System.out.println("CEP da cidade: " + r1.getLugar().getCidade().getCodCid());
        System.out.println("Estado: " + r1.getLugar().getCidade().getUfCid());
        System.out.println("Rua: " + r1.getLugar().getRua());
        System.out.println("Número da casa: " + r1.getLugar().getNumero());
        System.out.println("Alcance máximo: " + r1.getAlcanceMaximo() + " metros");
        System.out.println("Possui mira: " + r1.getPossuiMira());
        System.out.println("Tipo de rifle: " + r1.getTipoRifle());
        System.out.println("Taxa de disparo: " + r1.getTaxaDisparo() + " tiros/minuto");

	}
}
