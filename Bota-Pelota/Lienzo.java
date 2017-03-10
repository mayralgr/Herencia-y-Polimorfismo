import javax.swing.JPanel;
import java.awt.Graphics;
public class Lienzo extends JPanel //implements KeyListener
{
   private Pelota pelota;
   
   public Lienzo()
   {
       pelota=new Pelota(50,100,10);
      
    }
   
   @Override
   public void paintComponent(Graphics g)
   {
     pelota.dibujate(g);  
    }
  
    public void actua()
    {
        pelota.muevete(getBounds());
        repaint();
    }
   
}
   

