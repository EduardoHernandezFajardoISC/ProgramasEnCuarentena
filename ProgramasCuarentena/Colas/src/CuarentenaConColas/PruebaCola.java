//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package CuarentenaConColas;
import java.util.*;
public class PruebaCola 
{
    public static void main(String arg[])
    {
        int Num=0;
        int b,c;       
        Scanner a = new Scanner(System.in);
        System.out.println("Plocs, ingrese la cantidad de numeros que quiere");
         b=a.nextInt();
        
    ColaEntera cl = new ColaEntera(b);
    try
    {
        for(int i=0;i<b;i++)
        {
        	System.out.println("Porfas, ingrese elnumero");    
        	c=a.nextInt();
        	cl.enconlar(c);   
        }
    
    for(int i=0;i<b;i++)
    {
     Num = cl.sacar();
     System.out.println("The number is: " + Num);
    }
    }
    catch(ExcepcionColaLlena Err)
    {
     System.out.println(Err.getMessage());
    
    }
    	catch(ExcepcionColaVacia Err)
    {
    
    		System.out.println(Err.getMessage());
    
    }
    } 
}
