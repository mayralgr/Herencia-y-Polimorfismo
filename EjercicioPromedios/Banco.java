import java.util.ArrayList;
import java.util.Iterator;
/**

 */
public class Banco
{
    // instance variables - replace the example below with your own
    ArrayList <CuentaBancaria> cb;
    
    public Banco()
    {
        cb = new ArrayList<CuentaBancaria>();
        
    }
    
    public void  agregar(CuentaBancaria b)
    {
        cb.add(b);
    }
    
    public float calculaPromedio()
    {
        float s=0;
        Iterator <CuentaBancaria> it =cb.iterator();
        while(it.hasNext())
        {
            CuentaBancaria c = it.next();
            s+=(float)c.regresaSaldo();
        }
       return s/cb.size();
    }
}
