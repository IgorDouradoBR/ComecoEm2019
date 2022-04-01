import java.util.*;
public class AppRetangulo //classe aplicacao
{
    public static void main(String [] args){
        System.out. println("\f");
        Scanner in=new Scanner(System.in);
        Retangulo ret1,ret2;//variaveis de objeto
        
        ret1=new Retangulo(3,4); //instanciando o 1o objeto do tipo retangulo
       // aqui eu forneco direto os valores
       
       /// agora vou pedir os valores para usuario, um de cada vez
        System.out. println("\n Digite a medida da base retangulo");
        double base=in.nextDouble();
        
        System.out. println("\n Digite a medida da altura do retangulo");
        double altura=in.nextDouble();
        
        ret2=new Retangulo(base,altura);//instanciando o 2o objeto do tipo retangulo
       // aqui eu uso as informacoes fornecidas pelo usuario.
       
        System.out.println("\n Informações do objeto retangulo1");
        System.out.println(ret1);//observem o uso do toString
        System.out.printf("Area do retangulo1= %.2f",ret1.areaR());
        double perimetro=ret1.perimetroR();
        System.out.printf("\n Perimetro do retangulo1= %.2f",perimetro);
        System.out.printf("\n Diagonal do retangulo1= %.2f",ret1.diagonalR());
        
        System.out. println("\n \n Informações do objeto retangulo2");
        System.out.println(ret2);//observem o uso do toString
        System.out.printf("Area do retangulo2= %.2f",ret2.areaR());
        double perimetro2=ret2.perimetroR();
        System.out.printf("\n Perimetro do retangulo2= %.2f",perimetro2);
        System.out.printf("\n Diagonal do retangulo2= %.2f",ret2.diagonalR());
       
        if (perimetro2 >perimetro) System.out. println("\n \n Retangulo 2 possui dimensoes maiores que retangulo1");
        else System.out. println("\n \n Retangulo 1 possui dimensoes maiores que retangulo2");
        
         System.out.println("\n *******F  I  M  *******");
        
      }
}
