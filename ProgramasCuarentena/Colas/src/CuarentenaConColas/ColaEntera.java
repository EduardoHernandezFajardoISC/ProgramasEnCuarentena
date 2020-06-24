//este programa es propiedad de: Barrón Hernández Edgar & Hernández Fajardo Eduardo 
//ajeno a cualquier partido político. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package CuarentenaConColas;

public class ColaEntera 
{
    
    private int Esq[];
    private int Enfrente;
    private int Sig;
    public ColaEntera(int n)
    {

    	Esq = new int[n];
    	Sig = 0;
    	Enfrente=-1;
	    
    }
		    public boolean colaLlena()
		    {
			    if(Sig == Esq.length)
			    {
			    return true;
			    }
			    else
			    {
			    return false;
			    }
	    
		    }
    public void enconlar(int Num)throws ExcepcionColaLlena
    {
	        if(colaVacia())
	        {
	        	Enfrente =-1;
	        Sig = 0;
	        }
	        if(colaLlena())
	        {
	        throw new ExcepcionColaLlena();
	        }
	    
	        Esq[Sig]=Num;
	        Sig++;
	    
		    if(Sig==1)
		    {
		    	Enfrente = 0;
		    }
    }
    public boolean colaVacia()
    {
	    if(Enfrente == Sig)
	    {
	    return true;
	    }
	    else if(Enfrente==-1)
	    {
	    return true;
	    }
	    else
	    {
	    return false;
	    }
    }
    public int sacar()throws ExcepcionColaVacia
    {
        if(colaVacia())
        {
        throw new ExcepcionColaVacia();
        }
    int valor= Esq[Enfrente];
    Enfrente++;
    return valor;
    }
    public int ObtenerFrente() 
    {
		return Enfrente;
	}
    public boolean Espacio() 
    { 
	    int PosicionesVaciasFrente;
	    PosicionesVaciasFrente=((Enfrente+1)%Esq.length);
	      if(PosicionesVaciasFrente>0) 
	      {
		     return true;
	       }
	      else 
	      {		  
	    	  return false;
	      }
       }
}
