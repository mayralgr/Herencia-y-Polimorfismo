import java.util.Iterator;
import java.util.ArrayList;
/**
 * Write a description of interface Utileria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Utileria 
{
    public static float calculaPromedio(Medible coleccion[])
    {
       float s=0;
       for(Medible m : coleccion)
       {
            s+=(float)m.obtenerMedida();
       }
       if(coleccion.length>0)
       {
           return s/coleccion.length;
       }
       else
       {
           return 0;
        }
    }

}
