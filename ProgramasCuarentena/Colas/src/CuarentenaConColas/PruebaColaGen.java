//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package CuarentenaConColas;
public class PruebaColaGen {
    public static void main(String args[]){
    ColaGen<Integer> PI = new ColaGen<>(10);
    
    try{
    PI.enconlar(100);
    PI.enconlar(40);
    int v=PI.sacar();
    System.out.println(v);
    }catch(ExcepcionColaLlena Err){
     System.out.println(Err.getMessage());
     }catch(ExcepcionColaVacia Err){
     System.out.println(Err.getMessage());
     }
    ////////////////////STRING/////////
    ColaGen<String> PS = new ColaGen<>(10);
  
  try{
  PS.enconlar("Hola");
  PS.enconlar("Mundo");
  String S= PS.sacar();
  System.out.println(S);
  
  
  }catch(ExcepcionColaLlena Err){
  System.out.println(Err.getMessage());
  }catch(ExcepcionColaVacia Err){
  System.out.println(Err.getMessage());
  }
  
  ////////////////////DOUBLE//////////////
  ColaGen<Double> PD= new ColaGen<>(10);
  
   try{
  PD.enconlar(50.5);
  PD.enconlar(1.0);
  Double x= PD.sacar();
  System.out.println(x);
  
  
  }catch(ExcepcionColaLlena Er){
  System.out.println(Er.getMessage());
  }catch(ExcepcionColaVacia Er){
  System.out.println(Er.getMessage());
  }
      
}
}
