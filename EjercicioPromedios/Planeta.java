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
        int s=0;
        Iterator <Pais> it =paises.iterator();
        while(it.hasNext())
        {
            Pais p = it.next();
            s+=p.regresaHab();
        }
       return (float)s/paises.size();
    }
}
