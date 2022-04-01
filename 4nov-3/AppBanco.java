
public class AppBanco
{
    public static void main(String [] args){
        
        ContaBancaria conta1;
        conta1 = new ContaBancaria("Fulano", "001-1");
        
        ContaBancaria conta2 = new ContaBancaria("Ciclano", "001-1");
        System.out.println("\f");
        
        System.out.println(conta1.getNomeTitular());	
        conta1.setNomeTitular("Maria");
        System.out.println(conta1.getSaldo());		
        System.out.println(conta2.getNomeTitular());
        System.out.println(conta2.getSaldo());
        System.out.println("\n");
        System.out.println("---------------------------------------");
        conta1.getSaldo();
        
        conta1.depositar(500.00);
        conta1.sacar(398.00);
        System.out.println(conta1.getSaldo());
        conta1.depositar(200.00);
        
        conta2.depositar(300.00);
        conta2.depositar(15.00);
        
        System.out.println(conta1.getNomeTitular());	
        System.out.println(conta1.getSaldo());	
        System.out.println(conta2.getNomeTitular());
        System.out.println(conta2.getSaldo());	
        System.out.println("\n");
        System.out.println("---------------------------------------");
        conta1.transferir(conta2, 100.00);
        
        System.out.println(conta1.getNomeTitular());	
        System.out.println(conta1.getSaldo());	
        System.out.println(conta2.getNomeTitular());
        System.out.println(conta2.getSaldo());	
        System.out.println("---------------------------------------");
        
    }
}
