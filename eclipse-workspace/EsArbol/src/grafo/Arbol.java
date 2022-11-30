package grafo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Arbol {
	private Grafo migrafo;
	private List<Nodo> regla1;
	private List<Nodo> regla2;
	private List<Nodo> regla3;
	private int [] vectNodos;
	private boolean[]estados;
	
	private boolean cumpleregla1=false;
	private boolean cumpleregla2=false;
	private boolean cumpleregla3=false;
	private boolean esarbol=false;
	
	public Arbol(Grafo g) {
		this.migrafo=g;
		this.regla1=new ArrayList<Nodo>();
		this.regla2=new ArrayList<Nodo>();
		this.regla3=new ArrayList<Nodo>();
		this.vectNodos=new int[this.migrafo.getCantNodos()];
		this.estados=new boolean[this.migrafo.getCantNodos()];
		this.cargarGrados();
		///Arrays.sort(this.vectNodos);
		
	}
	public void cargarGrados() {
		for(Arista a:this.migrafo.getAristas()) {
			this.vectNodos[a.getNodo2().getNumero()-1]+=1;
		}
	}
	
	
	public boolean isCumpleregla1() {
		return cumpleregla1;
	}
	
	public boolean isCumpleregla2() {
		return cumpleregla2;
	}
	
	public boolean isCumpleregla3() {
		return cumpleregla3;
	}
	public List<Nodo> getRegla1() {
		return regla1;
	}
	public Nodo  regla1() {
		Nodo n=null;
		
		for(int i=0;i<this.vectNodos.length;i++) {
			if(this.vectNodos[i] == 0)
				n=new Nodo(i+1);
		}
		return n;
	}
	
	public ArrayList<Nodo> regla2(Nodo raiz){
		
		ArrayList<Nodo> lista=new ArrayList<Nodo>();
		
		for(int i=0;i<this.vectNodos.length;i++) {
			if(this.vectNodos[i]!=1) {
				if(raiz!=null && raiz.getNumero()-1!=i)
					lista.add(new Nodo(i+1));
				else
					lista.add(new Nodo(i+1));
			}
					
					
			
		}
		return lista;
	}
	
	public ArrayList<Nodo> regla3() {
		ArrayList<Nodo> regla3=new ArrayList<Nodo>();
		for(int i=0;i<this.estados.length;i++) {
			if(this.estados[i]!=true)
				regla3.add(new Nodo(i+1));
		}
		return regla3;
	}
	
	public void bfs() {
		Queue<Integer>cola=new LinkedList();
		cola.offer(this.regla1.get(0).getNumero());
		estados[this.regla1.get(0).getNumero()-1]=true;
		while(!cola.isEmpty()){
			int nodo=cola.peek();
			for(int i=1;i<=this.migrafo.getCantNodos();i++){
				if(nodo!=i&&estados[i-1]==false){
					if(this.migrafo.getGrafo().hayArista(nodo,i)==true){
						estados[i-1]=true;
						cola.offer(i);
					}
				}
			}
			nodo=cola.poll();
			estados[nodo-1]=true;
		}
	}
	public void resolver() {
		//grafo con un nodo o ningun 
		if(this.migrafo.getCantNodos()<=1)
			this.esarbol=true;
		///REGLA1
		Nodo raiz= this.regla1();
		
		if(raiz!=null) {
			this.cumpleregla1=true;
			//System.out.println("Nodo raiz "+" "+raiz.getNumero());
			this.regla1.add(raiz);
		}
		
		//REGLA2
		ArrayList<Nodo> listaregla2=this.regla2(raiz);
		
		if(listaregla2.size()==0) {
			this.cumpleregla2=true;
		}
		
		if(this.cumpleregla1==true) {
			this.bfs();
			this.regla3=this.regla3();
		}
		
		/*
		if(this.regla3.size()==0)
			this.cumpleregla3=true;
		*/	
		/*
		for(int i=0;i<this.estados.length;i++)
			System.out.println(i + " "+this.estados[i]);
		*/	
	}
	public void mostrarVecNodos() {
		for(int i=0;i<this.vectNodos.length;i++)
			System.out.println(i+" "+this.vectNodos[i]);
	}
	
	public static void main(String[] args) {
		Grafo gp=new Grafo("Archivos/Entrada/enunciado.in");
		Arbol a=new Arbol(gp);
		//a.mostrarVecNodos();
		a.resolver();
		
		System.out.println("Cumple regla1 true/false "+" "+a.isCumpleregla1());
		System.out.println("Cumple regla2 true/false "+" "+a.isCumpleregla2());
		System.out.println("Cumple regl3 true/false "+" "+a.isCumpleregla3());
		
	}
	
}
