
public class Conta
{
    private int numero;
    private double saldo;
    
    public Conta(int n){
        numero = n;
        saldo = 0;
    }
    
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo)
           saldo = saldo - valor;
    }
    
    public void depositar(double valor){
        if(valor > 0)
           saldo = saldo + valor;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int num){
         numero=num;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double s){
        saldo=s;
    }
    
    public String toString(){
        return "Numero da conta: " + numero + "\nSaldo: "+ saldo;
    }
       
}
