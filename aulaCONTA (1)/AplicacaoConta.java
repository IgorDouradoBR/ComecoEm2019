import java.util.Scanner;

public class AplicacaoConta
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\f");
        Conta[] banco=new Conta[5];
        int num;
        double valor;
        Conta c1 = new Conta(1);
        c1.depositar(250);
        Conta c2 = new Conta(2);
        c2.depositar(300);
        Conta c3 = new Conta(3);
        c3.depositar(500);
        Conta c4 = new Conta(4);
        c4.depositar(1000);
        Conta c5 = new Conta(5);
        c5.depositar(800);
        banco[0]=c1;
        banco[1]=c2;
        banco[2]=c3;
        banco[3]=c4;
        banco[4]=c5;
        
        while(true){
            int op = menu();
            if(op == 0) break;
            switch(op){
                case 1: System.out.println("\nDigite o numero da conta a depositar: ");
                        num=in.nextInt();
                        System.out.println("Digite o valor a depositar: ");
                        valor = in.nextDouble();
                        banco[num-1].depositar(valor);
                        break;
                case 2: System.out.println("\nDigite o numero da conta a sacar: ");
                        num=in.nextInt();
                        System.out.println("Digite o valor a sacar: ");
                        valor = in.nextDouble();
                        banco[num-1].sacar(valor);
                        break;
                case 3: System.out.println("\nDigite o numero da conta que deseja saber saldo: ");
                        num=in.nextInt();
                        System.out.print("\nSaldo da conta: "+num + " e igual a:  " +banco[num-1].getSaldo());
                        break;
                case 4: System.out.println("\nTodas as contas e sua informações");
                        for (int i=0;i<5;i++) 
                        { 
                        System.out.println(banco[i]);
                        }
                        break;
                case 5: double media=0;
                        for (int i=0;i<5;i++) 
                        { 
                        media=media+banco[i].getSaldo();
                        }
                        System.out.println("\nMedia dos saldos= "+ media/5);
                        break;
                default: break;
            
                    }
                } 
        
    }

    
    public static int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n\n Menu de opcoes");
        System.out.println("(0) Sair");
        System.out.println("(1) Depositar em uma conta");
        System.out.println("(2) Sacar de uma conta");
        System.out.println("(3) Verificar saldo de uma conta");
        System.out.println("(4) Relatorio de todas contas");
        System.out.println("(5) Media do saldo de todas contas");
        System.out.println("Digite a opcao desejada:");
        int op = in.nextInt();
        return op;
    }
}
