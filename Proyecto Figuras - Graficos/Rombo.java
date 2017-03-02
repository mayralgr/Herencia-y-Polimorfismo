import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rombo extends Figura
{
   private float dM;
   private float dm;
   
   public Rombo(int x, int y, float a, float b, Color c)
   {
       super(x,y,c);
       dM = a;
       dm =b;
    }

   
    @Override
    public void dibuja(Graphics g)
   {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(super.accedeColor());
        //g2.fillPolygon(_p_)
        
        g2.drawLine(super.posx1(),super.posy1(),super.posx1()+(int)dm/2,super.posy1()+(int)dM/2);
        
        g2.drawLine(super.posx1()+(int)dm/2,super.posy1()+(int)dM/2,super.posx1(),super.posy1()+(int)dM);
        
        g2.drawLine(super.posx1(),super.posy1()+(int)dM,super.posx1()-(int)dm/2,super.posy1()+(int)dM/2);
        
        g2.drawLine(super.posx1()-(int)dm/2,super.posy1()+(int)dM/2,super.posx1(),super.posy1());
    }
    
}
