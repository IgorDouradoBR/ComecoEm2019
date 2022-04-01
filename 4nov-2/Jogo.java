public class Jogo { 
private String titulo; //atributos
private double valorLocacao;//atributos

public Jogo(String tit, double val) 
{
titulo = tit;
valorLocacao = val;
}

public String getTitulo() { return titulo; }

public double getValorLocacao() { return valorLocacao; }

 
public void setTitulo ( String novo){ titulo=novo;}

public void setvalorLocacao ( double valor){ valorLocacao=valor;}

 
public String toString() 
{ 
return "\n Titulo: "+ titulo+ "\n Valor da locacao: "+ valorLocacao;
}
}
