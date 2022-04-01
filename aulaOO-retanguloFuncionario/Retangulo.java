public class Retangulo//classe base
{

//atributos desta classe onde irei guardar as informações de cada objeto criado. Ou seja, os valores a serem atribuidos a estas variaveis
   private double base, altura;
   
   
   
   //metodo construtor com regramento para instanciar (criar) um objeto **este e com uso de parametro 
   public Retangulo(double base, double altura)
   {
       this.base=base;
       this.altura=altura;
       
   }
   //getters ***metodos de acesso ao conteudo dos atributos do objeto (valor)
   public double getBase()
   {
       return base;
   }
   
   public double getAltura()
   {
       return altura;
   }
   
      //metodos de modificao ***** setters *******
   
   public void setBase(double base)
   {
       this.base=base;
   }
   
   public void setAltura(double altura)
   {
       this.altura=altura;
   }
    
   //outros metodos 
   public double areaR()
   {//retorna a area do retangulo
       return base*altura;
   }
   
   public double perimetroR() 
   {//retorna o perimetro
    double aux= 2*base+2*altura;
    return aux;    
    }
    
    public double diagonalR()
    {//retorna a diagonal
    double aux= Math.sqrt(base*base+ altura*altura);
    return aux;    
    }
    // metodo  to String para escrever todos atributos com formtacao 
    
    public String toString()
    {
             
          String aux= "\n Medidas do Retangulo \n Base= "+ base+ "\n altura="+ altura;
         return aux;
       
    
     }

}
