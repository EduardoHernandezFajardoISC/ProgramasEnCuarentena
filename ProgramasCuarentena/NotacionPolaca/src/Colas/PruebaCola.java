package Colas;
import java.util.*;

public class PruebaCola 
{
    public static void main(String arg[])
    {
        int Num=0;
        int b,c;
        
        Scanner a = new Scanner(System.in);
         
        System.out.println("Ingrese la cantidad de numeros que quiere");
         b=a.nextInt();
        
    ColaEntera cl = new ColaEntera(b);
    try
    {
        for(int i=0;i<b;i++)
        {
	    
        	System.out.println("Ingrese elnumero");    
        	c=a.nextInt();
        	cl.enconlar(c);
	    
        }
    
    for(int i=0;i<b;i++)
    {
    
     Num = cl.sacar();
     System.out.println("EL numero es: " + Num);
   
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
