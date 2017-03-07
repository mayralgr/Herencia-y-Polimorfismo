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
        CuentaBancaria[] arrCuentas;
        arrCuentas = new CuentaBancaria[cb.size()];
        /*for(int i=0;i<cb.size();i++)
        {
            arrCuentas[i]=cb.get(i);
        }*/
        arrCuentas=cb.toArray(arrCuentas);
       return Utileria.calculaPromedio(arrCuentas);
    }
}
