import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Figura
{
   private int posx;
   private int posy;
   public Figura(int x, int y)
   {
       posx=x;
       posy=y;
    }
    
    protected int posx1()
    {
        return posx;
    }
    
    protected int posy1()
    {
        return posy;
    }
    
    abstract public void dibuja(Graphics g);
}
