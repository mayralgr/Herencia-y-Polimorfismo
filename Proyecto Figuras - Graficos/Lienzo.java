import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    ArrayList <Figura> fig = new ArrayList<Figura>();
    
    public Lienzo()
    {
       Color c=new Color(15,246,45);
       Color t =new Color(45,86,75);
       Color h=new Color(200,150,40);
       Color k =new Color(200,50,125);
       
       
       Triangulo t1 = new Triangulo(50,50,45,50,c);
       Cuadrado c1 = new Cuadrado(100,100,75,t);
       Circulo ci1 = new Circulo(150,150,40,h);
       Rombo r = new Rombo(30,200,40,20,k);
       
       fig.add(t1);
       fig.add(c1);
       fig.add(ci1);
       fig.add(r);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
       Iterator <Figura> it = fig.iterator();
        
        while(it.hasNext())
        {
            Figura fg = it.next();
            fg.dibuja(g);
        }
       
    }
    
    
}
