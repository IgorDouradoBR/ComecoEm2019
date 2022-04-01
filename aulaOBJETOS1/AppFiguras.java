import java.util.*;
public class AppFiguras
{
    //organizando nossa biblioteca para poder usar      
    
    
    public static void main(String [] args){
        Scanner teclado=new Scanner (System.in);
        // (1)Scanner teclado;***variavel de objeto ou seja o conteudo e um objeto
        // (2) teclado=new Scanner (System.in);
        System.out.println ("\f");
        
        AreasPlanas calculo1;// crio uma variavel de objeto
        calculo1= new  AreasPlanas ();//instancio um objeto da classe AreasPlanas
        // AreasPlanas calculo1= new  AreasPlanas ();
        
        VolumeSolidos calculo2; // crio uma variavel de objeto
        calculo2= new  VolumeSolidos();//instancio um objeto da classe 
        
        AreasLateraisSolido calculo3;// crio uma variavel de objeto
        calculo3= new AreasLateraisSolido();//instancio um objeto da classe AreasLateraisSolido 
        
        //  menu principal**** exemplo de possibilidade
	
		int opcao = 0;
		do {
			System.out.println("\n\n### Escolha de calculos que deseja fazer ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |   1 - area quadrado    |");
			System.out.println("                  |   2 - volume esfera    |");
			System.out.println("                  |   3 - lateral cilindro |");
			System.out.println("                  |   0 - sair             |");
			System.out.println("                  =========================\n");
			opcao = teclado.nextInt();
			

			switch (opcao) {
			case 1:
				{ System.out.println ("\n Digite medida do lado do quadrado");
				 double lado=teclado.nextDouble();
				 System.out.println ("\n A medida  da area eh igual a= "+ calculo1.areaQuadrado(lado));
								};break;
			case 2:
				{ System.out.println ("\n Digite medida do raio da esfera");
				 double raio=teclado.nextDouble();
				 System.out.println ("\n A medida  do volume da esfera eh igual a= "+ calculo2.volumeEsfera(raio));
								};break;
                       
			case 3:
				{ System.out.println ("\n Digite medida do raio da base do cilindro");
				 double raio=teclado.nextDouble();
				 System.out.println ("\n Digite medida da altura do cilindro");
				 double altura=teclado.nextDouble();
				 System.out.println ("\n A medida  da area lateral do cilindro  eh igual a= "+ calculo3.areaLCilindro(raio, altura));
								};break;
			case 0:
			     System.out.println("Tchau!");
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
		} while (opcao != 0);
	}
        
        
        
    }

