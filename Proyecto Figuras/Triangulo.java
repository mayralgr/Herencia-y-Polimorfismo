
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    // instance variables - replace the example below with your own
   private float base;
   private float altura;
   
   public Triangulo(float b, float a)
   {
       base = b;
       altura = a;
       
    }
   
   public void calculaArea()
   {
       area = base * altura/2;
    }
    
   /*public String dimeInfo()
   {
       return "Triangulo " + super.dimeInfo();
   }*/
   
   @Override
   public String toString()
   {
       return "Triangulo con àrea =" + super.toString();
    }
}
