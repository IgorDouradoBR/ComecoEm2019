import java.util.Scanner;
public class AppPet
{
    
                           

         public static void main(String [] args){
             Scanner in=new Scanner(System.in);
             System.out.println("\f");
             Bicho [] lista=new Bicho[5];
               System.out.println("\n Escrevendo conteudo de cada objeto criado");
               Dono d1=new Dono( "Ze Adao",1234567);
               Dono d2=new Dono( "Eva Maria",4567890);
               Dono d3=new Dono( "Zeus Magnus",7654321);
               
               Bicho b1= new Bicho("Lulu", 2, 2.5, d1);
               Bicho b2= new Bicho("Conan", 1, 9, d3);
               Bicho b3= new Bicho("Zen", 2, 2.5, d1);
               Bicho b4= new Bicho("Stone", 3, 5, d2);
               Bicho b5= new Bicho("Zeus", 1, 6, d3);
               
                 /**
                 * coloque todos bichos no vetor lista por atribição direta conforme exemplo
                 * crie um menu onde seja possivel realizar as seguintes opções
                 * 1- listar todos bichos e suas informações
                 * 2- escrever apenas os bichos que sao gatos
                 * 3- escrever apenas os bichos que sao cahorros
                 * 4- Verificar se um dono tem mais de um bicho usando seu cpf e caso afirmativo escrever o nome dos bichos
                 * 5- Escrever o nome do bicho mais pesado
                 * 6- Escrever o nome do dono que possui mais vogais
                 * 7- Alterar o peso de um bicho localizando-o pelo seu nome
                 * 8- Sair do programa
                 * 
                 * atencao: o usuario pode querer fazer mais d euma opcao cuide para que isto seja possivel
                 */
               
              
              
               
              
}

}