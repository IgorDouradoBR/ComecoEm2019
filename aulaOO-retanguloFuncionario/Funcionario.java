public class Funcionario//classe base
{

//atributos desta classe onde irei guardar as informações de cada objeto criado. Ou seja, os valores a serem atribuidos a estas variaveis
   private double valorH;
   private String nome;
   private int totalH;
   
   
   //metodo construtor com regramento para instanciar (criar) um objeto **este e com uso de parametro 
   public Funcionario(String nome , double valorH, int totalH)
   {
       setNome(nome);
       setValorH(valorH);
       if (totalH <=44)setTotalH(totalH);
                   else setTotalH(44);
       
   }
   //getters ***metodos de acesso ao conteudo dos atributos do objeto (valor)
   public String getNome()
   {
       return nome;
   }
   
   public double getValorH()
   {
       return valorH;
   }
   
   public int getTotalH()
   {
       return totalH;
   }
      //metodos de modificao ***** setters *******
   
   public void setNome(String nome)
   {
       this.nome=nome;
   }
   
   public void setValorH(double valorH)
   {
       this.valorH=valorH;
   }
   
   public void setTotalH(int totalH)
   {
       this.totalH=totalH;
   }
    
   //outros metodos 
   
    public double salario()
    {
               return valorH*totalH;
   }
    
    // metodo  to String para escrever todos atributos com formtacao 
    
    public String toString()
    {
             
          String aux= "\n Nome do Funcionario= "+ nome+ "\n Valor da Hora="+ valorH+ "\n Carga Horaria="+ totalH;
         return aux;
       
    
     }

}
