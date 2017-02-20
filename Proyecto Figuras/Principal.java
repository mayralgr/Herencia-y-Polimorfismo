
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
        Triangulo t1= new Triangulo(3,4);
        t1.calculaArea();
        System.out.println("El área del triangulo es : " + t1.accedeArea());
        Cuadrado c1 = new Cuadrado(5);
        c1.calculaArea();
        System.out.println("El área del cuadrado es : " + c1.accedeArea());
        Circulo c = new Circulo(3);
        c.calculaArea();
        System.out.println("El área del circulo es : " + c.accedeArea());
    }
}
