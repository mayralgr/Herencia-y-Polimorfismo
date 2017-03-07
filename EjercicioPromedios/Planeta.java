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
       Pais[] p;
        p = new Pais[paises.size()];
        /*for(int i=0;i<cb.size();i++)
        {
            arrCuentas[i]=cb.get(i);
        }*/
        p=paises.toArray(p);
       return Utileria.calculaPromedio(p);
    }
}
