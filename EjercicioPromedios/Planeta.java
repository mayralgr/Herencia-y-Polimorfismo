import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
   ArrayList <Pais> paises;
    
    public Planeta()
    {
        paises = new ArrayList<Pais>();   
    }
    
    public void agregar(Pais p)
    {
        paises.add(p);
    }
    
    public float calculaPromedio()
    {
       return 0;
    }
}
