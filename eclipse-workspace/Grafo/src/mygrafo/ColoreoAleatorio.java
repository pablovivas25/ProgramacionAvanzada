package mygrafo;

public class ColoreoAleatorio {
	private GrafoNoDirigidoNoPonderado grafo;
	private int cantNodos;
	private int cantAristas;
	private int []colorNodo;
	
  public ColoreoAleatorio(GrafoNoDirigidoNoPonderado grafo) {
	int cantidadColores=0;
  }
  
  public static void main(String[] args) {
	  GrafoNoDirigidoNoPonderado grafo=new GrafoNoDirigidoNoPonderado("graph_2021_2C.in");
	  for(Nodo n:grafo.getNodos())
		  System.out.println(n.getNumero()+" "+n.getGrado());
}

}
