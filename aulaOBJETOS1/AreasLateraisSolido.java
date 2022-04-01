
public class AreasLateraisSolido
{
  //versao  para aglutinar os metodos   
   //metodo construtor sem parametros
   public AreasLateraisSolido()
   {
      
   }
   //para poder instaciar objetos desta classe
   public double superficieEsfera (double raio )
   {
       double superficie= 4*Math.PI* Math.pow(raio,2);
       return  superficie;
   }
   
    public double superficieCone(double raio, double geratriz)
   {
       double superficie= Math.PI* raio*geratriz;
       return  superficie;
   }
   
    public double areaLCilindro(double raio, double altura)
   {
       double superficie= 2*Math.PI* raio*altura;
       return  superficie;
   }
  
    public double areaLCubo(double lado)
   {
       double superficie=lado*lado*4; //Math.pow(lado,3)
       return  superficie;
   }
   
    public double areaLParalelepipedo(double largura, double altura, double comprimento)
   {
       double superficie= 2*(largura*altura)+ 2*(altura*comprimento);
       return  superficie;
   }
}
