
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
        Figura [] fig;
        fig = new Figura[3];
        
        Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(5);
        Circulo ci1 = new Circulo(3);
        
        fig[0]= t1;
        fig[1] = c1;
        fig[2] = ci1;
        
        for(int i=0; i<fig.length;i++)
        {
            fig[i].calculaArea();
        }
        
        for(int i=0; i<fig.length;i++)
        {
             System.out.println("El área es : " + fig[i].accedeArea());
        }

    }
}
