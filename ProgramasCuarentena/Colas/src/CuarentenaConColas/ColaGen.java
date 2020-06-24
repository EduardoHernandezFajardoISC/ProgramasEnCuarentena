//este programa es propiedad de: Barr�n Hern�ndez Edgar & Hern�ndez Fajardo Eduardo 
//ajeno a cualquier partido pol�tico. 
//Queda prohibido el uso para fines distintos a los establecidos en el programa.
package CuarentenaConColas;

public class ColaGen <T>
{
    private T Esq[];
    private int Enf;
    private int Sig;
    
    public ColaGen(int N)
    {
   Esq = (T[])new Object[N];
   Sig = 0;
    Enf=-1;
    }
    public boolean colaLlena()
    {
	    if(Sig ==  Esq.length)
	    {
	    return true;
	    }
	    else
	    {
	    return false;
	    }	
    }
    
    public void enconlar(T Num)throws ExcepcionColaLlena
    {
        if(colaVacia())
        {
        	Enf = -1;
        	Sig=0;
        }   
        if(colaLlena())
        {
        	throw new ExcepcionColaLlena();
        }
    Esq[Sig]=Num;
    Sig++;
     
	    if(Sig == 1)
	    {
	    	Enf=0;
	    }
    }
    public boolean colaVacia()
    {
	    if(Enf==Sig)
	    {
	    return true;
	    }else if(Enf == -1)
	    {
	    return true;
	    }
	    else
	    {
	    return false;
	    }
    }
    
    public T sacar()throws ExcepcionColaVacia
    {
        if(colaVacia())
        {
        throw new ExcepcionColaVacia();
        }
    T valor = Esq[Enf];
    Enf++;
    return valor;
    }
}
