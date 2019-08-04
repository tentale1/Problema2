import java.util.Scanner;

/**
 * Programa para hallar eficiencia de combustible en colombia
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class Eficiencia
{
    public static void main(String[] args)
    {
        double gal=0,mill=0,mpg,lpk;
        
        Scanner Teclado = new Scanner (System.in);
        
        while ( -1 != gal)
        {
            System.out.println("Por favor inserte la cantidad de galones");
            gal=Teclado.nextDouble();
            System.out.println("Por favor inserte las millas que recorrera");
            mill=Teclado.nextDouble();
            
            mpg=mill/gal;
            lpk=mpg*2.352;
        
            System.out.println("la eficiencia del vehiculos en MPG es " + mpg);
            System.out.println("la eficiencia del vehiculos en LPK es " + lpk);
        }
        
        
              
    }
}
