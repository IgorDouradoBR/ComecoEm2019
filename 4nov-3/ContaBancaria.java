public class ContaBancaria
{
   private String nomeTitular;
   private String numConta;
   private double saldo;
   
   //metodo construtor
   public ContaBancaria(String nomeTitular, String numConta){
       this.nomeTitular = nomeTitular;
       this.numConta = numConta;
       this.saldo = 0;
   }
   
   public String getNomeTitular(){
       return nomeTitular;
   }
   
   public String getNumConta(){
       return numConta;
   }
   
   public double getSaldo(){
       return saldo;
   }
   
   public void setNomeTitular(String nomeTitular){
       this.nomeTitular = nomeTitular;
   }
      
   public void setNumConta(String numConta){
       this.numConta = numConta;
   }
      
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   
   public void sacar(double valor){
       saldo -= valor;
        
   }
   
   public void depositar(double valor){
       saldo += valor;
    }
    
   public void transferir(ContaBancaria contaOrigem, double valor){
       contaOrigem.sacar(valor);
       depositar(valor);
   }
   
   public String contaCedulas(int valor){
        int notas100 = valor / 100;
        int resto = valor % 100;
        int notas50 = resto / 50;
        resto = resto % 50;
        int notas20 = resto / 20;
        resto = resto % 20;
        int notas5 = resto / 5;
        resto = resto % 5;
        int notas1 = resto;
    
        return "Notas de 100: " + notas100 + "\nNotas de 50: " + notas50 + "\nNotas de 20: " + notas20 + "\nNotas de 5: " + notas5   + "\nNotas de 1: " + notas1;
    }

   
}
