package objetoVeterinario;
/**
 * PetShop
 * @author (Igor Vicente)
 * @version (30/10/2019)
 */
public class Cliente
{
    String nome;
    String pet;
    long cpf;
    
    Cliente(String nome, long cpf, String pet){
        this.nome=nome;
        this.cpf=cpf;
        this.pet=pet;
    }
    
    public String getNome(){return nome;}
    
    public long getCpf(){return cpf;}
    
    public String getPet(){return pet;}
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCpf(long cpf){
        this.cpf=cpf;
    }
    
    public void setPet(String pet){
        this.pet=pet;
    }
    
    public String toString(){
        return "Nome: "+nome+"  CPF: "+ cpf+" Pets: "+pet;
    }
}
