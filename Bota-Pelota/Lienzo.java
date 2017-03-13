import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle;
public class Lienzo extends JPanel //implements KeyListener
{
   private LinkedList<Pelota> pelotas;
   
   public Lienzo()
   {
      pelotas = new LinkedList <Pelota>();
      pelotas.add(new Pelota(50,100,10));
      EscuchadorRaton escuchaRaton = new EscuchadorRaton();
      this.addMouseListener(escuchaRaton);
    }
   
   @Override
   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     for(Pelota p : pelotas)
     {
         p.dibujate(g);  
     }
    }
  
    public void actua()
    {
        Rectangle r=getBounds();
         for(Pelota p : pelotas)
         {
             p.muevete(r);
            repaint();
         }
    }
   
    class EscuchadorRaton extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int tamRandom = 10 +(int)(Math.random()*20);
            //System.out.println(e.getX() + ","+ e.getY());
           
            Pelota pelota1=new Pelota(e.getX(),e.getY(),tamRandom);
            pelotas.add(pelota1);
        }
    }
    
}
   

