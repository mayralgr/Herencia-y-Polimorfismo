import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
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
    int incx;
    int incy;

    /**
     * Constructor for objects of class Pelota
     */
    public Pelota(int x, int y, int r)
    {
        posx=x;
        posy=y;
        radio=r;
        int aleatorio = (int)(Math.random()*2);
        if(aleatorio==0)
        {
            aleatorio=-1;
        }
        incx=10*aleatorio;
        incy=10*aleatorio;
    }
    
    public void dibujate(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(posx,posy,radio*2,radio*2);
        g.setColor(Color.blue);
        g.fillOval (posx,posy,radio*2,radio*2);
    }
    
    public void muevete(Rectangle r)
    {
        posx += incx;
        posy += incy;
        if (posx > r.getWidth()-radio*2 || posx < radio*2)    {
            incx = -incx;
        }
        if (posy > r.getHeight()-radio*2 || posy < radio*2) {
            incy = -incy;
        }
        
    }
}
