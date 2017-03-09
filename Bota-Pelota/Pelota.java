import java.awt.Graphics;
import java.awt.Rectangle;
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota
{
    // instance variables - replace the example below with your own
    private int posx;
    private int posy;
    private int radio;
    int mx=1;
    int my=1;

    /**
     * Constructor for objects of class Pelota
     */
    public Pelota(int x, int y, int r)
    {
        posx=x;
        posy=y;
        radio=r;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx,posy,radio*2,radio*2);
    }
    
    public void muevete(Rectangle r)
    {
        //System.out.println("Mueve pelota..."); 
        //System.out.println("Tamaño de la ventana: " + r.getWidth() + ", " + r.getHeight());
        
        if(posx-radio<=0)
        {
            System.out.println("1");
            mx*=-1;
            if(posy-radio<=0)
            {
                my*=-1;
                System.out.println("1.1");
            }
        }
        else if(posx+radio>=r.getWidth())
        {
            System.out.println("2");
            mx*=-1;
            if(posy+radio>=r.getHeight())
            {
                System.out.println("2.2");
                my*=1;
            }
        }else if(posy-radio<=0)
        {
            System.out.println("3");
            my*=-1;
            if(posx-radio<=0)
            {
                System.out.println("3.1");
                mx*=-1;
            }
        }
        else if(posy+radio>=r.getHeight())
        {
            my*=-1;
            if(posx+radio>=r.getWidth())
            {
                mx*=-1;
            }
            System.out.println("4");
        }
        posx+=mx;
        posy+=my;
    }
}
