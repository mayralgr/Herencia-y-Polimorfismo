
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
        
        System.out.println("Promedio de cuentas Bancarias: " + b.calculaPromedio());
        
        Planeta pl = new Planeta();
        Pais p = new Pais(25);
        Pais p1 = new Pais(32);
        Pais p2 = new Pais(94);
        
        pl.agregar(p);
        pl.agregar(p1);
        pl.agregar(p2);
        System.out.println("Promedio de habitantes: " + pl.calculaPromedio());
        
        
    }
}
