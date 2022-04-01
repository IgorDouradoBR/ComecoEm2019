import java.util.Scanner;
/**
 * Write a detecladoription of class Compra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compra
{
    public static String menuInicial()
    {
        Scanner teclado = new Scanner(System.in);
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
        String sabreQuant = Integer.toString(sabreQ);
        System.out.println(" Dart Burger: ");
        int dartQ = teclado.nextInt();
        String dartQuant = Integer.toString(dartQ);
        System.out.println(" Skywalker Burger: ");
        int skyQ = teclado.nextInt();
        String skyQuant = Integer.toString(skyQ);
        System.out.println(" Bauru-Yoda: ");
        int bauruQ = teclado.nextInt();
        String bauruQuant = Integer.toString(bauruQ);
        String opcao = local + sabreQuant + dartQuant + skyQuant + bauruQuant;
        System.out.println(opcao);
        return opcao;
    }

    public static String menuCombo()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Como opções de combo temos:\n pacote de fritas = R$8,00\nE copos de refrigente de:\n300ml=  R$4\n500ml= R$6");
        System.out.println(" Você deseja adicionar algum combo a sua compra? \n[0] = não \n[1] = sim");
        int combo = teclado.nextInt();
        int comboEscolha = 0;
        String comboSouN = "";
        if(combo == 1){
            System.out.println(" digite 0 para prosseguir sem o combo, se você quiser adicionar o combo a sua compra digite 1 \n2-  \n3-copo de refrigente de 500ml");
            System.out.println(" pacote de fritas por mais 8 R$: ");
            int batataC = teclado.nextInt();
            String batataCombo = Integer.toString(batataC);
            System.out.println(" copo de refrigente de 300ml por mais: ");
            int copo300 = teclado.nextInt();
            String copo300Combo = Integer.toString(copo300);
            System.out.println(" copo de refrigente de 500ml: ");
            int copo500 = teclado.nextInt();
            String copo500Combo = Integer.toString(copo500);
            comboSouN =batataCombo+ copo300Combo +  copo500Combo ;

        }

        return comboSouN;
    }

    public static void main(String args[])
    {
        int vendas = (int) Integer.parseInt(menuInicial());
        int local = menuInicial().charAt(0);
        int sabre = menuInicial().charAt(1);
        int dart = menuInicial().charAt(2);
        int sky = menuInicial().charAt(3);
        int bauru = menuInicial().charAt(4);
        int batata = menuCombo().charAt(0);
        int refri300 = menuCombo().charAt(1);
        int refri500 = menuCombo().charAt(2);

        int [] matriz = new int[200];
        int [] filial1 = new int[100];
        int [] filial2 = new int[50];

        int dartP = dart * 38;
        int sabreP = sabre * 32;
        int skyP = sky * 30;
        int bauruP = bauru * 30;
        int batataP = batata * 8;
        int refri300P = refri300 * 6;
        int refri500P = refri500 * 4;
        
        while(true)
        {
            menuInicial();
            menuCombo();
            int total = sabre + dart + sky + bauru;
            if (local == 1)
            {
                for (int i=0; i<total; i++)
                {
                    if(matriz[i]!=0)
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
                for (int i=0; i<total; i++)
                {
                    if(filial1[i]!=0)
                    {
                        filial1[i] = 1;
                        if (filial1[100]!=0){
                            System.out.println(" a loja filial 1 já atingiu seu limite de venda ");
                        }
                    }
                }
                
            }
            if (local == 3)
            {
                for (int i=0; i<total; i++)
                {
                    if(filial2[i]!=0)
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

