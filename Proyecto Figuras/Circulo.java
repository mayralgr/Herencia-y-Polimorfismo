
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    // instance variables - replace the example below with your own
   private float radio;
   
   public Circulo(float r)
   {
       radio = r;
       
    }
   
   public void calculaArea()
   {
       area = (float )3.1416 * (float)Math.pow(radio,2);
    }
   
   /*public String dimeInfo()
   {
       return "Circulo " + super.dimeInfo();
   }*/
   @Override
   public String toString()
   {
       return "Circulo con àrea =" + super.toString();
    }
  
   @Override 
   public boolean equals(Object obj)
   {
       if(obj instanceof Circulo)
       {
           return this.radio ==((Circulo)obj).radio;
       }
       return false;
   }
    
    
}