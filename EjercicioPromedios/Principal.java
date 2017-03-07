
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
        Banco b = new Banco();
        
        CuentaBancaria cb1=new CuentaBancaria(100);
        CuentaBancaria cb2=new CuentaBancaria(200);
        CuentaBancaria cb3=new CuentaBancaria(300);
        
        b.agregar(cb1);
        b.agregar(cb2);
        b.agregar(cb3);
        System.out.println("Promedio de cuentas Bancarias: " + b.calculaPromedio());
        
       Planeta  p= new Planeta();
        
        Pais p1=new Pais(25);
        Pais p2=new Pais(32);
        Pais p3=new Pais(94);
        p.agregar(p1);
        p.agregar(p2);
        p.agregar(p3);
        System.out.println("Promedio de cuentas Bancarias: " + p.calculaPromedio());
    }
}
