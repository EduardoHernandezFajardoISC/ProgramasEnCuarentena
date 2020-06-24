package cuarentena;

public class Lista2link 
{ 
 private Nodo inicio; 
 private Nodo Fin;
 private int SinElementos;
 
 
 public Lista2link()
 {
	inicio = null;
	Fin = null;
	SinElementos = 0;
 }
 
 public int obtenerNoElementos(){
 return SinElementos;
 }
 public void agregarAlInicio(Nodo Ag)
 {
    
	 if(inicio==null)
	 {
		 inicio=Ag;
		 Fin=Ag;
		 SinElementos++;
	 }
 
	 else
		 
	 { 
	 Ag.Siguiente=inicio;
	 inicio.Anterior=Ag;
	 inicio=Ag;
	 SinElementos++;
	  }
 
 }
 
 public void agregarAlFin(Nodo Ag)
 {
      
	 if(Fin==null)
		 {
		 Fin=Ag;
		 inicio=Ag;
		 SinElementos++;
		 }
	 else
		 {
		 Fin.Siguiente=Ag;
		 Ag.Anterior=Fin;
		 Fin=Ag;
		 SinElementos++;
		 }
 
 }
 
 public boolean Buscar(Nodo Ab){
   
 if(Ab !=null )
 {
     if(inicio!=null)
     {
	     if(inicio.obtenerData()==Ab.obtenerData())
	     {
	     return true;
	     }
     }
     if(Fin!=null)
	 {
	     if(Fin.obtenerData()==Ab.obtenerData())
	     {
	     return true;
	     }
     }
   
 Nodo ref=inicio;
 boolean Encontrado=false;
 while((ref != null) && !Encontrado)
 {
  
	 if(ref.obtenerData()==Ab.obtenerData())
	 {
	 
	    Encontrado= true;
	
	 }
	 
	 ref=ref.Siguiente;
	 
	 }
	 
	 return Encontrado;
	 
	 }
 
 return false;
 }
 
 public Nodo EliminarInicio()
 {
     if(inicio==null)
     {
     return null;
     }
     else
     {
	 Nodo Ret=inicio;
	 inicio=inicio.Siguiente;
	 inicio.Anterior=null;
	 Ret.Siguiente=null;
	 Ret.Anterior=null;
	 SinElementos--;
	    return Ret;
     }

 }
 
 public Nodo EliminarFin()
 {
	 if(Fin==null)
	 {
	 return null;
	 }
	 else
	 {
	 
	 
	
	 Nodo eliminar = Fin;
	 Fin =Fin.Anterior;
	 Fin.Siguiente=null;
	 
	 eliminar.Siguiente=null;
	 eliminar.Anterior=null;
	 
	 SinElementos--;
	 return eliminar;
	 }
 
 }
public Nodo EliminarPorNodo(Nodo AB)
{
    if(AB ==null)
    {
    return null; 
    }   
    
 
    if(Fin==null)
    {
 
    	return null;
 
    }
    else
    {

  
    	if(inicio.obtenerData()==AB.obtenerData())
    	{
  
    		return this.EliminarInicio();
  
    
    	}
    	
     if(Fin.obtenerData()==AB.obtenerData())
     {
  
    	 return this.EliminarFin();

     }

     
 Nodo refRojo=inicio;
 Nodo refAzul=null;
 Nodo refElim=null;
 boolean Encontrado=false;
 while((refRojo!= null) && !Encontrado){
     if(refRojo.obtenerData()==AB.obtenerData())
     {
	     Encontrado=true;
	     refElim=refRojo;
	     SinElementos--;
     }
     
     refRojo=refRojo.Siguiente;
 }
	 if(Encontrado)
	 {
		 refRojo = refElim.Anterior;
		 refAzul=refElim.Siguiente;
		 refRojo.Siguiente=refAzul;
		 refAzul.Anterior=refRojo;
		 refElim.Siguiente=null;
		 refElim.Anterior=null;        
	 }
 
 return refElim;
 
    }
 } 

public String toString()
{
String temp = " ";
if(inicio == null)
{

	return " ";

}
Nodo ref = inicio;
while(ref != null)
{
temp=temp + " "+ref.toString();
ref=ref.Siguiente;
}
return temp;
}

public String toStringReverse()
{
String temp = " ";
if(Fin == null)
{

	return " ";

}
Nodo ref = Fin;
while(ref != null)
{
temp=temp + " "+ref.toString();
ref = ref.Anterior;
}
return temp;
}

 public Nodo PorIndice(int p)
 {
 if(inicio == null)
 {
 return null;
 }
 if(p>=SinElementos)
 {
 return null;
 }
  if(p<0)
  {
 return null;
  }
  int i = 0;
  Nodo ref = inicio;
  for(;i<p;i++)
  {
  ref = ref.Siguiente;
  }
  ref = new Nodo(ref.obtenerData());
  return ref;
 }
}
