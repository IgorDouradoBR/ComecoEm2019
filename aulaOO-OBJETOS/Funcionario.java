public class Funcionario
{
    private String nome;
    private double valorHora;
    private int cargaSemanal;

    //Construtor
    public Funcionario(String nomeInicial, double valorHoraInicial, int cargaSemanaInicial){
        nome = nomeInicial;
        valorHora = valorHoraInicial;
        setCargaSemanal(cargaSemanaInicial);
    }
    //métodos setters
    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setValorHora(double novoValorHora){
        valorHora = novoValorHora;
    }

    public void setCargaSemanal(int novaCargaSemanal){
        if(novaCargaSemanal > 44 ){
            cargaSemanal = 44;
        } else {
            cargaSemanal = novaCargaSemanal;        
        }
    }
    //getters
    public String getNome(){ return nome; }

    public double getValorHora(){ return valorHora; }

    public int getCargaSemanal(){ return cargaSemanal; }

    public double salario(){
        return valorHora * cargaSemanal * 4;        
    }

    public String toString(){
        return "Nome: " + nome + 
        "\nValor da hora: " + valorHora +
        "\nCarga semanal: " + cargaSemanal + 
        "\nSalário: " + salario();
    }

}
