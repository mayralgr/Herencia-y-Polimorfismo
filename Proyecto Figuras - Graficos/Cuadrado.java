import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
   private float lado;
 
   public Cuadrado(int x, int y, float l, Color c)
   {
      super(x,y,c);
       lado = l;
    }
   
    @Override
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.setColor(super.accedeColor());
       g2.drawRect(super.posx1(),super.posy1(),(int)this.lado,(int)this.lado);
    }
   
}
