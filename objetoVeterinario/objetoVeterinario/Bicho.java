package objetoVeterinario;
/**
 * PetShop
 * @author (Igor Vicente)
 * @version (30/10/2019)
 */
public class Bicho
{
    String nome;
    int tipo;
    double peso;
    Cliente dono;
    
    Bicho(String nome,int tipo,double peso,Cliente dono){
        this.nome=nome;
        this.tipo=tipo;
        this.peso=peso;
        this.dono=dono;
    }
    
    public String getNome(){return nome;}
    public int getTipo(){return tipo;}
    public double getPeso(){return peso;}
    public Cliente getDono(){return dono;}
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public void setDono(Cliente dono){
        this.dono=dono;
    }
    
    public String toString(){
        String pet="Pet";
        if(tipo==1){pet="Gato";}
        if(tipo==2){pet="Cachorro";}
        return" Nome: "+nome+
               "\n Tipo: "+pet+
               "\n Peso: "+peso+
               "\n Nome/CPF do dono: "+dono.getNome()+"/"+dono.getCpf();
    }
}
