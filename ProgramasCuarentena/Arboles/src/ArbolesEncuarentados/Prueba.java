package ArbolesEncuarentados;

public class Prueba 
{
  public static void main(String arg[])
  {
  
  Arbol bonsai = new Arbol();
  
  bonsai.insertar(new Nodo(10));
  
  if(bonsai.buscar(new Nodo(10)))
  {
  System.out.println("El 10 si esta");
  }
  Nodo A;
  
  A=new Nodo(0);
  
  if(bonsai.buscar(new Nodo(0))){
  System.out.println("El " + A +" si esta");
  }
  else
  {
  System.out.println("El " + A + " no esta");
  }
  
  Nodo B=new Nodo(5);
  bonsai.insertar(B);
  if(bonsai.buscar(new Nodo(5)))
  {
  System.out.println("El nodo " + B + " si esta");
  }
  else
  {
  System.out.println("El nodo " + B + " no esta");
  }
  
  Nodo C=new Nodo(15);
  bonsai.insertar(C);
  if(bonsai.buscar(new Nodo(15))){
  System.out.println("El nodo " + C + " si esta");
  }else{
  System.out.println("El nodo " + C + " no esta");
  }
  
   Nodo D=new Nodo(4);
  bonsai.insertar(D);
  if(bonsai.buscar(new Nodo(4))){
  System.out.println("El nodo " + D + " si esta");
  }else{
  System.out.println("El nodo " + D + " no esta");
  }
   
   Nodo E=new Nodo(16);
  bonsai.insertar(E);
  if(bonsai.buscar(new Nodo(16))){
  System.out.println("El nodo " + E + " si esta");
  }else{
  System.out.println("El nodo " + E + " no esta");
  }
  
   Nodo F=new Nodo(8);
  bonsai.insertar(F);
  if(bonsai.buscar(new Nodo(8)))
  {
  System.out.println("El nodo " + F + " si esta");
  }else{
  System.out.println("El nodo " + F + " no esta");
  }
   
   Nodo G=new Nodo(11);
  bonsai.insertar(G);
  if(bonsai.buscar(new Nodo(11))){
  System.out.println("El nodo " + G + " si esta");
  }else{
  System.out.println("El nodo " + G + " no esta");
  }
  
  System.out.println(bonsai.toStringPreOrder());
  
    System.out.println(bonsai.toStringInOrder());
  
    System.out.println(bonsai.toStringPostOrder());
  }  
}
