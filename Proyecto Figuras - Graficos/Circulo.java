import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
   
   public Circulo(int x, int y, float r, Color c)
   {
       super(x,y,c);
       radio = r;
    }

   
    @Override
    public void dibuja(Graphics g)
   {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(super.accedeColor());
        g2.fillOval(super.posx1(),super.posy1(),(int)this.radio,(int)this.radio);
        g2.drawOval(super.posx1(),super.posy1(),(int)this.radio,(int)this.radio);
    }
      
}