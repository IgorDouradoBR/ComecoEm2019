import java.util.Scanner;
public class App {

public void executa(){
Jogo v1, v2, v3;
System.out.println ("\f");
v1 = new Jogo("Space", 14.50);
System.out.println (v1);
v2 = new Jogo("Hitman", 16.50);
System.out.println (v2);
v3 = new Jogo("Star", 11.50);
System.out.println (v3);
v1 = new Jogo("Alliens",18.50);
System.out.println ("\n novo new para v1: "+ v1);
v3 = v2;
System.out.println ("\n situaco de v3 apos v3=v2:" + v3);
v1 = v3;
System.out.println ("\n situaco de v1 apos v1=v3:" + v1);
v2 = new Jogo("Winner", 20);
System.out.println ("\n novo new para v2: "+ v2);
String nome = v1.getTitulo();
System.out.println ("\n Titulo armazenado ao final= "+ nome);
double valor = v3.getValorLocacao();
System.out.println ("\n Valor da locacao ao final= "+ valor);
System.out.println("\n"+v1+v2+v3);
}
}