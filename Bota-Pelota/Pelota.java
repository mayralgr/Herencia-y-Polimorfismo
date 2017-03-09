import java.awt.Graphics;
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
}
