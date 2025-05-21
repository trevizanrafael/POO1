/*
NOME: Rafael Moraes Trevizan 
RA: 2648938
 */
public class Principal{
	public static void main(String args[]){
		boolean ver = true;
        
        Espingardas e1 = new Espingardas();
        Pistolas p1 = new Pistolas();
        Rifles r1 = new Rifles();

        while(ver){
		
			try{
				e1.setNome(Leitura.entDados("Nome da espingarda:"));
                e1.setAno_c(Integer.parseInt(Leitura.entDados("Ano que a espingarda foi criada:")));
                e1.setFabricante(Leitura.entDados("Fabricante da espingarda:"));
                e1.getPessoa().setNome(Leitura.entDados("Nome do proprietário:"));
                e1.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF do proprietário:")));
                e1.setNumeroCanos(Integer.parseInt(Leitura.entDados("Número de canos:")));
                e1.setTipoMunicao(Leitura.entDados("Tipo de munição:"));
				ver = false;
			}

            catch(NumberFormatException nfe){
                System.out.println("Digite apenas numerais em CPF e ano de criação.");
            }

            catch(ArmaNomePeqException anpe){
                System.out.println("Nome da arma muito pequeno.");
            }

            catch(PessoaNomePeqException pnpe){
                System.out.println("Nome do proprietário muito pequeno.");
            }
            
            catch(AnoNegException ane){
                System.out.println("Ano de criação não pode ser negativo.");
            }

            catch(CanosNegException cne){
                System.out.println("Número de canos não pode ser negativo.");
            }

            catch(CpfNegException cpne){
                System.out.println("CPF não pode ser negativo.");
            }

            finally{
                System.out.println("Tentativa de leitura finalizada.\n");
            }
        }

        System.out.print("\n");
        System.out.println("\n=== INFORMAÇÕES DA ESPINGARDA ===");
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Ano de criação: " + e1.getAno_c());
        System.out.println("Fabricante: " + e1.getFabricante());
        System.out.println("Proprietário: " + e1.getPessoa().getNome());
        System.out.println("CPF: " + (e1.getPessoa().getCpf()));
        System.out.println("Tipo de Munição: " + e1.getTipoMunicao());
        System.out.println("Numero de canos: " + e1.getNumeroCanos() + " canos");
        System.out.println("\n\n");

        ver = true;

        while(ver){
		
			try{
				r1.setNome(Leitura.entDados("Nome do rifle:"));
                r1.setAno_c(Integer.parseInt(Leitura.entDados("Ano que o rifle foi criado:")));
                r1.setFabricante(Leitura.entDados("Fabricante do rifle:"));
                r1.getPessoa().setNome(Leitura.entDados("Nome do proprietário:"));
                r1.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF do proprietário:")));
                r1.setAlcanceMaximo(Integer.parseInt(Leitura.entDados("Alcance máximo:")));
                r1.setTaxaDisparo(Integer.parseInt(Leitura.entDados("Taxa de disparo:")));
				ver = false;
			}

            catch(NumberFormatException nfe){
                System.out.println("Digite apenas numerais em CPF e ano de criação.");
            }

            catch(ArmaNomePeqException anpe){
                System.out.println("Nome da arma muito pequeno.");
            }

            catch(PessoaNomePeqException pnpe){
                System.out.println("Nome do proprietário muito pequeno.");
            }
            
            catch(AnoNegException ane){
                System.out.println("Ano de criação não pode ser negativo.");
            }

            catch(CpfNegException cpne){
                System.out.println("CPF não pode ser negativo.");
            }
            
            catch(AlcanceNegException ane){
                System.out.println("Alcance máximo não pode ser negativo.");
            }

            catch(TaxaNegException tdne){
                System.out.println("Taxa de disparo não pode ser negativa.");
            }
            
            finally{
                System.out.println("Tentativa de leitura finalizada.\n");
            }
        }

        System.out.print("\n");
        System.out.println("\n=== INFORMAÇÕES DO RIFLE ===");
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Ano de criação: " + e1.getAno_c());
        System.out.println("Fabricante: " + e1.getFabricante());
        System.out.println("Proprietário: " + e1.getPessoa().getNome());
        System.out.println("CPF: " + (e1.getPessoa().getCpf()));
        System.out.println("Alcance máximo: " + r1.getAlcanceMaximo() + " metros");
        System.out.println("Taxa de disparo: " + r1.getTaxaDisparo() + " tiros por minuto");
        System.out.println("\n\n");

        ver = true;

        while(ver){
		
			try{
				p1.setNome(Leitura.entDados("Nome da pistola:"));
                p1.setAno_c(Integer.parseInt(Leitura.entDados("Ano que a pistola foi criada:")));
                p1.setFabricante(Leitura.entDados("Fabricante da pistola:"));
                p1.getPessoa().setNome(Leitura.entDados("Nome do proprietário:"));
                p1.getPessoa().setCpf(Integer.parseInt(Leitura.entDados("CPF do proprietário:")));
                p1.setTempoTrocaCartucho(Integer.parseInt(Leitura.entDados("Tempo de troca de cartucho:")));
                p1.setSilenciador(Boolean.parseBoolean(Leitura.entDados("Possui silenciador? (true/false)")));
				ver = false;
			}

            catch(NumberFormatException nfe){
                System.out.println("Digite apenas numerais em CPF e ano de criação.");
            }

            catch(ArmaNomePeqException anpe){
                System.out.println("Nome da arma muito pequeno.");
            }

            catch(PessoaNomePeqException pnpe){
                System.out.println("Nome do proprietário muito pequeno.");
            }
            
            catch(AnoNegException ane){
                System.out.println("Ano de criação não pode ser negativo.");
            }

            catch(TempoNegException tne){
                System.out.println("Tempo de troca de cartucho não pode ser negativo.");
            }

            catch(CpfNegException cpne){
                System.out.println("CPF não pode ser negativo.");
            }

            finally{
                System.out.println("Tentativa de leitura finalizada.\n");
            }
        }

        System.out.print("\n");
        System.out.println("\n=== INFORMAÇÕES DA PISTOLA ===");
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Ano de criação: " + e1.getAno_c());
        System.out.println("Fabricante: " + e1.getFabricante());
        System.out.println("Proprietário: " + e1.getPessoa().getNome());
        System.out.println("CPF: " + (e1.getPessoa().getCpf()));
        System.out.println("Tempo de troca de cartucho: " + p1.getTempoTrocaCartucho() + " segundos");
        System.out.println("Possui silenciador: " + p1.getSilenciador());
	}    
}
