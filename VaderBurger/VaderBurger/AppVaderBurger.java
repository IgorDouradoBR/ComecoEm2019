
/**
 * Aplicação Vader Burger
 *
 * @author (Igor Vicente, Igor Dourado e Leonardo Machado)
 * @version (21/11/2019)
 */
import java.util.Scanner;
public class AppVaderBurger
{
    public static int menuInicio()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("###########################");
        System.out.println("####### Vader Burger ######");
        System.out.println("###########################\n");
        System.out.println("Informe a opçao desejada: \n");
        System.out.println("[1] Vender");
        System.out.println("[2] Relatorios de vendas");
        int op=sc.nextInt();
        return op;
    }

    public static int menuVenda()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("###########################");
        System.out.println("####### Vader Burger ######");
        System.out.println("###########################\n");
        System.out.println("Informe a opçao desejada: \n");
        System.out.println("[1] Sabre de Luz [R$ 32,00]");
        System.out.println("[2] Dart Burger [R$ 38,00]");
        System.out.println("[3] Skywalker Burger [R$ 30,00]");
        System.out.println("[4] Bauru Yoda [R$ 30,00]");
        System.out.println("[5] Fritas [R$ 8,00]");
        System.out.println("[6] Refrigerante 300ml [R$ 4,00]");
        System.out.println("[7] Refrigerante 500ml [R$ 6,00]");
        System.out.println("[0] Finalizar Compra");
        int op=sc.nextInt();
        return op;
    }

    public static int menuBalanco()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("###########################");
        System.out.println("####### Vader Burger ######");
        System.out.println("###########################\n");
        System.out.println("Informe a opçao desejada: \n");
        System.out.println("[1] Total de vendas de todas as lojas");
        System.out.println("[2] Lanche mais vendido");
        System.out.println("[3] Lanche menos vendido");
        System.out.println("[4] Diferença da arrecadação do lanche mais e menos vendido");
        System.out.println("[5] A venda onde mais lanches foram vendidos para cada loja");
        System.out.println("[6] A venda onde mais lanches foram vendidos dentre todas as lojas");
        System.out.println("[7] Um vetor de 10 posições contendo as somas das 10 maiores vendas, ordenada descrecentemente");
        System.out.println("[0] Voltar");
        int op=sc.nextInt();
        return op;
    }

    public static double[] contVendas(int[][] venda, int posVenda, double[] valores)
    {
        double[] contVendas=new double[10];
        for(int i=0; i<posVenda;i++){
            double valorPedido=0;
            for(int j=1; j<8;j++){
                valorPedido+=venda[i][j]*valores[j-1];
            }
            contVendas[i]=valorPedido;
        }
        return contVendas;
    }

    public static double[] ordenaVendas(double[] contVendas)
    {
        int j, i;
        double valorAtual;
        for(j=1; j <10; j++ ) 
        {
            valorAtual = contVendas[j];
            i = j-1;
            while(i >= 0 && contVendas[i]<valorAtual)
            {
                contVendas[i+1] = contVendas[i];
                i--;
            }
            contVendas[i+1] = valorAtual;
        }
        return contVendas;
    }

    public static int contBurger(int[][] venda, int posVenda, int loja)
    {
        int burger=0;
        for(int i=0; i<posVenda;i++){
            if (venda[i][0]==loja)
            {
                burger+=venda[i][1];
                burger+=venda[i][2];
                burger+=venda[i][3];
                burger+=venda[i][4];
            }
        }
        return burger;
    }

    public static int[] contBurger(int[][] venda, int posVenda)
    {
        int[] burger=new int[4];
        for(int i=0; i<posVenda;i++){
            burger[0]+=venda[i][1];
            burger[1]+=venda[i][2];
            burger[2]+=venda[i][3];
            burger[3]+=venda[i][4];
        }
        return burger;
    }

    public static int[] contBurgerVendas(int[][] venda, int posVenda)
    {
        int[] burgerVendas=new int[posVenda];
        for(int i=0; i<posVenda;i++){
            burgerVendas[i]+=venda[i][1]+venda[i][2]+venda[i][3]+venda[i][4];
        }
        return burgerVendas;
    }

    public static int[] contBurgerVendas(int[][] venda, int posVenda, int loja)
    {
        int[] burgerVendas=new int[posVenda];
        for(int i=0; i<posVenda;i++){
            if(venda[i][0]==loja){
                burgerVendas[i]+=venda[i][1]+venda[i][2]+venda[i][3]+venda[i][4];
            }
        }
        return burgerVendas;
    }

    public static int maisVendido(int[] vet)
    {
        int max=0;
        for(int i=0;  i<vet.length; i++){
            if(vet[i]>max){max=vet[i];}
        }
        return max;
    }

    public static int menosVendido(int[] burger)
    {
        int numBurgerMin=burger[0];
        for(int i=1;  i<burger.length; i++){
            if(burger[i]<numBurgerMin){numBurgerMin=burger[i];}
        }
        return numBurgerMin;
    }

    public static void cupomFiscal(int[][] venda, String[] lojas, int posVenda, String[] produtos, double[] valores)
    {
        double total=0;
        System.out.println("################ Cupom Fiscal ##################");
        System.out.println("###                                          ###");
        System.out.println("### Loja: "+ lojas[venda[posVenda][0]]);
        System.out.println("###                                          ###");
        for(int i=1;  i<8; i++){
            if(venda[posVenda][i]>0)
            {
                int qtd=venda[posVenda][i];
                double valor=valores[i-1];
                String produto=produtos[i-1];
                double subTotal=qtd*valor;
                total+=subTotal;
                System.out.println("### "+qtd+" x "+produto+"(R$"+valor+") -> [ R$"+subTotal+"0 ]");
            }
        }
        System.out.println("################################################");
        System.out.println("###             TOTAL: R$"+ total+"0              ###");
        System.out.println("################################################");
        System.out.println("###       QUE A FORCA ESTEJA COM VOCE!       ###"); 
        System.out.println("################################################");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");

        int[][] venda= new int[200][8];
        int posVenda=0; //primeira posição disponivel no momento no vetor

        String[] produtos={"Sabre De Luz","Dart Burger","Skywalker Burger","Bauru Yoda","Fritas","Refrigerante 300ml","Refrigerante 500ml"};
        String[] lojas={"Matriz","Filial 1","Filial 2"};
        double[] valores= {32,38,30,30,8,4,6};
        while(true)
        {
            int opMenuInicio = menuInicio();
            switch(opMenuInicio)
            {
                case 1:
                System.out.println("\f ");
                int[] pedido= new int[8];
                int opLoja;
                do
                {
                    System.out.println("Qual a Vader Burger da compra?");
                    System.out.println("[0] Matriz");
                    System.out.println("[1] Filial 1");
                    System.out.println("[2] Filial 2");
                    opLoja=sc.nextInt();
                }while(opLoja>2 ||opLoja<0);
                pedido[0]=opLoja;
                int burgesCompras=contBurger(venda,posVenda,pedido[0]);
                int disponivel=0;
                if(pedido[0]==0){disponivel=200-burgesCompras;}
                if(pedido[0]==1){disponivel=100-burgesCompras;}
                if(pedido[0]==2){disponivel=50-burgesCompras;}
                int bPedido=0;
                int opMenuVenda;
                System.out.println("\f ");
                do
                {
                    int acompanhamento=disponivel-bPedido;
                    int qtd=0;
                    System.out.println("Burges disponíveis na loja: " +acompanhamento);
                    System.out.println("Burges do pedido atual: " +bPedido);
                    if(acompanhamento<=0 || bPedido>5){opMenuVenda=0;}
                    else{opMenuVenda=menuVenda();}
                    switch(opMenuVenda)
                    {
                        case 1: System.out.println("Quantidade: ");
                        qtd=sc.nextInt();
                        pedido[1]=qtd;
                        bPedido+=qtd;
                        System.out.println("\f ");
                        break;
                        case 2: System.out.println("Quantidade: ");
                        qtd=sc.nextInt();
                        pedido[2]=qtd;
                        bPedido+=qtd;
                        System.out.println("\f ");
                        break;
                        case 3: System.out.println("Quantidade: ");
                        qtd=sc.nextInt();
                        pedido[3]=qtd;
                        bPedido+=qtd;
                        System.out.println("\f ");
                        break;
                        case 4: System.out.println("Quantidade: ");
                        qtd=sc.nextInt();
                        pedido[4]=qtd;
                        bPedido+=qtd;
                        System.out.println("\f ");
                        break;
                        case 5: System.out.println("Quantidade: ");
                        qtd=sc.nextInt();
                        pedido[5]=qtd;
                        System.out.println("\f ");
                        break;
                        case 6: System.out.println("Quantidade: ");
                        qtd=sc.nextInt();
                        pedido[6]=qtd;
                        System.out.println("\f ");
                        break;
                        case 7: System.out.println("Quantidade ");
                        qtd=sc.nextInt();
                        pedido[7]=qtd;
                        System.out.println("\f ");
                        break;
                        case 0: 
                        int burgesPedido=pedido[1]+pedido[2]+pedido[3]+pedido[4];
                        int somaBurges=burgesCompras+burgesPedido;
                        boolean compra=true;
                        boolean burger5=true;

                        int pedidoGeral=pedido[1]+pedido[2]+pedido[3]+pedido[4]+pedido[5]+pedido[6]+pedido[7];
                        if(pedidoGeral==0)
                        {
                            System.out.println("\f");
                            System.out.println("#################################################");
                            System.out.println("# Nenhum produto selecionado, venda não efetuada #");
                            System.out.println("#################################################\n");
                            break;
                        }

                        if(burgesPedido>5){burger5=false;}

                        if(pedido[0]==0 && somaBurges>200){compra=false;}
                        if(pedido[0]==1 && somaBurges>100){compra=false;}
                        if(pedido[0]==2 && somaBurges>50){compra=false;}

                        if(compra==true && burger5==true){
                            for(int i=0;i<8;i++){
                                venda[posVenda][i]=(pedido[i]);
                            }
                            posVenda++;
                            System.out.println("\f ");
                            System.out.println("################################################");
                            System.out.println("#   Obrigado por comprar na Vader Burger !!!   #");
                            System.out.println("################################################\n");
                            cupomFiscal(venda,lojas,(posVenda-1),produtos, valores);
                            System.out.println("\n");
                            break;
                        }

                        if(compra==false){
                            System.out.println("\f");
                            System.out.println("###################################################");
                            System.out.println("#  Burges induficientes para completar o pedido!  #");
                            System.out.println("   Burges disponíveis na loja: "+ disponivel);
                            System.out.println("   Burges do pedido: "+ burgesPedido);
                            System.out.println("#                                                 #");
                            System.out.println("############  COMPRA NÃO REALIZADA !  #############\n");
                            break;
                        }

                        if(burger5==false){
                            System.out.println("\f");
                            System.out.println("###################################");
                            System.out.println("#  Maximo de burges por pedido: 5 #");
                            System.out.println("   Burges do pedido: "+ burgesPedido);
                            System.out.println("#                                 #");
                            System.out.println("##### COMPRA NÃO REALIZADA !  #####\n");
                            break;
                        }
                    }
                }while(opMenuVenda!=0);
                break;
                case 2: 
                System.out.println("\f ");
                int opBalanco;
                do
                {
                    opBalanco=menuBalanco();
                    switch(opBalanco){
                        case 1: System.out.println("\f ");
                        if(posVenda==0){System.out.println("## Nenhuma venda foi realizada ate o memento\n");}
                        if(posVenda==1){System.out.println("## Ao todo apenas uma venda foi realizada\n");}
                        if(posVenda>1){System.out.println("## Ao todo foram realizadas "+posVenda+" vendas\n");}
                        break;
                        case 2:System.out.println("\f ");
                        if(posVenda>0){
                            int[] burger=new int[4];
                            burger=contBurger(venda, posVenda);
                            int numBurgerMax=maisVendido(burger);
                            System.out.println("## Lanche(s) mais vendido(s):");
                            for(int i=0;  i<burger.length; i++){
                                if(burger[i]==numBurgerMax)
                                {
                                    if(i==0){System.out.println("+ Sabre De Luz");}
                                    if(i==1){System.out.println("+ Dart Burger");}
                                    if(i==2){System.out.println("+ Skywalker Burger");}
                                    if(i==3){System.out.println("+ Bauru Yoda");}
                                }
                            }
                            System.out.println("## Numero de vendas(cada): "+numBurgerMax+"\n");
                        }else{System.out.println("## Nenhuma venda foi realizada ate o memento\n");}
                        break;
                        case 3: System.out.println("\f ");
                        if(posVenda>0){
                            int[] burger=new int[4];
                            burger=contBurger(venda, posVenda);
                            int numBurgerMin=menosVendido(burger);
                            System.out.println("## Lanche(s) menos vendido(s):");
                            for(int i=0;  i<burger.length; i++){
                                if(burger[i]==numBurgerMin)
                                {
                                    if(i==0){System.out.println("- Sabre De Luz");}
                                    if(i==1){System.out.println("- Dart Burger");}
                                    if(i==2){System.out.println("- Skywalker Burger");}
                                    if(i==3){System.out.println("- Bauru Yoda");}
                                }
                            }
                            System.out.println("## Numero de vendas(cada): "+numBurgerMin+"\n");
                        }else{System.out.println("## Nenhuma venda foi realizada ate o memento\n");}
                        break;
                        case 4: System.out.println("\f ");
                        if(posVenda>0){
                            int[] burger= contBurger(venda, posVenda);
                            int numBurgerMax=maisVendido(burger);
                            int numBurgerMin=menosVendido(burger);
                            System.out.println("## Diferença da arrecadação do(s) lanche(s) mais e menos vendido(s)");
                            for(int i=0;  i<burger.length; i++){
                                for(int j=0;  j<burger.length; j++){
                                    if(burger[i]==numBurgerMax){
                                        if(burger[j]==numBurgerMin){
                                            double min=numBurgerMin*valores[j];
                                            double max=numBurgerMax*valores[i];
                                            System.out.println(numBurgerMax+" x "+produtos[i]+"(R$"+valores[i]+"0) = R$"+max+"0");
                                            System.out.println(numBurgerMin+" x "+produtos[j]+"(R$"+valores[j]+"0) = R$"+min+"0");
                                            System.out.println("R$ "+max+"0 - R$"+min+"0 = R$"+(max-min)+"0\n");
                                        }
                                    }
                                }
                            }
                            System.out.println("\n");
                        }else{System.out.println("## Nenhuma venda foi realizada ate o memento\n");}
                        break;
                        case 5:System.out.println("\f ");//A venda onde mais lanches foram vendidos para cada loja
                        if(posVenda==0){System.out.println("## Nenhuma venda foi realizada ate o memento");
                        }else{
                            for(int k=0; k<lojas.length; k++){
                                int[] burgerVendas= contBurgerVendas(venda, posVenda, k);
                                int numBurgerMax=maisVendido(burgerVendas);
                                System.out.println("");
                                System.out.println("## A(s) venda(s) com mais lanches da loja "+lojas[k]+" teve " + numBurgerMax+" lanche(s)");
                                for(int i=0; i<posVenda;i++){
                                    int numVenda=venda[i][1]+venda[i][2]+venda[i][3]+venda[i][4]+venda[i][5]+venda[i][6]+venda[i][7];
                                    if(numVenda>0){
                                        int lanches=venda[i][1]+venda[i][2]+venda[i][3]+venda[i][4];
                                        if(lanches==numBurgerMax && venda[i][0]==k){
                                            double total=0;
                                            System.out.println("");
                                            for(int j=1;j<8;j++){
                                                if(venda[i][j]!=0){
                                                    double cont=venda[i][j]*valores[j-1];
                                                    System.out.println("# "+venda[i][j]+"x "+produtos[j-1]+"(R$"+valores[j-1]+"0) -> [ R$"+cont+"0 ]");
                                                    total+=cont;
                                                }
                                            }
                                            System.out.println("#");
                                            System.out.println("############################ TOTAL: R$"+total+"0");
                                        }}
                                }
                            }
                        }
                        System.out.println("\n");
                        break;
                        case 6:System.out.println("\f ");//A venda onde mais lanches foram vendidos dentre todas loja
                        if(posVenda==0){System.out.println("## Nenhuma venda foi realizada ate o memento");
                        }else{
                            int[] burgerVendas= contBurgerVendas(venda, posVenda);
                            int numBurgerMax=maisVendido(burgerVendas);
                            for(int i=0; i<posVenda;i++){
                                if((venda[i][1]+venda[i][2]+venda[i][3]+venda[i][4])==numBurgerMax){
                                    System.out.println("## A venda com mais laches dentre todas as lojas teve "+numBurgerMax+ " lanches:");
                                    System.out.println("Loja: "+lojas[venda[i][0]]);
                                    double total=0;
                                    for(int j=1;j<8;j++){
                                        if(venda[i][j]!=0){
                                            double cont=venda[i][j]*valores[j-1];
                                            System.out.println("# "+venda[i][j]+"x "+produtos[j-1]+"(R$"+valores[j-1]+"0) -> [ R$"+cont+"0 ]");
                                            total+=cont;
                                        }
                                    }
                                    System.out.println("#");
                                    System.out.println("############################ TOTAL: R$"+total+"0");
                                }
                            }
                        }
                        System.out.println("\n ");
                        break;
                        case 7:System.out.println("\f ");
                        double[] ordemVendas=ordenaVendas(contVendas(venda,posVenda,valores));
                        System.out.println("## Valores das 10 maiores vendas: ");
                        for(int i=0;i<10;i++){
                            System.out.println((i+1)+"° - R$"+ordemVendas[i]);
                        }
                        System.out.println("\n ");
                        break;
                        case 0:System.out.println("\f ");break;
                    }
                }while(opBalanco!=0);
                default: break;
            }
        }
    }
}