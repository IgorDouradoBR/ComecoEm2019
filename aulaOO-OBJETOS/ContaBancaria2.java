
public class ContaBancaria2
{
    private String titular;
    private int numAgencia;
    private int numConta;
    private double saldo;    
    //método construtor
    public ContaBancaria2(String t, int numA, int numC){
        titular = t;
        numAgencia = numA;
        numConta = numC;
        saldo = 0;        
    }
    //métodos modificadores
    public void setTitular(String novoTitular){ titular = novoTitular; }
    public void setAgencia(int novaAgencia){ numAgencia = novaAgencia;}
    //método de acesso
    public String getTitular(){ return titular; }
    public int getNumAgencia(){ return numAgencia; }
    public int getNumConta(){ return numConta; }
    public double getSaldo(){ return saldo; }
    //toString
    public String toString(){
        return "Titular: \t" + titular + 
        "\nAgência: \t" + numAgencia + 
        "\nConta: \t\t" + numConta + 
        "\nSaldo: R$\t" + saldo;
    }    
    //outros métodos
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    public boolean sacar(double valorSaque){
        if(saldo >= valorSaque){
            saldo -= valorSaque;
            return true;
        } else {
            return false;
        }
    }
    public boolean transferir(double valorTransferencia, ContaBancaria2 cbDestino){
        if(sacar(valorTransferencia)){
            cbDestino.depositar(valorTransferencia);   
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
