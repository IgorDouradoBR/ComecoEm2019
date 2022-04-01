import java.util.Scanner;
public class Principal
{
    //Método que cria um objeto da classe funcionário
    public static Funcionario criaFuncionario(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\fFUNCIONÁRIO");
        System.out.println("Nome: ");
        String nome = in.next();
        System.out.println("Valor da hora:");
        double vH = in.nextDouble();
        System.out.println("Carga semanal:");
        int carga = in.nextInt();
        
        //retorna um novo objeto do tipo funcionário.
        //Lembrando: O comando new cria um novo objeto na MEMÓRIA, logo, o que
        //o método realmente retorna é esse endereço de memória.
        return new Funcionario(nome, vH, carga);            
    }
    
    public static void main(String [] args){   
        
        //chama o método e recebe o endereço de memória dos objetos criados lá.
        Funcionario f1 = criaFuncionario();
        Funcionario f2 = criaFuncionario();
        
        if(f1.salario() > f2.salario()){            
            System.out.println(f1);
        } else {
            System.out.println(f2); 
        }
        
        
        System.out.println(f1);
        System.out.println(f2);
        
    }
}
