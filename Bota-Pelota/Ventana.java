import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    private Timer tiempo;
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho, alto);
        dibujo = new Lienzo();
        //dibujo.addKeyListener(dibujo);
        this.add(dibujo);
        EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        tiempo = new Timer(100, escuchaTiempo);
        tiempo.start();
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);

    }
     class EscuchadorTiempo implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
          // pelota.muevete(getBounds());
          // repaint();
          dibujo.actua();
       }
    }
    class EscuchadorTeclado implements KeyListener
   {
    
   @Override
   public void keyPressed(KeyEvent e)
   {
       //System.out.println("key pressed.."+ e.getKeyChar());
       if( e.getKeyChar()=='d')
       {
           //detener time
           tiempo.stop();
       }
       else if ( e.getKeyChar()=='i')
       {
           tiempo.start();
        }
    }
    
   @Override
   public void keyReleased(KeyEvent e)
   {
       //System.out.println("key Released.."+ e.getKeyChar());
    }
    
  
   @Override
   public void keyTyped(KeyEvent e)
   {
       //System.out.println("key Type.."+ e.getKeyChar());
    }
   }
   
   class EscuchadorRaton implements MouseListener
   {
       @Override
       public void mouseClicked(MouseEvent e)
       {
           if(e.getClickCount()==1)
           {
               tiempo.stop();

           }
           else if(e.getClickCount()==2)
           {
               tiempo.start();
            }
          
        }
       
       @Override
       public void mouseEntered(MouseEvent e)
       {
           
        }
       
       @Override
       public void mouseExited(MouseEvent e)
       {
        }
        
        @Override
       public void mousePressed(MouseEvent e)
       {
        }
        
        @Override
        public void mouseReleased(MouseEvent e)
        {
        }
    }
}
