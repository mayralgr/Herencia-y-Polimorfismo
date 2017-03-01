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
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        //g2.drawString("Hola Mundo",100, 200);
        /*g2.drawRect(50,30,20,40);
        g2.drawLine(60,200,100,90);
        g2.drawOval(100, 100, 20,20);
        */
       Triangulo t1 = new Triangulo(50,50,45,50);
       Cuadrado c1 = new Cuadrado(100,100,75);
       Circulo ci1 = new Circulo(150,150,40);
       
       fig.add(t1);
       fig.add(c1);
       fig.add(ci1);
       
       Iterator <Figura> it = fig.iterator();
        
        while(it.hasNext())
        {
            Figura fg = it.next();
            fg.dibuja(g2);
        }
       
    }
    
    
}
