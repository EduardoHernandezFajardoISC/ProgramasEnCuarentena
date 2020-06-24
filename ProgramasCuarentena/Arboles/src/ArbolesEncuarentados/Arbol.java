package ArbolesEncuarentados;

public class Arbol 
{
private Nodo raiz;
private String recorrido;

public Arbol()
{
raiz=null;
recorrido= " ";
}

private void insertarDesde(Nodo noda,Nodo Desde )
{

	if(Desde.obtenerData()==noda.obtenerData())
	{
	return;
	}
	if(noda.obtenerData()>Desde.obtenerData())
	{
	
	if(Desde.der == null)
	{
	Desde.der=noda;
	return;
	}
	else
	{
	insertarDesde(noda,Desde.der);
	return;
	}
	}
	else
	{
	
	if(Desde.izq == null)
	{
	Desde.izq=noda;
	return;
	}
	else
	{
	insertarDesde(noda,Desde.izq);
	return;
	}
	}
}

public void insertar(Nodo noda)
{
	if(raiz==null)
	{
	raiz=noda;
	return;
	}
 
insertarDesde(noda,raiz);
}

public boolean buscar(Nodo noba)
{
	return buscarDesde(noba,raiz);
	}
	private boolean buscarDesde(Nodo noba, Nodo Desde)
	{
	if(Desde==null)
	{
	return false;
	}
	
	if(Desde.obtenerData()==noba.obtenerData())
	{
	return true;
	}
	if(noba.obtenerData()>Desde.obtenerData())
	{
	
	return buscarDesde(noba,Desde.der);
	}
	else
	{
	
	return buscarDesde(noba,Desde.izq);
	}
}

public String toStringPreOrder()
{
	recorrido= " ";
	
	preOrderDesde(raiz);
	
	return recorrido;
	}
	
	private void preOrderDesde(Nodo desde)
	{
	if(desde==null)
	{
	return;
}

recorrido =recorrido +" "+desde;

preOrderDesde(desde.izq);

preOrderDesde(desde.der);
}
public String toStringInOrder()
{
	recorrido= " ";
	preInOrderDesde(raiz);
	return recorrido;
	}
	
	private void preInOrderDesde(Nodo desde)
	{
	if(desde==null)
	{
	return;
	}
	
	preInOrderDesde(desde.izq);
	
	recorrido =recorrido +" "+desde;
	
	preInOrderDesde(desde.der);

}

public String toStringPostOrder()
{
	recorrido= " ";
	prePostOrderDesde(raiz);
	return recorrido;
}

private void prePostOrderDesde(Nodo desde)
{
	if(desde==null)
	{
	return;
	}

	prePostOrderDesde(desde.izq);
	prePostOrderDesde(desde.der);
	recorrido =recorrido +" "+desde;

}
}
