import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Arbol {
	private Grafo g;
	private ArrayList<Nodo> condicion1;
	private ArrayList<Nodo> condicion2;
	private ArrayList<Nodo> raices;
	private ArrayList<Nodo> condicion3;
	private boolean[] visitados;

	public Arbol(Grafo g) {
		this.g = g;
		this.condicion1 = new ArrayList<Nodo>();
		this.condicion2 = new ArrayList<Nodo>();
		this.condicion3 = new ArrayList<Nodo>();
		this.raices = new ArrayList<Nodo>();
		this.visitados = new boolean[this.g.getCantidad_nodos()];
	}

	public boolean codicion1() {

		for (Nodo n : this.g.getListado_nodos()) {
			if (n.getGrado() == 0) {
				this.condicion1.add(n);
				this.raices.add(n);
			}
				
		}
		
		System.out.println("tam, "+this.condicion1.size());
		/*
		for(Nodo aux:this.condicion1)
			System.out.println("n "+aux.getNumero());
			*/
	if( this.condicion1.size() == 1)
		return true ;
	else
		return  false;
	}

	public boolean codicion2() {
		for (Nodo n : this.g.getListado_nodos()) {
			if (n.getGrado() != 1 && n.getGrado()!=0) {
				this.condicion2.add(n);
			}

		}
		return this.condicion2.size() == 0 ? true : false;
	}

	public void bfs() {
		Queue<Integer> cola = new LinkedList();
		boolean algo=this.codicion1();
		

		cola.offer(this.raices.get(0).getNumero());

		this.visitados[this.raices.get(0).getNumero() - 1] = true;

		while (!cola.isEmpty()) {
			Integer aux = cola.poll();

			for (int k = 0; k < this.g.getListado_nodos().size(); k++) {

				if (this.g.getMatriz_adyacencia()[aux-1][k] == true) {

					if (this.visitados[k] == false) {
						cola.add(k + 1);
						this.visitados[k] = true;
					}

				}

			}

		}

	}

	public boolean codicion3() {
		boolean respuesta = true;
		if (this.raices.size() > 1)
			return false;
		this.bfs();

		for (int i = 0; i < this.visitados.length; i++) {
			if (this.visitados[i] == false)
				this.condicion3.add(new Nodo(i + 1));
		}
		return this.condicion3.size() != 0 ? false : true;

	}

	public boolean resolver() {
	  boolean respu1=this.codicion1();
	  boolean respu2=this.codicion2();
	  boolean respu3=this.codicion3();
	  
	  return respu1 && respu2 && respu3;
	}

	public void escribirArchivo(String path) {
		try {
			PrintWriter pr = new PrintWriter(new File(path));
			boolean resolver = this.resolver();
			if (resolver == true)
				pr.print("SI");
			else {
				pr.println("NO");
				
				if (this.condicion1.size() == 0) {
					pr.println("0");
				}

				else {
					for (int i = 0; i < this.condicion1.size(); i++) {
						pr.print(this.condicion1.get(i).getNumero() + " ");
					}
					pr.println();

				}
				if (this.condicion2.size() == 0)
					pr.println("0");
				else {
					for (int j = 0; j < this.condicion2.size(); j++) {
						pr.print(this.condicion2.get(j).getNumero() + " ");
					}
					pr.println();
				}

				if (this.condicion3.size() == 0)
					pr.println("0");
				else {
					for (int k = 0; k < this.condicion3.size(); k++) {
						pr.print(this.condicion2.get(k).getNumero() + " ");
					}
					pr.println();
				}
			}
			pr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public ArrayList<Nodo> getRaices() {
		return raices;
	}

	public static void main(String[] args) {
		Grafo a = Grafo.leerGrafo("./PreparacionPrueba/LotePrueba/Entrada/grafo.in");
		Arbol arbol = new Arbol(a);

		//System.out.println(arbol.codicion1());
		arbol.escribirArchivo("./PreparacionPrueba/LotePrueba/SalidaEsperada/grafo.out");
	
	
	}

	public boolean[] getVisitados() {
		return visitados;
	}
}
