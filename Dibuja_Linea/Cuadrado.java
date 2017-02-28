import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
   private float lado;
 
   public Cuadrado(int x, int y, float l)
   {
       super.accedePosx(x);
       super.accedePosy(y);
       lado = l;
    }
   
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawRect(super.posx1(),super.posy1(),(int)this.lado,(int)this.lado);
    }
   
}
