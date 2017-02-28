import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    // instance variables - replace the example below with your own
   private float base;
   private float altura;
   
   public Triangulo(int x, int y, float b, float a)
   {
       base = b;
       altura = a;
       
    }
   
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawLine(this.posx,this.posy,this.posx+b,this.posy);//base
       g2.drawLine(this.posx,this.posy,(this.posx+b)/2,this.posy+a);//lado 1
       g2.drawLine(this.posx+b,this.posy,(this.posx+b)/2,this.posy+a);//lado 2
    }
}