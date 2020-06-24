package Colas;

public class PruebaColaGen 
{
    public static void main(String arg[])
    {
    ColaGen<Integer> PI = new ColaGen<>(10);
    
    try
    {
    PI.enconlar(100);
    PI.enconlar(40);
    int v=PI.sacar();
    System.out.println(v);
    }
    catch(ExcepcionColaLlena Err)
    {
     System.out.println(Err.getMessage());
     }
    catch(ExcepcionColaVacia Err)
    {
    
    	System.out.println(Err.getMessage());
    
    }
    
    ColaGen<String> PS = new ColaGen<>(10);
  
  try
  {
  PS.enconlar("Hola");
  PS.enconlar("mundo");
  String S= PS.sacar();
  System.out.println(S);
  
  
  }
  catch(ExcepcionColaLlena Err)
  {
  System.out.println(Err.getMessage());
  }
  catch(ExcepcionColaVacia Err)
  {
  System.out.println(Err.getMessage());
  }
  
  ColaGen<Double> PD= new ColaGen<>(10);
  
   try
   {
  
	   PD.enconlar(50.5);
	   PD.enconlar(1.0);
	   Double x= PD.sacar();
	   System.out.println(x);
   
   }
   catch(ExcepcionColaLlena Er)
   {
  System.out.println(Er.getMessage());
  
   }
   catch(ExcepcionColaVacia Er)
   {
  
	   System.out.println(Er.getMessage());
  
   }
      

    }
}
