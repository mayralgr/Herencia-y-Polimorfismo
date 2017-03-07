import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String[]args)
   {
       ArrayList <Alumno> alumnos;
       alumnos = new ArrayList <Alumno>();
       alumnos.add(new Alumno(150));
       alumnos.add(new Alumno(75));
       alumnos.add(new Alumno(80));
       alumnos.add(new Alumno(250));
       alumnos.add(new Alumno(190));
       
       Alumno [] arrAlumnos;
       arrAlumnos = new Alumno[alumnos.size()];
       arrAlumnos = alumnos.toArray(arrAlumnos);
       Arrays.sort(arrAlumnos);
       
       for(Alumno a: alumnos)
       {
           System.out.println(a);
        }
       
       for(Alumno a: arrAlumnos)
       {
           System.out.println(a);
        }
    }
}
