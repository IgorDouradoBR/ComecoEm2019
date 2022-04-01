public class AreasPlanas
{
  //versao  para aglutinar os metodos   
   //metodo construtor sem parametros
   public AreasPlanas()
   {
      
   }
   //para poder instaciar objetos desta classe
   public double areaQuadrado (double lado )
   {
       double area= lado*lado;
       return  area;
   }
   
    public double areaTriangulo(double base, double altura)
   {
       double area= (base+altura)/2;
       return  area;
   }
   
    public double areaRetangulo(double base, double altura)
   {
       double area= base*altura;
       return  area;
   }
  
    public double areaCirculo(double raio)
   {
       double area=Math.PI*raio*raio;
       return  area;
   }
   
   
}
