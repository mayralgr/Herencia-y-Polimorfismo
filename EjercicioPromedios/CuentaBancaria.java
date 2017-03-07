
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria implements Medible
{
   private int saldo;
   
   public CuentaBancaria(int s)
   {
       saldo=s;
    }
    
   public int obtenerMedida()
   {
       return saldo;
    }
}
