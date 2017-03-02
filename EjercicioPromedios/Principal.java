
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args)
    {
        Banco b=new Banco();
        CuentaBancaria cb=new CuentaBancaria(100);
        CuentaBancaria cb1=new CuentaBancaria(200);
         CuentaBancaria cb2=new CuentaBancaria(300);
        b.agregar(cb);
        b.agregar(cb1);
        b.agregar(cb2);
        float s;
        
        s=b.calculaPromedio();
        System.out.println("Promedio de cuentas Bancarias: " + s);
    }
}
