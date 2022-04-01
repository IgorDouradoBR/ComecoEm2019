import java.util.Scanner;
/**
 * Write a detecladoription of class Compra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class asd
{
    public static String menuInicial()
    {
        Scanner teclado = new Scanner(System.in);
        String comboSabre = "";
        String comboDart = "";
        String comboSky = "";
        String comboBauru = "";
        System.out.println("\f= = = = = = = = = = = = = = = = = = = =");
        System.out.println(" || BEM=VINDO À HAMBURGUERIA DOS PADAWAN ||");
        System.out.println(" = = = = = = = = = = == = = = = = = = = = =");
        System.out.println(" digite qual das nossas lojas você está comprando: \n1- matriz\n2- filial 1\n3- filial 2");
        int local1 = teclado.nextInt();
        String local = Integer.toString(local1);
        System.out.println(" Como opções de lanches temos: \n1 - SabreDeLuz = R$ 32,00 \n2 – Dart Burger = R$ 38,00 \n3 – Skywalker Burger = R$ 30,00 \n4 – Bauru-Yoda= R$ 30,00");
        System.out.println(" Digite quantidade de cada lanche que você deseja sabendo que produzimos apenas 5 unidades de cada lanche por vez: ");
        System.out.println(" Sabre De luz: ");
        int sabreQ = teclado.nextInt();
        if(sabreQ>0 && sabreQ<=5)
        {
            System.out.println(" deseja combo para esse lanche: \ndigite 0 para NÃO\ndigite 1 para SIM: ");
            int SouN = teclado.nextInt();
            int preco = 0;
            if(SouN==1){
                System.out.println(" qual combo você deseja : \n[1] pacote de fritas por mais 8 R$\n[2]copo de refrigente de 300ml por mais 4 R$\n[3]copo de refrigente de 500ml por mais 6 R$: ");
                int opcaoC = teclado.nextInt();
                if (opcaoC ==1){ preco = 4; }
                if (opcaoC ==2){ preco = 6; }
                if (opcaoC ==3){ preco = 8; }
                String opcaoStr = Integer.toString(preco);
                comboSabre= opcaoStr;
            }
            else{
                comboSabre= "0";
            }

        }
        String sabreQuant = Integer.toString(sabreQ);
        System.out.println(" Dart Burger: ");
        int dartQ = teclado.nextInt();
        if(dartQ>0 && dartQ<=5)
        {
            System.out.println(" deseja combo para esse lanche: \ndigite 0 para NÃO\ndigite 1 para SIM: ");
            int SouN = teclado.nextInt();
            int preco = 0;
            if(SouN==1){
                System.out.println(" qual combo você deseja : \n[1] pacote de fritas por mais 8 R$\n[2]copo de refrigente de 300ml por mais 4 R$\n[3]copo de refrigente de 500ml por mais 6 R$: ");
                int opcaoC = teclado.nextInt();
                if (opcaoC ==1){ preco = 4; }
                if (opcaoC ==2){ preco = 6; }
                if (opcaoC ==3){ preco = 8; }
                String opcaoStr = Integer.toString(preco);
                comboDart= opcaoStr;
            }
            else{
                comboDart= "0";
            }

        }
        String dartQuant = Integer.toString(dartQ);
        System.out.println(" Skywalker Burger: ");
        int skyQ = teclado.nextInt();
        if(skyQ>0 && skyQ<=5)
        {
            System.out.println(" deseja combo para esse lanche: \ndigite 0 para NÃO\ndigite 1 para SIM: ");
            int SouN = teclado.nextInt();
            int preco = 0;
            if(SouN==1){
                System.out.println(" qual combo você deseja : \n[1] pacote de fritas por mais 8 R$\n[2]copo de refrigente de 300ml por mais 4 R$\n[3]copo de refrigente de 500ml por mais 6 R$: ");
                int opcaoC = teclado.nextInt();
                if (opcaoC ==1){ preco = 4; }
                if (opcaoC ==2){ preco = 6; }
                if (opcaoC ==3){ preco = 8; }
                String opcaoStr = Integer.toString(preco);
                comboSky= opcaoStr;
            }
            else{
                comboSky= "0";
            }

        }
        String skyQuant = Integer.toString(skyQ);
        System.out.println(" Bauru-Yoda: ");
        int bauruQ = teclado.nextInt();
        if(bauruQ>0 && bauruQ<=5)
        {
            System.out.println(" deseja combo para esse lanche: \ndigite 0 para NÃO\ndigite 1 para SIM: ");
            int SouN = teclado.nextInt();
            int preco = 0;
            if(SouN==1){
                System.out.println(" qual combo você deseja : \n[1] pacote de fritas por mais 8 R$\n[2]copo de refrigente de 300ml por mais 4 R$\n[3]copo de refrigente de 500ml por mais 6 R$: ");
                int opcaoC = teclado.nextInt();
                if (opcaoC ==1){ preco = 4; }
                if (opcaoC ==2){ preco = 6; }
                if (opcaoC ==3){ preco = 8; }
                String opcaoStr = Integer.toString(preco);
                comboBauru= opcaoStr;
            }
            else{
                comboBauru= "0";
            }

        }
        String bauruQuant = Integer.toString(bauruQ);
        String opcao = local + sabreQuant + comboSabre + dartQuant + comboDart + skyQuant + comboSky + bauruQuant + comboBauru;
        System.out.println(opcao);
        return opcao;
    }

    public static int menuRelatorios()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Seja bem-vindo à contabilidade da estrela da morte senhor vader, o que deseja saber: ");
        System.out.println(" [1] Total de vendas de todas as lojas");
        System.out.println(" [2] Lanche mais vendido");
        System.out.println(" [3] Lanche menos vendido");
        System.out.println(" [4] Diferença da arrecadação do lanche mais e menos vendido");
        System.out.println(" [5] A venda onde mais lanches foram vendidos para cada loja");
        System.out.println(" [6] A venda onde mais lanches foram vendidos dentre todas as lojas");
        System.out.println(" [7] as somas das 10 maiores vendas, ordenada descrecentemente");
        System.out.println(" [0] Voltar");
        System.out.println("\nInforme a opcao desejada: ");
        int op= sc.nextInt();
        return op;
    }

    public static void main(String args[])
    {

        int local = menuInicial().charAt(0);
        int sabre = menuInicial().charAt(1);
        int dart = menuInicial().charAt(3);
        int sky = menuInicial().charAt(5);
        int bauru = menuInicial().charAt(7);
        int comboSabre = menuInicial().charAt(2);
        int comboDart = menuInicial().charAt(4);
        int comboSky = menuInicial().charAt(6);
        int comboBauru = menuInicial().charAt(8);

        int [] matriz = new int[200];
        int [] filial1 = new int[100];
        int [] filial2 = new int[50];
        int [] vendas = new int [200];

        int dartP = dart * 38;
        int sabreP = sabre * 32;
        int skyP = sky * 30;
        int bauruP = bauru * 30;

        while(true)
        {
            menuInicial();
            int total = sabre + dart + sky + bauru;
            int precoTotal= dartP + sabreP +  skyP + bauruP + comboSabre + comboDart + comboSky + comboBauru;
            if (local == 1)
            {
                for (int i=0; i<total; i++)
                {
                    if(matriz[i]==0)
                    {
                        matriz [i] = 1;
                        if (matriz[200]!=0){
                            System.out.println(" a loja matriz já atingiu seu limite de venda ");
                        }
                    }
                }

            }
            if (local == 2)
            {
                for (int i=0; i<filial1.length; i++)
                {
                    for (int j=0; j<total+filial1[i]; i++)
                    if(filial1[i]==0)
                    {
                        filial1[i] = 1;
                        if (filial1[100]!=0){
                            System.out.println(" a loja filial 1 já atingiu seu limite de venda ");
                        }
                    }
                }
                }

            }
            if (local == 3)
            {
                for (int i=0; i<total; i++)
                {
                    for (int j = 0; j< 
                    if(filial2[i]==0)
                    {
                        filial2[i] = 1;
                        if (filial2[50]!=0){
                            System.out.println(" a loja filial 2 já atingiu seu limite de venda ");
                        }
                    }
                }

            }

        }
    }
}

