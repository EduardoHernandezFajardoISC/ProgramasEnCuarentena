package CuarentenaylaNotacionPolaca;
import Colas.*;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class PruebaCola 
{
  public static void main(String []args)throws IOException
  {
	  
   Scanner a = new Scanner(System.in);
   ColaGen cl = new ColaGen(5);
   
    int opc;
    double b=0,c=0,d=0;
    double res;
   
   try
   {
      
	   System.out.println("Calculadora Notacion Polaca"); 
	   for(int i=1;i<=5;i++)
	   {
       
		   System.out.println("Ingresa el operando "+i);       
		   b= a.nextDouble();
		   cl.enconlar(b);
   
	   }
   
	   System.out.println("Operaciones disponibles ");  
	   System.out.println("1. Suma, 2. Resta, 3. Mutiplicacion, 4. Division");
	   System.out.println("¿Cual quiere que se realice? ");
	   
  
	   opc=a.nextInt();
 
	   switch(opc){
  
      case 1:
        
          while(!cl.colaVacia()){
              d=d+(double)cl.sacar();  
          }
          cl.enconlar(d);

          res=(double)cl.sacar();
          System.out.println("El resultado es: "+res);
          break;
          
      case 2:
           while(!cl.colaVacia()){
              d=d-(double)cl.sacar();  
          }
          cl.enconlar(d);

          res=(double)cl.sacar();
          System.out.println("El resultado es: "+res);
          break;
          
      case 3:
          d=1;
              while(!cl.colaVacia()){
   d=(d)*((double)cl.sacar()); 
    }
 cl.enconlar(d);

res=(double)cl.sacar();
System.out.println("El resultado es: "+res);
          break;
  
      case 4:
          d=1;
          while(!cl.colaVacia()){
   d=d/(double)(cl.sacar()); 
    }
          cl.enconlar(d);

res=(double)cl.sacar();
System.out.println("El resultado es: "+res);
          break;
  
  }
  
  }catch(ExcepcionColaLlena Err){
    System.out.println(Err.getMessage());
  }catch(ExcepcionColaVacia Err){
System.out.println(Err.getMessage());
}
  } 
   
}
