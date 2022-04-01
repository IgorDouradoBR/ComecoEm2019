public class Carro
{
    private String modelo;
    private int ano;
    private String placa;
    private String cor;
    
    public Carro(String modelo, int ano, String placa, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
    }
    
    public String getModelo(){ return modelo;}
    public int getAno(){ return ano; }
    public String getPlaca(){ return placa; }
    public String getCor(){ return cor; }
    
    public void setPlaca(String placa){ this.placa = placa;}
    public void setCor(String cor){ this.cor = cor;}
    
    public String toString(){
        return "Modelo: " + modelo + 
        "\nAno: " + ano + 
        "\nPlaca: " + placa + 
        "\nCor: " + cor;
    }
    
    
}
