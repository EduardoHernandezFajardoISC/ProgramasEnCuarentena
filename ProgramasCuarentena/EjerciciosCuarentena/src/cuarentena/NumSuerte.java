package cuarentena;

import java.io.*;
import java.util.*;

public class NumSuerte 
{

	public static void main(String arg[])throws IOException
	{

		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		Lista2link suerte = new Lista2link();
		Random c = new Random();

		int a=0,b,var,Elemento;


for(int i=1;i<=5;i++)
{
	System.out.println("Ingresa un numero");
	a=Integer.parseInt(leer.readLine());
	suerte.agregarAlInicio(new Nodo<Integer>(a));
	}


do
{   
	System.out.println("Quiere  un numero mas?" + " Si= 1 y No = 2");
	var = Integer.parseInt(leer.readLine());
	if(var == 1)
	{
	System.out.println("Ingresa un numero: ");
	a=Integer.parseInt(leer.readLine());
	suerte.agregarAlInicio(new Nodo<Integer>(a));
	}

}
while(var == 1);




System.out.println("Losnumeros son");
System.out.println(suerte.toStringReverse());
System.out.println(suerte);

System.out.println("cargando...");
Elemento=(suerte.obtenerNoElementos())-1;

for(int i=0;i<Elemento;i++)
{
	b=c.nextInt(2);
	
	
	if(b==0)
	{
		suerte.EliminarInicio();
	}
		if(b==1)
		{
		suerte.EliminarFin();
		}
}

	System.out.println("Elnumero de la suerte es: "+suerte);

	}    
}
