public class VolumeSolidos
{
 //versao   para aglutinar os metodos   
   //metodo construtor sem parametros
   public VolumeSolidos()
   {
      
   }
   //para poder instaciar objetos desta classe
   public double volumeEsfera (double raio )
   {
       double volume= (4*Math.PI* Math.pow(raio,3))/3;
       return  volume;
   }
   
    public double volumeCone(double raio, double altura)
   {
       double volume= (Math.PI* Math.pow(raio,2)*altura)/3;
       return  volume;
   }
   
    public double volumeCilindro(double raio, double altura)
   {
       double volume= Math.PI* Math.pow(raio,2)*altura;
       return  volume;
   }
  
    public double volumeCubo(double lado)
   {
       double volume=lado*lado*lado; //Math.pow(lado,3)
       return  volume;
   }
   
    public double volumeParalelepipedo(double largura, double altura, double comprimento)
   {
       double volume=largura*altura*comprimento;
       return  volume;
   }
}
