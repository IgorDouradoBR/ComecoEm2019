public class Bicho
{
    private String nome;
    private int tipo;
    private double peso;
    private Dono donoB;
       
    
    public Bicho(String nome,int tipo,double peso, Dono d){
        setNome(nome);
        setPeso(peso);
        setTipo(tipo);
        setDonoB(d);
                
    }
    
    public String getNome(){return nome;}
    public int getTipo( ){return tipo;}
    public double getPeso( ){return peso;}
    public Dono getDonoB(){return donoB;}
       
    public void setNome(String nome){this.nome=nome;}
    public void setTipo(int tipo){this.tipo=tipo;}
    public void setPeso(double peso){this.peso=peso;}
    public void setDonoB(Dono x){donoB=x;}
    
    
      
    public String toString(){
        String aux=" ";
        if (tipo==1) { aux="cachorro";}
        if (tipo==2) { aux="gato";}
           else { aux="outro";}
        return "\n Nome do Pet: " + nome+ "\n Tipo do Pet: " + aux+ "\n Peso do Pet: " + peso + "\n Dono do Pet: " + donoB;
               
    }
   
}
