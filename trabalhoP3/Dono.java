public class Dono
{
    private String nome;
    private int cpf;
         
    
    public Dono(String nome,int cpf){
        setNome(nome);
        setCpf(cpf);
                
    }
    
    public String getNome(){return nome;}
    public int getCpf( ){return cpf;}
    
       
    public void setNome(String nome){this.nome=nome;}
    public void setCpf(int cpf){this.cpf=cpf;}
    
    
    
      
    public String toString(){
         return "\n Nome Dono do Pet: " + nome+ "\n CPF do dono : " + cpf;
               
    }
   
}