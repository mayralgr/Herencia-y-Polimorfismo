import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
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
       super(x,y);
       base = b;
       altura = a;
    }

   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       
       g2.drawLine(super.posx1(),super.posy1(),super.posx1()+(int)base,super.posy1());//base
       g2.drawLine(super.posx1(),super.posy1(),(super.posx1()+(int)base)/2,super.posy1()+(int)altura);//lado 1
       g2.drawLine(super.posx1()+(int)base,super.posy1(),(super.posx1()+(int)base)/2,super.posy1()+(int)altura);//lado 2
    }
}