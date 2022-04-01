 
/**
 * PetShop
 * @author (Igor Vicente)
 * @version (30/10/2019)
 */
import java.util.Scanner;
public class AppPetShop
{
   public static int menuVeterinario()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("\f####################");
       System.out.println(" ##     PETSHOP    ##");
       System.out.println(" ####################");
       System.out.println(" [1] Cadastrar dono");
       System.out.println(" [2] Cadastrar pet");
       System.out.println(" [3] Gerar Relatorios");
       System.out.println("\nInforme a opcao desejada: ");
       int op= sc.nextInt();
       return op;
   }
   
   public static int menuRelatorios()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println(" #######################");
       System.out.println(" ##     RELATORIOS    ##");
       System.out.println(" #######################");
       System.out.println(" [1] Quantidade de Gatos");
       System.out.println(" [2] Quantidade de Cães");
       System.out.println(" [3] Peso medio dos pets");
       System.out.println(" [4] Gato mais gordo");
       System.out.println(" [5] Cão de maior nome");
       System.out.println(" [6] Listagem dos Clientes");
       System.out.println(" [7] Listagem dos Pets");
       System.out.println(" [0] Voltar");
       System.out.println("\nInforme a opcao desejada: ");
       int op= sc.nextInt();
       return op;
   }
   
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("\f");
       int numCliente=15;
       int numBicho=15;
       int posCliente=0;
       int posBicho=0;
       Cliente[] cliente=new Cliente[numCliente];
       
       Bicho[] bicho=new Bicho[numBicho];
       while(true){
           switch(menuVeterinario())
           {
               
               case 1: if(posCliente<cliente.length)
                       {
                           System.out.println("\f#######################");
                           System.out.println(" ##  CADASTRO CLIENTE ##");
                           System.out.println(" #######################\n");
                           System.out.print("Nome: ");
                           String nome=sc.next();
                           System.out.print("CPF: ");
                           long cpf=sc.nextLong();
                           cliente[posCliente]=new Cliente(nome,cpf,"");
                           posCliente++;
                           break;
                       }
                       
               case 2: if(posBicho<bicho.length)
                       {
                           System.out.println("\f#######################");
                           System.out.println(" ##    CADASTRO PET   ##");
                           System.out.println(" #######################\n");
                           System.out.print("Nome: ");
                           String nome=sc.next();
                           int tipo=0;
                           do{
                               System.out.println("Tipo: \n[1] Gato\n[2] Cachorro\n[3] Outro pet");
                               tipo=sc.nextInt();
                           }while(tipo<1||tipo>3);
                           double peso=0;
                           do{
                               System.out.print("Peso (em kg):");
                               peso=sc.nextDouble();
                           }while(peso<0);
                           boolean findDono=false;
                           Cliente c=null;
                           do{
                               System.out.print("CPF do dono:");
                               long cpf=sc.nextLong();
                               for(int i=0;i<cliente.length;i++){
                                   if(cliente[i]!=null && cliente[i].getCpf()==cpf){
                                       c=cliente[i];
                                       findDono=true;
                                   }
                               }
                               if(findDono==false){System.out.println("Dono nao encontrado, tente novamente. ");}
                           }while(findDono==false);
                           bicho[posBicho]=new Bicho(nome,tipo,peso,c);
                           c.setPet((bicho[posBicho]).getNome()+" ; "+c.getPet());
                           posBicho++;
                           break;
                       }
                       
               case 3: while(true)
                       {
                           int op=menuRelatorios();
                           if (op==0){break;}
                           switch(op)
                           {
                               case 1: System.out.println("\f#### Qtd de Gatos #######");
                                       int contG=0;
                                       for(int i=0; i<bicho.length;i++)
                                       {
                                           if(bicho[i]!=null&&bicho[i].getTipo()==1){
                                               contG++;
                                            }
                                       }
                                       if(contG==0){System.out.println("Nao ha gatos cadastrados no sistema.");}
                                       else if(contG==1){System.out.println("Ha 1 gato cadastrado no sistema.");}
                                       else{System.out.println("Ha "+contG+" gatos cadastrados no sistema.");}
                                       break;
                               case 2: System.out.println("\f#### Qtd de Cães #######");
                                       int contC=0;
                                       for(int i=0; i<bicho.length;i++)
                                       {
                                           if(bicho[i]!=null&&bicho[i].getTipo()==2){
                                               contC++;
                                            }
                                       }
                                       if(contC==0){System.out.println("Nao ha caes cadastrados no sistema.");}
                                       else if(contC==1){System.out.println("Ha 1 cao cadastrado no sistema.");}
                                       else{System.out.println("Ha "+contC+" cães cadastrados no sistema.");}
                                       break;
                               case 3: System.out.println("\f#### Peso medio dos Pets #######");
                                       int contP=0;
                                       double pesoP=0;
                                       for(int i=0; i<bicho.length;i++)
                                       {
                                           if(bicho[i]!=null){
                                               pesoP+=bicho[i].getPeso();
                                               contP++;
                                            }
                                       }
                                       double mediaP=pesoP/contP;
                                       if(contP==0){System.out.println("Nao ha pets cadastrados no sistema.");}
                                       else{System.out.println("A media de peso dos pets cadastrados no sistema é "+mediaP+" kg.");}
                                       break;
                               case 4: System.out.println("\f#### Gato mais gordo #######");
                                       double gGordo=0;
                                       int contB=0;
                                       for(int i=0; i<bicho.length;i++)
                                       {
                                           if(bicho[i]!=null&&bicho[i].getTipo()==1){
                                               contB++;
                                               if(bicho[i].getPeso()>gGordo){
                                                   gGordo=bicho[i].getPeso();
                                               }
                                           }
                                       }
                                       if(contB==0){System.out.println("Nao ha gatos cadastrados no sistema.");}
                                       else{System.out.println("O gato mais gordo cadastrado no sistema pesa "+gGordo+"kg");
                                           for(int i=0; i<bicho.length;i++)
                                           {
                                               if(bicho[i]!=null&&bicho[i].getTipo()==1){
                                                   if(bicho[i].getPeso()==gGordo){
                                                       System.out.println(" * "+bicho[i].getNome());
                                                   }
                                               }
                                            }
                                        }
                                       break;
                               case 5: System.out.println("\f#### Cao de maior nome #######");
                                       int cNome=0;
                                       int contCao=0;
                                       for(int i=0; i<bicho.length;i++)
                                       {
                                           if(bicho[i]!=null&&bicho[i].getTipo()==2){
                                               contCao++;
                                               if((bicho[i].getNome()).length()>cNome){
                                                   cNome=(bicho[i].getNome()).length();
                                               }
                                           }
                                       }
                                       if(contCao==0){System.out.println("Não ha cães cadastrados no sistema.");}
                                       else{System.out.println("O cão de maior nome cadastrado no sistema possui "+cNome+ " letras:");
                                           for(int i=0; i<bicho.length;i++)
                                           {
                                               if(bicho[i]!=null&&bicho[i].getTipo()==2){
                                                   if((bicho[i].getNome()).length()==cNome){
                                                       System.out.println(" * "+bicho[i].getNome());
                                                   }
                                               }
                                            }
                                        }
                                       break;
                               case 6: System.out.println("\f####### CLIENTES #######");
                                       int contadorClientes=0;
                                       for(int i=0; i<cliente.length;i++)
                                       {
                                           if(cliente[i]!=null){System.out.println((i+1)+" - "+cliente[i].toString());contadorClientes++;}
                                       }
                                       if(contadorClientes==0){System.out.println("Nao ha clientes cadastrados no sistema");}
                                       break;
                               case 7: System.out.println("\f######## PETS #########");
                                       int contadorPets=0;
                                       for(int i=0; i<bicho.length;i++)
                                       {
                                           if(bicho[i]!=null){System.out.println("#######################"+
                                                                                 "\n "+bicho[i].toString());contadorPets++;}
                                       }
                                       if(contadorPets==0){System.out.println("Nao ha caes cadastrados no sistema");}
                                       break;
                           }
                       }
           } 
       }
   }
}