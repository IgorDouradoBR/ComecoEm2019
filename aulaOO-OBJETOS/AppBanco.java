import java.util.Scanner;
public class AppBanco
{
    public static void main(String [] args){
        System.out.println("\f");
        Scanner in = new Scanner(System.in);

        System.out.println("Criando CONTA 1");

        System.out.print("Informe o nome do titular:\t");
        String titular = in.nextLine();
        System.out.print("Informe o número da agência:\t");
        int agencia = in.nextInt();
        System.out.print("Informe o número da conta:\t");
        int conta = in.nextInt(); 
        System.out.println("\fCONTA 1 CRIADA COM SUCESSO:");
        ContaBancaria2 cb1 = new ContaBancaria2(titular, agencia, conta);
        System.out.println("\n" + cb1);

        System.out.println("Pressione qualquer tecla...");
        in.next();

        System.out.println("\fCriando CONTA 2");

        System.out.print("Informe o nome do titular:\t");
        in.next();
        titular = in.nextLine();
        System.out.print("Informe o número da agência:\t");
        agencia = in.nextInt();
        System.out.print("Informe o número da conta:\t");
        conta = in.nextInt(); 
        System.out.println("\fCONTA 2 CRIADA COM SUCESSO:");

        ContaBancaria2 cb2 = new ContaBancaria2(titular, agencia, conta);

        System.out.println("\n" + cb2);

        System.out.println("Pressione qualquer tecla...");
        in.next();

        int optConta = 0;
        do{
            optConta = menuConta();
            int optSub = 0;
            do{
                if(optConta != 0){
                    optSub = menuSub();               
                    if(optConta == 1){
                        switch(optSub){
                            case 1: sacar(cb1); break;
                            case 2: depositar(cb1); break;
                            case 3: transferir(cb1, cb2); break;   
                            case 4: mostraSaldo(cb1); break;
                        }
                    } else {   
                        switch(optSub){
                            case 1: sacar(cb2); break;
                            case 2: depositar(cb2); break;
                            case 3: transferir(cb2, cb1); break;
                            case 4: mostraSaldo(cb1); break;
                        }
                    } 
                }
            }while(optSub != 0);
        } while(optConta != 0);   

        System.out.println("Obrigada! Volte sempre...  :) ");
    }

    public static void sacar(ContaBancaria2 cb){
        Scanner in = new Scanner(System.in);       
        System.out.println("\fInforme o valor de saque:");
        double saque = in.nextDouble();
        if(cb.sacar(saque)){
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("\nPressione qualquer tecla...");
        in.next();
    }

    public static void mostraSaldo(ContaBancaria2 cb){
        Scanner in = new Scanner(System.in);       
        System.out.println("\f" + cb);
        System.out.println("\nPressione qualquer tecla...");
        in.next();         
    }

    public static void depositar(ContaBancaria2 cb){
        Scanner in = new Scanner(System.in);       
        System.out.println("\fInforme o valor de depósito:");
        double dep = in.nextDouble();
        cb.depositar(dep);
        System.out.println("Depósito realizado com sucesso");

        System.out.println("\nPressione qualquer tecla...");
        in.next();
    }

    public static void transferir(ContaBancaria2 cbOri, ContaBancaria2 cbDest){
        Scanner in = new Scanner(System.in);       
        System.out.println("\fInforme o valor de transferência:");
        double trans = in.nextDouble();
        if(cbOri.transferir(trans, cbDest)){
            System.out.println("Transferencia realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("\nPressione qualquer tecla...");
        in.next();
    }

    public static int menuSub(){
        Scanner in = new Scanner(System.in);       
        System.out.println("\fInforme:");
        System.out.println("1 - PARA SACAR");
        System.out.println("2 - PARA DEPOSITAR");   
        System.out.println("3 - PARA TRANSFERIR"); 
        System.out.println("4 - PARA VER SALDO"); 
        System.out.println("0 - PARA SAIR"); 
        int opcao = in.nextInt();
        if(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
            System.out.println("\nOPÇÃO INVÁLIDA");
            System.out.println("Pressione qualquer tecla...");
            in.next();     
            menuConta();
        } 
        return opcao;        
    }

    public static int menuConta(){
        Scanner in = new Scanner(System.in);

        System.out.println("\fInforme:");
        System.out.println("1 - PARA CONTA 1");
        System.out.println("2 - PARA CONTA 2");   
        System.out.println("0 - PARA SAIR"); 
        int opcao = in.nextInt();
        if(opcao != 0 && opcao != 1 && opcao != 2){
            System.out.println("\nOPÇÃO INVÁLIDA");
            System.out.println("Pressione qualquer tecla...");
            in.next();     
            menuConta();
        } 
        return opcao;        
    }
}
