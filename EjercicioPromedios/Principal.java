
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
        Medible[] cuentas = new Medible[3];
        
        cuentas[0]=new CuentaBancaria(100);
        cuentas[1]=new CuentaBancaria(200);
        cuentas[2]=new CuentaBancaria(300);

        System.out.println("Promedio de cuentas Bancarias: " + Utileria.calculaPromedio(cuentas));
        
        Medible[] paises = new Medible[3];
       
        paises[0]= new Pais(25);
        paises[1]= new Pais(32);
        paises[2]= new Pais(94);
        
        System.out.println("Promedio de habitantes: " + Utileria.calculaPromedio(paises));
        
        
    }
}
