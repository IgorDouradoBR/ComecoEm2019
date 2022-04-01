public class Triangulo//classe base
{

    //atributos desta classe onde irei guardar as informações de cada objeto criado. Ou seja, os valores a serem atribuidos a estas variaveis
    private double base, ladoA, ladoB, altura;
    private String tipoT;

    //metodo construtor com regramento para instanciar (criar) um objeto **este e com uso de parametro 
    public Triangulo(double base, double ladoA, double ladoB, double altura)
    {
        this.base=base;
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.altura=altura;
    }
    //getters ***metodos de acesso ao conteudo dos atributos do objeto (valor)
    public double getbase()
    {
        return base;
    }

    public double getladoA()
    {
        return ladoA;
    }

    public double getladoB()
    {
        return ladoB;
    }

    public double getAltura()
    {
        return ladoB;
    }
    //metodos de modificao ***** setters *******

    public void setBase(double base)
    {
        this.base=base;
    }

    public void setLadoA(double ladoA)
    {
        this.ladoA=ladoA;
    }

    public void setLadoB(double ladoB)
    {
        this.ladoB=ladoB;
    }

    public void setAltura(double Altura)
    {
        this.ladoB=ladoB;
    }
    //outros metodos 
    public double areaT()
    {//retorna a area do triangulo
        return (base*altura)/2;
    }

    public double perimetroT() 
    {//retorna o perimetro
        double aux= base+ladoA+ladoB;
        return aux;    
    }

    public String tipo(){
        if((base+ladoA>=ladoB) && (base+ladoB>=ladoA) && (ladoA+ladoB>=base)){
            if(base == ladoA && base == ladoB){
                tipoT = "Triangulo equilatero.";
            }
            else if((base == ladoA) || (base == ladoB) || (ladoA == ladoB)){
                tipoT = "Triangulo isosceles.";
            }
            else{
                tipoT = "Triangulo escaleno.";
            }
        }

        else{
            tipoT = "Nao forma triangulo.";
        }
        return tipoT;
    }

    // metodo  to String para escrever todos atributos com formtacao 

    public String toString()
    {

        String aux= "\n Medidas do triangulo \n area= "+ areaT()+ "\n Perimetro="+ perimetroT()+ "\n tipo de triângulo: " + tipo() ;
        return aux;

    }
}
