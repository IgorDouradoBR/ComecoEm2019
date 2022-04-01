
/**
 * exercicio 3 da lista de OO  AppFuncionario  
 * 
 * @author (Giraffa) 
 * @version (outubro/2017)
 */
import java.util.*;
public class AppFuncionario //classe aplicacao
{
    public static void main(String [] args){
        System.out. println("\f");
        Scanner in=new Scanner(System.in);
        Funcionario func1,func2;//variaveis de objeto
        
        func1=new Funcionario("Adao",45.10,32); //instanciando o 1o objeto do tipo funcionario
       // aqui eu forneco direto os valores
       
       /// agora vou pedir os valores para usuario, um de cada vez
        System.out. println("\n Digite total horas trabalhadas do funcionario");
        int horas=in.nextInt();
        
        System.out. println("\n Digite valor hora do funcionario");
        double valor=in.nextDouble();
        
        System.out. println("\n Digite nome do funcionario");
        String nome=in.nextLine();
        
        func2=new Funcionario(nome,valor, horas);//instanciando o 2o objeto do tipo funcionario
       // aqui eu uso as informacoes fornecidas pelo usuario.
       
        System.out. println("\n Informações do objeto funcionario1");
        System.out.println(func1);//observem o uso do toString
                
        System.out. println("\n \n Informações do objeto funcionario2");
        System.out.println(func2);//observem o uso do toString
        
        double salario1=func1.salario();
        double salario2=func2.salario();
       
        if (salario1 >salario2) System.out. println("\n \n Funcionario 1 possui maior salario que funcionario2");
        else System.out. println("\n \n Funcionario 2 possui possui maior salario que funcionario1");
        
         System.out.println("\n *******F  I  M  *******");
        
      }
}
