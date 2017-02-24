import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args)
    {
        ArrayList <Figura> fig = new ArrayList<Figura>();
      
        /*Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(5);
        Circulo ci1 = new Circulo(3);
        
        fig.add(t1);
        fig.add(c1);
        fig.add(ci1);
        
        Iterator <Figura> it = fig.iterator();
        
        while(it.hasNext())
        {
            Figura g = it.next();
            g.calculaArea();
        }
       
        Iterator <Figura> ite = fig.iterator();
        while(ite.hasNext())
        {
            Figura g = ite.next();
            System.out.println(g);
        }*/
        
        Circulo c1 = new Circulo(3);
        Circulo c2 = new Circulo(3);
        Triangulo t1 = new Triangulo(4,5);
        
        if(c1.equals(t1))
        {
            System.out.println("Iguales");
        }
        else
        {
            System.out.println("Diferentes");
        }

    }
}
