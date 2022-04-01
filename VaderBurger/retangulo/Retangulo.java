
/**
 * Write a description of class Retangulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Retangulo
{
    double base;
    double altura;

    Retangulo(double base, double altura)
    {
        this.base=base;
        this.altura=altura;

    }

    public Double getBase(){return base;}

    public Double getAltura(){return altura;}

    public void setBase(double base){
        this.base=base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public String toString()
    {
        double diagonal = Math.sqrt((getBase()* getBase()) + (getAltura() * getAltura()));
        return("base: " + getBase()+"\nperimetro: " + getAltura() + "\ndiagonal do retângulo: " + diagonal );
    }
}
