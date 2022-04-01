import java.util.Scanner;
public class Interface
{
    private Scanner in = new Scanner(System.in);
    private CadastroCarros cd;
    
    public Interface(){
        inicializacao();
        executa();
    }

    public void executa(){       
         try{
            int opcao = 0;

            do{

                System.out.println("\fMENU:");
                System.out.println("1 - CADASTRO");
                System.out.println("2 - PESQUISA");
                System.out.println("3 - REMOCAO");
                System.out.println("4 - VISUALIZAR TUDO");
                System.out.println("5 - SAIR");

                opcao = in.nextInt();
                System.out.println("\f");
                switch(opcao){
                    case 1: cadastrarCarro(); break;
                    case 2: pesquisarCarro(); break;
                    case 3: removerCarro(); break;
                    case 4: imprimir(); break;
                    case 5: break;
                    default: System.out.println("OPcaO INVaLIDA!");
                }                
            } while (opcao!= 5);    
        } catch (Exception e){
            System.out.println("\fOcorreu um erro durante a execusao!  ");
            in.nextLine();
            waitPress();
            executa();
        }
    }
    
    public void inicializacao(){
         try{            
            System.out.println("\fInforme o tamanho do cadastro:");
            int tam = in.nextInt();
            cd = new CadastroCarros(tam);
        } catch(Exception e){
            System.out.println("\fOcorreu um erro durante a inicializasao!  ");
            in.nextLine();
            waitPress();
            inicializacao();
        }
    }

    public void waitPress(){
        System.out.print("\n\nInforme qualquer coisa para continuar...\n\n");
        in.nextLine();      
        
    }

    public void cadastrarCarro() throws Exception {
        System.out.print("CADASTRO DE CARROS\n\n");
        System.out.print("Modelo: \t");
        String mod = in.next();
        System.out.print("Placa: \t\t");
        String pla = in.next();
        System.out.print("Ano: \t\t");
        int ano = in.nextInt();
        System.out.print("Cor: \t\t");
        String cor = in.next();
        in.nextLine();

        Carro c = new Carro(mod, ano, pla, cor);
        if(cd.adicionaNoVetor(c)){
            System.out.print("\n\nCADASTRO REALIZADO COM SUCESSO");           
        } else {
            System.out.print("\n\nERRO AO EFETUAR CADASTRO: VERIFIQUE O LIMITE DE ARMAZENAMENTO DE DADOS");           
        }
        
        waitPress();
    }

    public void removerCarro() throws Exception{

        System.out.print("REMOCAO DE CARROS\n\n");

        System.out.print("Placa: \t");
        String pla = in.next();

        if(cd.removeDoVetor(pla)){
            System.out.print("\n\nCADASTRO EXCLUaDO COM SUCESSO");           
        } else {
            System.out.print("\n\nERRO AO EFETUAR EXCLUSAO: VERIFIQUE SE A PLACA INFORMADA ENCONTRA-SE CADASTRADA");           
        }
        
        waitPress();
    }

    public void pesquisarCarro() throws Exception{

        System.out.print("PESQUISA DE CARROS\n\n");

        System.out.print("Placa: \t");
        String pla = in.next();

        Carro c = cd.pesquisaNoVetor(pla);

        if(c != null){
            System.out.print("\n\nCADASTRO ENCONTRADO COM SUCESSO\n\n");        
            System.out.print(c.toString());
        } else {
            System.out.print("\n\nERRO AO EFETUAR EXCLUSAO: VERIFIQUE SE A PLACA INFORMADA ENCONTRA-SE CADASTRADA");           
        }
        in.nextLine();
        waitPress();
    }

    public void imprimir(){
        cd.imprimeVetor();
        in.nextLine();
        waitPress();
    }
}
