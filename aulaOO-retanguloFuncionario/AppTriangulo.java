import java.util.*;
public class AppTriangulo //classe aplicacao
{
    public static void main(String [] args){
        System.out. println("\f");
        Scanner teclado=new Scanner(System.in);
        
        

        System.out.println("\n Digite a medida da base do 1º Triangulo");
        double base1=teclado.nextDouble();
        System.out.println("\n Digite a medida do 2º lado do Triangulo");
        double ladoA1=teclado.nextDouble();
        System.out.println("\n Digite a medida do 3º lado do Triangulo");
        double ladoB1=teclado.nextDouble();
        System.out. println("\n Digite a medida da altura do 1º Triangulo");
        double altura1=teclado.nextDouble();
        
        
        
        Triangulo tri1 = new Triangulo(base1, ladoA1, ladoB1, altura1);
        System.out. println(tri1);
        
        System.out.println("\n Digite a medida da base do 2º Triangulo");
        double base2=teclado.nextDouble();
        System.out.println("\n Digite a medida do 2º lado do 2º Triangulo");
        double ladoA2=teclado.nextDouble();
        System.out.println("\n Digite a medida do 3º lado do 2º Triangulo");
        double ladoB2=teclado.nextDouble();
        System.out. println("\n Digite a medida da altura do 2º Triangulo");
        double altura2=teclado.nextDouble();
        
        Triangulo tri2 = new Triangulo(base2, ladoA2, ladoB2, altura2);
        System.out. println(tri2);
      }
}
